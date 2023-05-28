package com.example.todo
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.object_database.view.*
class Adapter(var data: List<InfoTask>) : RecyclerView.Adapter<Adapter.viewHolder>() {
    class viewHolder(ObjectDB: View) : RecyclerView.ViewHolder(ObjectDB) {
        var title = ObjectDB.title
        var body = ObjectDB.desc
    }
    override fun getItemCount(): Int {
        return data.size
    }
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): viewHolder {
        var ObjectDB = LayoutInflater.from(parent.context).inflate(R.layout.object_database, parent, false)
        return viewHolder(ObjectDB)
    }
    override fun onBindViewHolder(holder: viewHolder, position: Int) {
        if (data[position].title.length <= 15)
            holder.title.text = data[position].title
        if (data[position].body.length <= 70)
            holder.body.text = data[position].body
        if (data[position].title.length > 15)
            holder.title.text = data[position].title.substring(0,15) + "..."
        if (data[position].body.length > 70)
            holder.body.text = data[position].body.substring(0,70) + "..."
        else {
            holder.itemView.setOnClickListener{
                val transition= Intent(holder.itemView.context,DeleteTask::class.java)
                transition.putExtra("id",position)
                holder.itemView.context.startActivity(transition)
            }
        }
    }
}