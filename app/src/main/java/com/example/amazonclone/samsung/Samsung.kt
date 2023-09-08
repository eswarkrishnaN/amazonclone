package com.example.amazonclone.samsung

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.amazonclone.R
import com.example.amazonclone.databinding.ActivitySamsungBinding
import com.example.amazonclone.product_adapter.Productadapter

class Samsung : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val binding = ActivitySamsungBinding.inflate(layoutInflater)
        setContentView(binding.root)


        binding.productRecylerview.adapter = Productadapter()
        binding.productRecylerview.layoutManager = LinearLayoutManager(this)


    }
}