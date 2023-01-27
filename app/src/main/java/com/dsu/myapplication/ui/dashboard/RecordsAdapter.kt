package com.dsu.myapplication.ui.dashboard

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.dsu.myapplication.databinding.ItemRecordBinding
import com.dsu.myapplication.datamodel.Record

class RecordsAdapter (private val context: Context, private val records:List<Record>):
    RecyclerView.Adapter<RecordsAdapter.ViewHolder>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder(ItemRecordBinding.inflate(LayoutInflater.from(parent.context),parent, false))
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val model = records[position]
        holder.binding.tvName.text = model.name
        holder.binding.tvImg.setImageResource(model.image)
        holder.binding.tvDesc.text = model.description
    }

    override fun getItemCount(): Int {
        return records.size
    }
    class ViewHolder(val binding: ItemRecordBinding): RecyclerView.ViewHolder(binding.root)

}