package com.example.amazonclone.product_adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.amazonclone.databinding.ProductLayoutBinding

class Productadapter:RecyclerView.Adapter<Productadapter.Product>() {

    class Product(val binding: ProductLayoutBinding):RecyclerView.ViewHolder(binding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): Product {
        val inflate = ProductLayoutBinding.inflate(LayoutInflater.from(parent.context),parent,false)

        return Product(inflate)
    }

    override fun getItemCount() = 1

    override fun onBindViewHolder(holder: Product, position: Int) {
        //TODO("Not yet implemented")
    }
}