package com.example.roomdatabase.RoomDB

import androidx.room.Database
import androidx.room.RoomDatabase

// Database
// here we connected the table contact and it's dao

@Database(entities = [Contact::class], version = 1)
abstract class ContactDatabase: RoomDatabase() {
    // here we defined all our Dao ->
    abstract val dao: ContactDao
}