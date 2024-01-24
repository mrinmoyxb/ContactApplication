package com.example.roomdatabase.RoomDB

import androidx.room.Entity
import androidx.room.PrimaryKey

// we c
@Entity(tableName = "Contact")
data class Contact(
    val firstName: String,
    val lastName: String,
    val phoneNumber: String,
    @PrimaryKey(autoGenerate = true)
    val id: Int = 0,
)
