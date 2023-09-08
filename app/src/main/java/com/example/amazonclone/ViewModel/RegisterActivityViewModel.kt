package com.example.amazonclone.ViewModel

import android.app.Application
import androidx.core.view.ContentInfoCompat.Flags
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.amazonclone.data.User
import com.example.amazonclone.data.ValidateEmailBody
import com.example.amazonclone.repostory.AuthRepository
import com.example.amazonclone.util_api.Requestsatus
import kotlinx.coroutines.launch

class RegisterActivityViewModel(val authRepository: AuthRepository, val application: Application):ViewModel() {

    private var isLoadig : MutableLiveData<Boolean> = MutableLiveData<Boolean>().apply { value = false }

    private var errormessage:MutableLiveData<HashMap<String,String>> = MutableLiveData()

    //this is optional values we cant use for this api
    //private var isUnique:MutableLiveData<Boolean> = MutableLiveData<Boolean>().apply { value = false }
    //we can get the data using userdata
    private var user:MutableLiveData<User> = MutableLiveData()

    //setting functions
    fun getIsLoading():LiveData<Boolean> = isLoadig
    fun getErrorMessage():LiveData<HashMap<String,String>> = errormessage
    fun getUser():LiveData<User> = user

    fun validateEmailAddress(body: ValidateEmailBody){
        viewModelScope.launch {
            authRepository.validateEmailAddress(body).collect{
                when(it){
                    is  Requestsatus.Waiting ->{
                        isLoadig.value = true

                    }
                    is Requestsatus.Success ->{
                        isLoadig.value = false

                    }
                    is Requestsatus.Error ->{
                        isLoadig.value= false
                        errormessage.value = it.message

                    }
                }
            }
        }
    }

}