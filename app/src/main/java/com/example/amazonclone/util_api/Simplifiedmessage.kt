package com.example.amazonclone.util_api

import org.json.JSONException
import org.json.JSONObject

object Simplifiedmessage {

    fun get(stringmessage:String):HashMap<String,String>{
        val messgaes = HashMap<String,String>()
        val jsonobject = JSONObject(stringmessage)

        try {
            //setupting the error messgae
            val jsonmessage = jsonobject.getJSONObject(("message"))
            jsonmessage.keys().forEach{messgaes[it] = jsonmessage.getString(it)}
        }catch (e:JSONException){
            messgaes["message"] = jsonobject.getString("message")

        }
        return messgaes
    }
}