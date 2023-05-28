package com.example.todo
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.room.Room
import kotlinx.android.synthetic.main.activity_main.*
class MainActivity : AppCompatActivity() {
    private lateinit var database: Database
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        database = Room.databaseBuilder(
            applicationContext, Database::class.java, "To_Do").build()
        add.setOnClickListener {
            val transition = Intent(this, CreateTask::class.java)
            startActivity(transition)
        }
        setObjectsDB()
    }
    fun setObjectsDB() {
        list_objectdb.adapter = Adapter(DatabaseTask.getshowAllData())
        list_objectdb.layoutManager = LinearLayoutManager(this)
    }
}