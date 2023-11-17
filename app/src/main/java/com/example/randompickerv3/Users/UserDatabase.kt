package com.example.randompicker.Users

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase


@Database(entities = [User::class], version = 1, exportSchema = false)
abstract class UserDatabase : RoomDatabase() {
    abstract val userdao:UserDao

    companion object{

        private var INSTANCE: UserDatabase? =null

        fun getInstance(context:Context): UserDatabase{
            synchronized(this){
                var instance= INSTANCE
                if (instance==null){
                    instance= Room.databaseBuilder(
                        context.applicationContext,
                        UserDatabase::class.java,
                        "giveaway_database"
                    ).build()
                }
                return instance
            }
        }


    }

}