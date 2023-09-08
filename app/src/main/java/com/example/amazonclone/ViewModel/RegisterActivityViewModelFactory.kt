package com.example.amazonclone.ViewModel

import android.app.Application
import androidx.lifecycle.ViewModelProvider
import com.example.amazonclone.repostory.AuthRepository

class RegisterActivityViewModelFactory(val authRepository: AuthRepository, val application: Application):ViewModelProvider.Factory {
    
}