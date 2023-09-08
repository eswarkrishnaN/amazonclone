package com.example.amazonclone.util_api

import com.example.amazonclone.data.Uniquemailvalidationresponse
import com.example.amazonclone.data.User
import com.example.amazonclone.data.ValidateEmailBody
import okhttp3.Response
import retrofit2.http.Body
import retrofit2.http.POST

interface Apiconsumer {

    //fill your email
    @POST("users")
    suspend   fun validateEmailAress(@Body body: ValidateEmailBody):Result<User>

}