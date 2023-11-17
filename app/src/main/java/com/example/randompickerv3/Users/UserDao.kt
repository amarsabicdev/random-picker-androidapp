package com.example.randompicker.Users

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query
import androidx.room.Update

@Dao
interface UserDao {

    @Insert
    suspend fun insertUser(user : User)

    @Update
    suspend fun updateUser(user : User)

    @Delete
    suspend fun deleteUser(user : User)

    //has a built-in coroutine
    @Query("SELECT * FROM players")
    fun getAllUsers(): LiveData<List<User>>
}