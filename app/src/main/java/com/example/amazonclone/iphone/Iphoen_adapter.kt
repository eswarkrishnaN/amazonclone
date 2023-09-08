package com.example.amazonclone.iphone

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.amazonclone.databinding.ProductLayoutBinding

class iphoen_adapter:RecyclerView.Adapter<iphoen_adapter.iphone>() {



    inner class iphone(private val binding: ProductLayoutBinding):RecyclerView.ViewHolder(binding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): iphone {
        val binding = ProductLayoutBinding.inflate(LayoutInflater.from(parent.context), parent, false)

        return (iphone(binding))    }

    override fun getItemCount() = 1

    override fun onBindViewHolder(holder: iphone, position: Int) {
        //TODO("Not yet implemented")
    }


}