package com.example.amazonclone.mainadapter

import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.amazonclone.oneplus.Oneplus
import com.example.amazonclone.databinding.ItemLayoutBinding
import com.example.amazonclone.iphone.iphone_activty
import com.example.amazonclone.redmi.Redmi
import com.example.amazonclone.samsung.Samsung

class Mobileadapter(private val context: Context) : RecyclerView.Adapter<Mobileadapter.Mobiledata>() {

    class Mobiledata(val binding: ItemLayoutBinding) : RecyclerView.ViewHolder(binding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): Mobiledata {
        val binding = ItemLayoutBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return Mobiledata(binding)
    }

    override fun getItemCount() = 1

    override fun onBindViewHolder(holder: Mobiledata, position: Int) {
        holder.binding.iphone.setOnClickListener {
            val intent = Intent(context, iphone_activty::class.java)
            context.startActivity(intent)
        }

        holder.binding.samusung.setOnClickListener{
            val intent = Intent(context, Samsung::class.java)
            context.startActivity(intent)
        }

        holder.binding.oneplus.setOnClickListener{
            val intent = Intent(context, Oneplus::class.java)
            context.startActivity(intent)
        }

        holder.binding.redmi.setOnClickListener{
            val intent = Intent(context, Redmi::class.java)
            context.startActivity(intent)
        }




    }
}


