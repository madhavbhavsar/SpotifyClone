package com.mad.task15junspotify.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.mad.task15junspotify.R
import com.mad.task15junspotify.model.ModelBig
import com.mad.task15junspotify.model.ModelSmall

class AdapterBig(val data: List<ModelBig>) : RecyclerView.Adapter<AdapterBig.VHBig>() {

    class VHBig(itemView: View) : RecyclerView.ViewHolder(itemView) {

        val title: TextView = itemView.findViewById<TextView>(R.id.txtTitle)
        val desc: TextView = itemView.findViewById<TextView>(R.id.txtDesc)
        val imgBigId : ImageView = itemView.findViewById<ImageView>(R.id.imgBigImage)
        val imgSmallId : ImageView = itemView.findViewById<ImageView>(R.id.imgSmallImage)

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): VHBig {
        val view =
            LayoutInflater.from(parent.context).inflate(R.layout.layout_rvbig, parent, false)
        return VHBig(view)
    }

    override fun getItemCount(): Int {
        return data.size
    }

    override fun onBindViewHolder(holder: VHBig, position: Int) {
        val model = data[position]
        holder.title.text = model.songTitle
        holder.desc.text = model.songDesc
        holder.imgBigId.setImageResource(model.bigImgId)
        holder.imgSmallId.setImageResource(model.smallImgId)


    }
}