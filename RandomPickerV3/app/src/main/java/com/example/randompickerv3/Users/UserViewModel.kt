package com.example.randompickerv3.Users

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.randompicker.Users.User
import com.example.randompicker.Users.UserDao
import kotlinx.coroutines.launch

class UserViewModel(private val userDao: UserDao) : ViewModel(){

     val getUsers=userDao.getAllUsers()

    fun insertUser (user: User)= viewModelScope.launch {
        userDao.insertUser(user)
    }

    fun updateUser (user: User)= viewModelScope.launch {
        userDao.updateUser(user)
    }

    fun deleteUser(user: User)= viewModelScope.launch {
        userDao.deleteUser(user)
    }

}