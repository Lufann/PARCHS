// Generated by view binder compiler. Do not edit!
package com.example.app_comedor_unmsm.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.example.app_comedor_unmsm.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class InfoBurguermenuBinding implements ViewBinding {
  @NonNull
  private final LinearLayout rootView;

  @NonNull
  public final TextView textViewUserName;

  private InfoBurguermenuBinding(@NonNull LinearLayout rootView,
      @NonNull TextView textViewUserName) {
    this.rootView = rootView;
    this.textViewUserName = textViewUserName;
  }

  @Override
  @NonNull
  public LinearLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static InfoBurguermenuBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static InfoBurguermenuBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.info_burguermenu, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static InfoBurguermenuBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.textView_userName;
      TextView textViewUserName = ViewBindings.findChildViewById(rootView, id);
      if (textViewUserName == null) {
        break missingId;
      }

      return new InfoBurguermenuBinding((LinearLayout) rootView, textViewUserName);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
