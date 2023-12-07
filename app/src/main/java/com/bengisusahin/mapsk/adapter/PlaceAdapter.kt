package com.bengisusahin.mapsk.adapter

import android.content.Intent
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bengisusahin.mapsk.databinding.RecyclerRowBinding
import com.bengisusahin.mapsk.model.Place
import com.bengisusahin.mapsk.view.MapsActivity

class PlaceAdapter(val plaList: List<Place>) : RecyclerView.Adapter<PlaceAdapter.PlaceHolder>() {
    class PlaceHolder(val recyclerRowBinding: RecyclerRowBinding) : RecyclerView.ViewHolder(recyclerRowBinding.root){

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PlaceHolder {
        val recyclerRowBinding = RecyclerRowBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return PlaceHolder(recyclerRowBinding)
    }

    override fun getItemCount(): Int {
        return plaList.size
    }

    override fun onBindViewHolder(holder: PlaceHolder, position: Int) {
        holder.recyclerRowBinding.recyclerViewTextView.text = plaList.get(position).name
        holder.itemView.setOnClickListener{
            val intent = Intent(holder.itemView.context, MapsActivity::class.java)
            holder.itemView.context.startActivity(intent)
        }
    }
}