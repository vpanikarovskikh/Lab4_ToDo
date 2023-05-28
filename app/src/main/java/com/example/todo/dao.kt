package com.example.todo
import androidx.room.*
@Dao
interface dao {
    @Insert
    suspend fun inserObject(tableToDo: Table_ToDo)
    @Delete
    suspend fun CompleteObject(tableToDo: Table_ToDo)
    @Query("Select * from to_do")
    suspend fun getObject():List<InfoTask>
}