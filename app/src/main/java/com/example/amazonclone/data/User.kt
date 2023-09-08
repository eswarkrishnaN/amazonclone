package com.example.amazonclone.data

import com.google.gson.annotations.SerializedName

data class User(@SerializedName("id") val id :String, val fullname:String,val phone_number:String, val email_id:String,){

}
