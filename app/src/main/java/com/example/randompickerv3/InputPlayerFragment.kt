package com.example.randompickerv3

import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.util.Log
import android.view.GestureDetector
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.MotionEvent
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.viewModels
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.fragment.findNavController
import com.example.randompicker.Users.User
import com.example.randompicker.Users.UserDatabase
import com.example.randompickerv3.Users.UserViewModel
import com.example.randompickerv3.Users.UserViewModelFactory
import com.example.randompickerv3.databinding.FragmentInputPlayerBinding


class InputPlayerFragment : Fragment(), View.OnTouchListener {

    private var _binding: FragmentInputPlayerBinding? = null
    private val binding get() = _binding!!


    private lateinit var userViewModel: UserViewModel

    lateinit var handler: Handler

    private var isLongPress = false


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {


        _binding = FragmentInputPlayerBinding.inflate(inflater, container, false)
        val view = binding.root

        handler = Handler(Looper.getMainLooper())


        val dao = UserDatabase.getInstance(requireContext()).userdao
        val factory = UserViewModelFactory(dao)
        userViewModel = ViewModelProvider(this, factory).get(UserViewModel::class.java)



        binding.btnSumbitPlayer.setOnClickListener {


            if (!binding.ipNameSurname.text.isNullOrEmpty() && !binding.ipContactNumber.text.isNullOrEmpty()) {
                Log.i("inputTag","Input is : ${binding.ipNameSurname.text.toString()} \n ${binding.ipContactNumber.toString()}" )

                Log.i("inputTag","Entering the student into the database" )
                userViewModel.insertUser(
                    User(
                        null,
                        binding.ipNameSurname.text.toString(),
                        binding.ipContactNumber.text.toString()
                    )
                )

                Log.i("inputTag","Reseting EditText views" )
                binding.ipNameSurname.setText("")
                binding.ipContactNumber.setText("")
                Toast.makeText(
                    requireContext(),
                    "Uspjesno ste se prijavili. Sretno !",
                    Toast.LENGTH_LONG
                ).show()
            } else {
                Toast.makeText(requireContext(), "Unesite korisnika", Toast.LENGTH_SHORT).show()
                Log.i("inputTag", "Wrong input")
            }


        }

        /*
        setting up a touch listener on view layout
         */
        view.setOnTouchListener(this)
        return view
    }


    override fun onTouch(v: View, event: MotionEvent): Boolean {




        when (event.action) {
            MotionEvent.ACTION_DOWN -> {

                Log.i("touchListenerTag", "ActionDown ")
                Log.i("touchListenerTag", "Boolean value isLongPress setting on false")
                isLongPress = true

                Log.i("touchListenerTag", "Odbrojavanje je pocelo")

             /*   handler?.postDelayed({
                    val currentTime = System.currentTimeMillis()
                   Log.i("vrijeme","vrijeme pocelo ${currentTime/1000}")

                    Log.i("touchListenerTag", "The countdown has begun ( handler )")
                    if (isLongPress) {
                        Log.i("vrijeme","vrijeme zavrsilo ${currentTime/1000}")
                        Log.i("touchListenerTag", "5 seconds reached")
                        findNavController().navigate(R.id.adminLoginFragment)

                    }
                }, 5000)*/

                handler.postDelayed(object : Runnable {
                    override fun run() {
                        Log.i("touchListenerTag", "run start")
                        if (isLongPress) {
                            Log.i("touchListenerTag", "5 seconds reached")
                            findNavController().navigate(R.id.adminLoginFragment)
                            handler.removeCallbacks(this)
                        }
                    }
                }, 5000)
            }



            MotionEvent.ACTION_UP -> {
                Log.i("touchListenerTag", "ActionUp")
                Log.i("touchListenerTag", "Boolean value isLongPress setting on false")
                isLongPress = false
                Log.i("touchListenerTag", "Canceling the timer if the finger is raised before the time")
                handler.removeCallbacksAndMessages(null)

            }
        }
        /*
        setting the value to true if we want to receive an event from the onTouch function
         */
        return true
    }

}