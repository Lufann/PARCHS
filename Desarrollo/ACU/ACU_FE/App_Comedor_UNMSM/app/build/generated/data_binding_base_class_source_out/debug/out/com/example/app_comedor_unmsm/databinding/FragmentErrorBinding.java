// Generated by view binder compiler. Do not edit!
package com.example.app_comedor_unmsm.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ScrollView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.example.app_comedor_unmsm.R;
import com.google.android.material.textfield.TextInputEditText;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class FragmentErrorBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final ConstraintLayout errorFragment;

  @NonNull
  public final ImageView errorGusanito;

  @NonNull
  public final TextInputEditText errorTextInput;

  @NonNull
  public final ScrollView scrollView2;

  @NonNull
  public final Button sendBugBtn;

  private FragmentErrorBinding(@NonNull ConstraintLayout rootView,
      @NonNull ConstraintLayout errorFragment, @NonNull ImageView errorGusanito,
      @NonNull TextInputEditText errorTextInput, @NonNull ScrollView scrollView2,
      @NonNull Button sendBugBtn) {
    this.rootView = rootView;
    this.errorFragment = errorFragment;
    this.errorGusanito = errorGusanito;
    this.errorTextInput = errorTextInput;
    this.scrollView2 = scrollView2;
    this.sendBugBtn = sendBugBtn;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static FragmentErrorBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static FragmentErrorBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.fragment_error, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static FragmentErrorBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      ConstraintLayout errorFragment = (ConstraintLayout) rootView;

      id = R.id.errorGusanito;
      ImageView errorGusanito = ViewBindings.findChildViewById(rootView, id);
      if (errorGusanito == null) {
        break missingId;
      }

      id = R.id.errorTextInput;
      TextInputEditText errorTextInput = ViewBindings.findChildViewById(rootView, id);
      if (errorTextInput == null) {
        break missingId;
      }

      id = R.id.scrollView2;
      ScrollView scrollView2 = ViewBindings.findChildViewById(rootView, id);
      if (scrollView2 == null) {
        break missingId;
      }

      id = R.id.sendBugBtn;
      Button sendBugBtn = ViewBindings.findChildViewById(rootView, id);
      if (sendBugBtn == null) {
        break missingId;
      }

      return new FragmentErrorBinding((ConstraintLayout) rootView, errorFragment, errorGusanito,
          errorTextInput, scrollView2, sendBugBtn);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}