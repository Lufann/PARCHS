package com.example.app_comedor_unmsm.ui.ticket

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import api.HTTPClient
import com.example.app_comedor_unmsm.MainActivity
import com.example.app_comedor_unmsm.R
import com.example.app_comedor_unmsm.databinding.ActivityMostrarTicketBinding
import com.google.gson.Gson
import com.google.zxing.BarcodeFormat
import com.journeyapps.barcodescanner.BarcodeEncoder
import com.squareup.picasso.Picasso
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking
import models.Estudiante
import models.Ticket

class MostrarTicketActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMostrarTicketBinding
    var  data: String?=null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_mostrar_ticket)

        val bundle=intent.extras
        val boton = findViewById<Button>(R.id.buttonVolverMostrarTicket)

        boton.setOnClickListener{
            startActivity(Intent(this, MainActivity::class.java))
        }
        val textViewUserName = findViewById<TextView>(R.id.textUsernameMostrar)
        val textViewUserCode = findViewById<TextView>(R.id.textCodigoMostrar)
        val textViewUserShift = findViewById<TextView>(R.id.textTurnoMostrar)
        val textViewUserNumberShift = findViewById<TextView>(R.id.textTicketMostrar)
        val textViewUserRegisterHour = findViewById<TextView>(R.id.textFechaMostrar)
        val imgQr = findViewById<ImageView>(R.id.qrCode)
        val imgbarras = findViewById<ImageView>(R.id.imgbarras)
        val profileImage = findViewById<ImageView>(R.id.imageUser)


        val newClient =HTTPClient()

        runBlocking {
            launch {
                val ticket = newClient.getTicketInfo("20200023")
                val ticketInfo = Gson().fromJson(ticket, Ticket::class.java)
                println(ticketInfo.codigo_ticket)

                    textViewUserShift.setText("${ticketInfo.numero_turno}")
                    textViewUserNumberShift.setText("1")
                    textViewUserRegisterHour.setText("${ticketInfo.hora }")

                    try {
                        val barcodeEncoder = BarcodeEncoder()
                        val bitmap = barcodeEncoder.encodeBitmap(
                            "20200023",
                            BarcodeFormat.QR_CODE,
                            750,
                            750
                        )
                        imgQr.setImageBitmap(bitmap)
                    } catch (e: Exception) {
                        e.printStackTrace()
                    }

                    try {
                        val barcodeEncoder = BarcodeEncoder()
                        val bitmap1 = barcodeEncoder.encodeBitmap(
                            "20200023",
                            BarcodeFormat.CODE_39,
                            400,
                            80
                        )
                        imgbarras.setImageBitmap(bitmap1)
                    } catch (e: Exception) {
                        e.printStackTrace()
                    }
            }
            }
        }
}