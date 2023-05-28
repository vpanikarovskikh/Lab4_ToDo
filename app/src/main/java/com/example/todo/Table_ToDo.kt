package com.example.todo
import androidx.room.Entity
import androidx.room.PrimaryKey
@Entity(tableName = "To_Do")
data class Table_ToDo(
    @PrimaryKey(autoGenerate = true)
    var id:Int,
    var title:String,
    var body:String
)