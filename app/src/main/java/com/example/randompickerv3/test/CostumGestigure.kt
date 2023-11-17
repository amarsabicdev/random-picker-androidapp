package com.example.randompickerv3.test

import android.app.Dialog
import android.content.Context
import android.util.Log
import android.view.GestureDetector
import android.view.MotionEvent
import android.view.View
import android.widget.Button
import android.widget.EditText
import com.example.randompicker.Users.User
import com.example.randompickerv3.R
import com.example.randompickerv3.Users.UserViewModel
/*
calling the click event class
 */
class CustomGesture(view: View,user : User,userViewModel: UserViewModel) : GestureDetector(view.context, CustomGestureListener(view,user,userViewModel)) {

     var viewE: View

    init {

        this.viewE = view
    }

     class CustomGestureListener(view : View,user: User,userViewModel: UserViewModel) : SimpleOnGestureListener() {
         var viewCG : View
         var userCG : User
         var userViewModelCG : UserViewModel
          var contextCG: Context
        init {
            this.viewCG=view
            this.userCG=user
            this.userViewModelCG=userViewModel
            this.contextCG = view.context
        }

       /*
            function that is called on a long click of the passed view
        */
        override fun onLongPress(e: MotionEvent) {


            var dialog = Dialog(contextCG)
            dialog.setContentView(R.layout.test_popupview)

            var popTXName= dialog.findViewById<EditText>(R.id.popUpTextName)
            var popTXNumber= dialog.findViewById<EditText>(R.id.popUpTextNumber)
            var popButtonDelete = dialog.findViewById<Button>(R.id.buttonPopupUpdate)

            popTXName.setText(userCG.ime)
            popTXNumber.setText(userCG.bTelefona)

                popButtonDelete.setOnClickListener {


                     userViewModelCG.updateUser(
                         User(
                         userCG.id,
                         popTXName.text.toString(),
                         popTXNumber.text.toString()
                     )
                      )
                    dialog.dismiss()
                }
            dialog.show()
       }
    }
}