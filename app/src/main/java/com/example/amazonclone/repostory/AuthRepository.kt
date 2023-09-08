package com.example.amazonclone.repostory

import com.example.amazonclone.data.Uniquemailvalidationresponse
import com.example.amazonclone.data.ValidateEmailBody
import com.example.amazonclone.util_api.Apiconsumer
import com.example.amazonclone.util_api.Requestsatus
import com.example.amazonclone.util_api.Simplifiedmessage
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow

class AuthRepository(val consumer:Apiconsumer) {
    fun validateEmailAddress(body: ValidateEmailBody)= flow{
        emit(Requestsatus.waiting)
        val response = consumer.validateEmailAress(body)
        if (response.isSuccess){
            emit(Requestsatus.Success(response.body()!!))
        }else
        {
            emit(Requestsatus.Error(Simplifiedmessage.get(response.errorBody()!!.bytestream().reader().)))
        }

    }







}