package com.example.amazonclone.util_api

sealed class Requestsatus<out T>{

    object waiting:Requestsatus<Nothing>()

    data class Success<out T>(val data:T):Requestsatus<T>()

    data class Error(val message:HashMap<String,String>):Requestsatus<Nothing>()
}
