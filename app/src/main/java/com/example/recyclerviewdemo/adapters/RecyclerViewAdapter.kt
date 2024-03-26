package com.example.recyclerviewdemo.adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.recyclerviewdemo.R
import com.example.recyclerviewdemo.model.Demo

class RecyclerViewAdapter(private var demo : MutableList<Demo>) : RecyclerView.Adapter<RecyclerViewAdapter.RecyclerViewHolder>() {

    inner class RecyclerViewHolder(itemView : View) : RecyclerView.ViewHolder(itemView) {
        val title : TextView = itemView.findViewById(R.id.DemoId)
        val description : TextView = itemView.findViewById(R.id.DemoName)
        val url : TextView = itemView.findViewById(R.id.DemoUrl)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerViewHolder {
        val view = LayoutInflater.from(parent.context).inflate((R.layout.recyclerview_items) , parent , false)
        return RecyclerViewHolder(view)
    }
    override fun onBindViewHolder(holder: RecyclerViewHolder, position: Int) {
        val item = demo[position]
        holder.title.text = item.title
        holder.description.text = item.description
        holder.url.text = item.url
    }
    override fun getItemCount(): Int {
        return demo.size
    }
}