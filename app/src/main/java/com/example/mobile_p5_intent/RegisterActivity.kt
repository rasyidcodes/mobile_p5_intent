package com.example.mobile_p5_intent

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.mobile_p5_intent.databinding.ActivityMainBinding
import com.example.mobile_p5_intent.databinding.ActivityRegisterBinding

class RegisterActivity : AppCompatActivity() {


    private lateinit var binding: ActivityRegisterBinding

    companion object {
        const val it_USERNAME = "username"
        const val it_EMAIL = "email"
        const val it_PHONE = "phone"
        const val it_PASSWORD = "password"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityRegisterBinding.inflate(layoutInflater)
        setContentView(binding.root)

        with(binding){

            btRegister.setOnClickListener{

                val intent = Intent(this@RegisterActivity,HomepageActivity::class.java)

                val username = etUsername.text.toString()
                val email = etEmail.text.toString()
                val phone = etPhone.text.toString()
                val password = etPassword.text.toString()

                if (username == "" || email == "" || phone == "" || password == ""){
                    Toast.makeText(applicationContext, "Cant Empty!", Toast.LENGTH_SHORT).show()
                }else  {
                    intent.putExtra(it_USERNAME, username)
                    intent.putExtra(it_EMAIL, email)
                    intent.putExtra(it_PHONE, phone)
                    intent.putExtra(it_PASSWORD, password)
                    startActivity(intent)
                }

            }
        }
    }
}