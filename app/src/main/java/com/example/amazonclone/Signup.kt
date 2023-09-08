package com.example.amazonclone

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Patterns
import android.view.KeyEvent
import android.view.LayoutInflater
import android.view.View
import com.example.amazonclone.databinding.ActivitySignupBinding

class Signup : AppCompatActivity(), View.OnClickListener, View.OnFocusChangeListener, View.OnKeyListener {
    private lateinit var binding: ActivitySignupBinding
    private var errormessage: String? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySignupBinding.inflate(LayoutInflater.from(this))
        setContentView(binding.root)

        // Set listeners for input fields
        binding.nameinput.onFocusChangeListener = this
        binding.emailinput.onFocusChangeListener = this
        binding.phoneinput.onFocusChangeListener = this
        binding.passwordinput.onFocusChangeListener = this
        binding.reenterinput.onFocusChangeListener = this
    }

    override fun onClick(view: View?) {
        // Handle click events here if needed
    }

    override fun onFocusChange(view: View?, hasFocus: Boolean) {
        if(view != null){
            when(view.id){
                R.id.nameinput ->{
                    if (hasFocus){
                        if(binding.nametext.isErrorEnabled){
                            binding.nametext.isErrorEnabled = false
                            binding.nametext.setStartIconDrawable(R.drawable.baseline_person_24)
                        }
                    }else{
                        calidatefullname()
                        binding.nametext.setStartIconDrawable(R.drawable.baseline_person_24)

                    }

                }
                R.id.emailinput ->{
                    if (hasFocus){
                        if(binding.emailtext.isErrorEnabled){
                            binding.emailtext.isErrorEnabled = false
                        }
                    }else{
                        email()
                        binding.nametext.setStartIconDrawable(R.drawable.baseline_email_24)
                    }

                }
                R.id.passwordinput ->{
                    if (hasFocus){
                        if(binding.passwordtext.isErrorEnabled){
                            binding.passwordtext.isErrorEnabled = false
                        }
                    }else{
                        passwrod()
                        binding.nametext.setStartIconDrawable(R.drawable.baseline_lock_24)
                    }

                }
                R.id.phoneinput ->{
                    if (hasFocus){
                        if(binding.phonetext.isErrorEnabled){
                            binding.phonetext.isErrorEnabled = false
                        }
                    }else{
                        phone()
                    }

                }
                R.id.reenterinput ->{
                    if (hasFocus){
                        if(binding.reentertext.isErrorEnabled){
                            binding.reentertext.isErrorEnabled = false
                        }
                    }else{
                        validationpasswordandconfrompassword()
                        binding.nametext.setStartIconDrawable(R.drawable.baseline_lock_24)
                    }

                }

            }
        }
    }

    override fun onKey(view: View?, keyCode: Int, keyEvent: KeyEvent?): Boolean {
        // Handle key events here if needed
        return false
    }

    private fun calidatefullname(): Boolean {
        val value: String = binding.nameinput.text.toString()
        if (value.isEmpty()) {
            errormessage = "Full name is required"
        } else {
            errormessage = null
        }
        binding.nametext.error = errormessage
        return errormessage == null
    }

    private fun phone(): Boolean {
        val value: String = binding.phoneinput.text.toString()
        if (value.isEmpty()) {
            errormessage = "Phone number is required"
        } else {
            errormessage = null
        }
        binding.phonetext.error = errormessage
        return errormessage == null
    }

    private fun email(): Boolean {
        val value: String = binding.emailinput.text.toString()
        if (value.isEmpty()) {
            errormessage = "Email is required"
        } else if (!Patterns.EMAIL_ADDRESS.matcher(value).matches()) {
            errormessage = "Invalid email address"
        } else {
            errormessage = null
        }
        binding.emailtext.error = errormessage
        return errormessage == null
    }

    private fun passwrod(): Boolean {
        val value: String = binding.passwordinput.text.toString()
        if (value.isEmpty()) {
            errormessage = "Password is required"
        } else if (value.length < 6) {
            errormessage = "Password must be at least 6 characters"
        } else {
            errormessage = null
        }
        binding.passwordtext.error = errormessage
        return errormessage == null
    }

    private fun validationpasswordandconfrompassword(): Boolean {
        val password = binding.passwordinput.text.toString()
        val confirmPassword = binding.reenterinput.text.toString()
        if (password != confirmPassword) {
            errormessage = "Passwords do not match"
        } else {
            errormessage = null
        }
        binding.reentertext.error = errormessage
        return errormessage == null
    }
}
