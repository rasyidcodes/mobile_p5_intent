package com.example.mobile_p5_intent

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.mobile_p5_intent.RegisterActivity.Companion.it_USERNAME
import com.example.mobile_p5_intent.databinding.ActivityHomepageBinding
import com.example.mobile_p5_intent.databinding.ActivityMainBinding
import com.example.mobile_p5_intent.databinding.ActivityRegisterBinding

class HomepageActivity : AppCompatActivity() {
    private lateinit var binding: ActivityHomepageBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_homepage)
        binding = ActivityHomepageBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val username = intent.getStringExtra(it_USERNAME)
        val email = intent.getStringExtra(RegisterActivity.it_EMAIL)
        val phone = intent.getStringExtra(RegisterActivity.it_PHONE)

        with(binding){

            tvUsername.text = "$username"
            tvEmail.text = "$email"
            tvPhone.text = "$phone"

            btnLogout.setOnClickListener{
                finish()
            }

        }

    }
}