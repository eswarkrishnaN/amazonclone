package com.example.amazonclone

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.denzcoskun.imageslider.models.SlideModel

import com.example.amazonclone.databinding.ActivityMainBinding
import com.example.amazonclone.databinding.ActivitySignupBinding
import com.example.amazonclone.mainadapter.Mobileadapter
import com.example.amazonclone.pay.payadapter


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ActivityMainBinding.inflate(layoutInflater)  // Inflate the binding
        setContentView(binding.root)

        val imageList = ArrayList<SlideModel>() // Create image list



        binding.recycleview.adapter = payadapter()

        binding.recycleview.layoutManager = LinearLayoutManager(this)

        //image slider
        imageList.add(SlideModel("one.jpg", "The animal population decreased by 58 percent in 42 years."))
        imageList.add(SlideModel("two.jpg", "Elephants and tigers may become extinct."))
        imageList.add(SlideModel("three.jpg", "And people do that."))

        binding.imageSlider.setImageList(imageList)

        binding.recycleviewUnder.adapter = Mobileadapter(this)
//
        binding.recycleviewUnder.layoutManager = LinearLayoutManager(this)




    }
}