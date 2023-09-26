package com.eutropiosaboya.mangoose.ui.adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.eutropiosaboya.mangoose.R
import com.eutropiosaboya.mangoose.webservice.model.ResponseMangaAttributes

class MangaListAdapter(

    val responseMangaList: ArrayList<ResponseMangaAttributes>,
    val context: Context

) : RecyclerView.Adapter<MangaListAdapter.MangaViewHolder>() {

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): MangaListAdapter.MangaViewHolder {
        val root = LayoutInflater.from(parent.context).inflate(R.layout.manga_item, parent, false)
        return MangaViewHolder(root)
    }

    override fun getItemCount(): Int {
        return responseMangaList.size
    }

    override fun onBindViewHolder(holder: MangaListAdapter.MangaViewHolder, position: Int) {
        holder.bind(responseMangaList[position])
    }


    inner class MangaViewHolder(private val binding: View) : RecyclerView.ViewHolder(binding) {
        fun bind(responseManga: ResponseMangaAttributes) {
            val title = binding.findViewById<TextView>(R.id.tvMangaTitle)
            title.text = responseManga.title.en
        }
    }
}


