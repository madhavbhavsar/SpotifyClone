package com.mad.task15junspotify.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.mad.task15junspotify.R
import com.mad.task15junspotify.model.ModelSmall

class AdapterSmall(val data: List<ModelSmall>) : RecyclerView.Adapter<AdapterSmall.VHSmall>() {

    class VHSmall(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val title: TextView = itemView.findViewById<TextView>(R.id.txtTitle)
        val imgId : ImageView = itemView.findViewById<ImageView>(R.id.imgViewSmall)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): VHSmall {
        val view =
            LayoutInflater.from(parent.context).inflate(R.layout.layout_rvsmall, parent, false)
        return VHSmall(view)
    }

    override fun getItemCount(): Int {
        return data.size
    }

    override fun onBindViewHolder(holder: VHSmall, position: Int) {
        val model = data[position]
        holder.title.text = model.title
        holder.imgId.setImageResource(model.imgId)

    }


}