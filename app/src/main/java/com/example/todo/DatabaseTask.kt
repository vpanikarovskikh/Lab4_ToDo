package com.example.todo
object DatabaseTask {
    var list_data = mutableListOf<InfoTask>()
    fun AddData(title: String , desc: String) {
        list_data.add(InfoTask(title, desc))
    }
    fun completeData(i:Int){
        list_data.removeAt(i)
    }
    fun getshowAllData(): List<InfoTask> {
        return list_data
    }
    fun getshowData(i:Int): InfoTask {
        return list_data[i]
    }
}