package com.example.randompickerv3

import android.os.Handler
import android.os.Looper
import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.randompicker.Users.User
import kotlinx.coroutines.launch
import kotlin.random.Random

class ShowPickedPlayerViewModel : ViewModel() {
    private var _users: ArrayList<User>? = null

    private val _user = MutableLiveData<User>()
    val user: LiveData<User> get() = _user

    fun getPlayerData(userLista: ArrayList<User>?) {
        Log.i("taggg","getPlayerData from ViewModel")
        viewModelScope.launch {
            userLista.let { lista ->
                _users?.clear()
                _users= userLista
                Log.i("taggg","getPlayerData from ViewModel ${_users.toString()}")
            }
        }
         val handler = Handler(Looper.getMainLooper())

        handler.postDelayed(object : Runnable {
            var milis: Long = 10
            var milisCheck: Long = 0
            var provjera: Boolean = true
            override fun run() {
                milisCheck += 10


                if (provjera) {

                    if (_users != null) {

                        if (_users!!.isNotEmpty()) {
                            val randomIndex = Random.nextInt(_users!!.size)
                            _user.value = _users!![randomIndex]
                            Log.i("taggg","IZABRANI USER JE $user")
                        }
                    }

                }
                if (milisCheck.toInt() == 4000) {
                    provjera = false
                    handler.removeCallbacks(this)

                }
                handler.postDelayed(this, milis) // Ponavljanje svake sekunde (1000 milisekundi)
            }
        }, 0)
    }


}