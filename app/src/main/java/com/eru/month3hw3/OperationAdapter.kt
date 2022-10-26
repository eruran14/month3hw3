package com.eru.month3hw3

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.eru.month3hw3.databinding.ItemOperationBinding

class OperationAdapter(private var list: ArrayList<String>): RecyclerView.Adapter<OperationAdapter.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder(ItemOperationBinding.inflate(LayoutInflater.from(parent.context), parent, false))
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bind(position)
    }

    override fun getItemCount() = list.size

    inner class ViewHolder(private val binding: ItemOperationBinding): RecyclerView.ViewHolder(binding.root){

        fun bind(position: Int) {

            binding.textView.text = list[position]
        }

    }
}