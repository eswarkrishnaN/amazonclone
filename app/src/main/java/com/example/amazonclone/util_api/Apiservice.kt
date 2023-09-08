package com.example.amazonclone.util_api

import okhttp3.OkHttpClient
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.create
import java.util.concurrent.TimeUnit

object Apiservice {

    private const val Base_url = ""

    fun getservice(): Apiconsumer{

        //connection timeout
        val client: OkHttpClient = OkHttpClient.Builder()
            .connectTimeout(60,TimeUnit.SECONDS)
            .readTimeout(60,TimeUnit.SECONDS)
            .writeTimeout(60,TimeUnit.SECONDS)
            .build()

        val builder: Retrofit.Builder = Retrofit.Builder()
            .baseUrl(Base_url)
            .client(client)
            .addConverterFactory(GsonConverterFactory.create()) // Use addConverterFactory instead of addCallAdapterFactory

        val retrofit:Retrofit = builder.build()
        return retrofit.create(Apiconsumer::class.java)



    }
}
