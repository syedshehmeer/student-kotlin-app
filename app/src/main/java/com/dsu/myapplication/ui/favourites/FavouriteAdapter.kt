package com.dsu.myapplication.ui.favourites

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.dsu.myapplication.databinding.ItemFavRecordBinding
import com.dsu.myapplication.databinding.ItemNotfavRecordBinding
import com.dsu.myapplication.databinding.ItemRecordBinding
import com.dsu.myapplication.datamodel.Record
import com.dsu.myapplication.ui.dashboard.RecordsAdapter

class FavouriteAdapter(private val context: Context, private val records:List<Record>) :
    RecyclerView.Adapter<FavouriteAdapter.FavViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): FavViewHolder {
        return FavViewHolder(
            ItemFavRecordBinding.inflate(LayoutInflater.from(parent.context), parent, false))
    }

    override fun onBindViewHolder(holder: FavViewHolder, position: Int) {
        val records = records[position]
        holder.binding.tvName.text = records.name
        holder.binding.tvImg.setImageResource(records.image)
        holder.binding.tvDesc.text = records.description
        if(!records.isFav)
            holder.binding.tvIconImg.visibility = View.GONE
    }

    override fun getItemCount(): Int {
        return records.size
    }

    class FavViewHolder(val binding: ItemFavRecordBinding): RecyclerView.ViewHolder(binding.root)
    class NotFavViewHolder(val binding: ItemNotfavRecordBinding): RecyclerView.ViewHolder(binding.root)
}