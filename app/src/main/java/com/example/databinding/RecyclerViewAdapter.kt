package com.example.databinding

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.databinding.databinding.ListItemBinding

class RecyclerViewAdapter(
    private val layoutInflater: LayoutInflater,
    private val list : ArrayList<String>
) : RecyclerView.Adapter<RecyclerViewAdapter.ViewHolder>() {

    class ViewHolder(val listItemBinding: ListItemBinding) : RecyclerView.ViewHolder(listItemBinding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val listItemBinding = ListItemBinding.inflate(layoutInflater, parent, false)
        return ViewHolder(listItemBinding)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.listItemBinding.textView.text = list[position]
    }

    override fun getItemCount(): Int {
        return list.size
    }
}