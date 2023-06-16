package com.mad.task15junspotify.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.mad.task15junspotify.R
import com.mad.task15junspotify.model.ModelSmall
import com.mad.task15junspotify.model.ModelSquare

class AdapterCircle (val data: List<ModelSmall>) : RecyclerView.Adapter<AdapterCircle.VHCircle>() {

    class VHCircle(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val title: TextView = itemView.findViewById<TextView>(R.id.txtTitle)
        val imgId : ImageView = itemView.findViewById<ImageView>(R.id.imgViewCircle)

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): VHCircle {
        val view =
            LayoutInflater.from(parent.context).inflate(R.layout.layout_rvcircle, parent, false)
        return VHCircle(view)
    }

    override fun getItemCount(): Int {
        return data.size
    }

    override fun onBindViewHolder(holder: VHCircle, position: Int) {
        val model = data[position]
        holder.title.text = model.title
        holder.imgId.setImageResource(model.imgId)

    }
}