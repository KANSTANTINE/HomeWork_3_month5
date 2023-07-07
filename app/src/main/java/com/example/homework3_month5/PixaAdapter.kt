package com.example.homework3_month5

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView.Adapter
import androidx.recyclerview.widget.RecyclerView.ViewHolder
import coil.load
import com.example.homework3_month5.databinding.ItemImgBinding

class PixaAdapter(var list: ArrayList<Hit>): Adapter<PixaAdapter.PixaViewHolder>() {

    fun addData(list: List<Hit>){
        this.list.addAll(list)
    }


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PixaViewHolder {
        return PixaViewHolder(ItemImgBinding.inflate(LayoutInflater.from(parent.context), parent,false))
    }

    override fun onBindViewHolder(holder: PixaViewHolder, position: Int) {
        holder.onBind(list[position])
    }

    override fun getItemCount(): Int {
        return list.size
    }

    class  PixaViewHolder(private val binding: ItemImgBinding): ViewHolder(binding.root){
        fun onBind(hit: Hit) {
            binding.imageView.load(hit.largeImageURL)
        }
    }
}