// Generated by view binder compiler. Do not edit!
package com.example.randompickerv3.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatButton;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.example.randompickerv3.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class FragmentAdminLoginBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final AppCompatButton buttonLogin;

  @NonNull
  public final ConstraintLayout frameLayout2;

  @NonNull
  public final EditText ipPassword;

  @NonNull
  public final TextView textView5;

  @NonNull
  public final TextView textView8;

  private FragmentAdminLoginBinding(@NonNull ConstraintLayout rootView,
      @NonNull AppCompatButton buttonLogin, @NonNull ConstraintLayout frameLayout2,
      @NonNull EditText ipPassword, @NonNull TextView textView5, @NonNull TextView textView8) {
    this.rootView = rootView;
    this.buttonLogin = buttonLogin;
    this.frameLayout2 = frameLayout2;
    this.ipPassword = ipPassword;
    this.textView5 = textView5;
    this.textView8 = textView8;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static FragmentAdminLoginBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static FragmentAdminLoginBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.fragment_admin_login, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static FragmentAdminLoginBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.buttonLogin;
      AppCompatButton buttonLogin = ViewBindings.findChildViewById(rootView, id);
      if (buttonLogin == null) {
        break missingId;
      }

      ConstraintLayout frameLayout2 = (ConstraintLayout) rootView;

      id = R.id.ipPassword;
      EditText ipPassword = ViewBindings.findChildViewById(rootView, id);
      if (ipPassword == null) {
        break missingId;
      }

      id = R.id.textView5;
      TextView textView5 = ViewBindings.findChildViewById(rootView, id);
      if (textView5 == null) {
        break missingId;
      }

      id = R.id.textView8;
      TextView textView8 = ViewBindings.findChildViewById(rootView, id);
      if (textView8 == null) {
        break missingId;
      }

      return new FragmentAdminLoginBinding((ConstraintLayout) rootView, buttonLogin, frameLayout2,
          ipPassword, textView5, textView8);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}