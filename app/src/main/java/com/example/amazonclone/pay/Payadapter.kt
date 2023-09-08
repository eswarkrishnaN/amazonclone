package com.example.amazonclone.pay

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.amazonclone.databinding.LayouttwoBinding

class payadapter( ):RecyclerView.Adapter<payadapter.myViewHolder>() {

    class myViewHolder(private var binding: LayouttwoBinding) :RecyclerView.ViewHolder(binding.root){



    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): myViewHolder {
        val binding = LayouttwoBinding.inflate(LayoutInflater.from(parent.context), parent, false)

        return (myViewHolder(binding))
    }

    override fun onBindViewHolder(holder: myViewHolder, position: Int) {
       //

    }

    override fun getItemCount(): Int =  1

}