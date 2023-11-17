// Generated by view binder compiler. Do not edit!
package com.example.randompickerv3.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.example.randompickerv3.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class FragmentShowPickedPlayerBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final ConstraintLayout frameLayout;

  @NonNull
  public final TextView textView;

  @NonNull
  public final TextView textView4;

  @NonNull
  public final TextView textViewShowPickedPlayer;

  private FragmentShowPickedPlayerBinding(@NonNull ConstraintLayout rootView,
      @NonNull ConstraintLayout frameLayout, @NonNull TextView textView,
      @NonNull TextView textView4, @NonNull TextView textViewShowPickedPlayer) {
    this.rootView = rootView;
    this.frameLayout = frameLayout;
    this.textView = textView;
    this.textView4 = textView4;
    this.textViewShowPickedPlayer = textViewShowPickedPlayer;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static FragmentShowPickedPlayerBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static FragmentShowPickedPlayerBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.fragment_show_picked_player, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static FragmentShowPickedPlayerBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      ConstraintLayout frameLayout = (ConstraintLayout) rootView;

      id = R.id.textView;
      TextView textView = ViewBindings.findChildViewById(rootView, id);
      if (textView == null) {
        break missingId;
      }

      id = R.id.textView4;
      TextView textView4 = ViewBindings.findChildViewById(rootView, id);
      if (textView4 == null) {
        break missingId;
      }

      id = R.id.textViewShowPickedPlayer;
      TextView textViewShowPickedPlayer = ViewBindings.findChildViewById(rootView, id);
      if (textViewShowPickedPlayer == null) {
        break missingId;
      }

      return new FragmentShowPickedPlayerBinding((ConstraintLayout) rootView, frameLayout, textView,
          textView4, textViewShowPickedPlayer);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
