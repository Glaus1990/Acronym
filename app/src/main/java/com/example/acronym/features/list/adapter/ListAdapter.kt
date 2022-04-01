package com.example.nasaneo.features.list.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ListView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.acronym.R
import com.example.nasaneo.data.model.LongForm
import java.util.*
import kotlin.collections.ArrayList

class ListAdapter(var acronyms: List<LongForm>): RecyclerView.Adapter<ListAdapter.ListViewHolder>() {
    class ListViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val tvAcronym = itemView.findViewById<TextView>(R.id.acronym_text)
        val tvYear = itemView.findViewById<TextView>(R.id.year_text)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ListViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.acronym_item_layout, parent, false)
        return ListViewHolder(view)
    }

    override fun onBindViewHolder(holder: ListViewHolder, position: Int) {
        holder.tvAcronym.text = acronyms[position].longform
        holder.tvYear.text = acronyms[position].since.toString()
    }

    override fun getItemCount(): Int {
        return acronyms.size
    }
}