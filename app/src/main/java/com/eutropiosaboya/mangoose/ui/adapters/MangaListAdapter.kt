package com.eutropiosaboya.mangoose.ui.adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.eutropiosaboya.mangoose.R
import com.eutropiosaboya.mangoose.model.Manga

class MangaListAdapter(

    val mangaList: ArrayList<Manga>,
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
        return mangaList.size
    }

    override fun onBindViewHolder(holder: MangaListAdapter.MangaViewHolder, position: Int) {
        holder.bind(mangaList[position])
    }


    inner class MangaViewHolder(private val binding: View) : RecyclerView.ViewHolder(binding) {
        fun bind(manga: Manga) {
            val title = binding.findViewById<TextView>(R.id.tvMangaTitle)
            title.text = manga.title
        }
    }
}


