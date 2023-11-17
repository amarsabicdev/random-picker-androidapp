package com.example.randompickerv3.Users

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.example.randompicker.Users.UserDao
import java.lang.IllegalArgumentException

class UserViewModelFactory(private val dao: UserDao) : ViewModelProvider.Factory {

    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        if (modelClass.isAssignableFrom(UserViewModel::class.java)){
            return UserViewModel(dao) as T
        }
        throw IllegalArgumentException("Unknow View Model Class")
    }
}