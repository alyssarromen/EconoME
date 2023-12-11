package com.example.econome

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.example.econome.R

class LoginPage : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login_page)

        var buttonBack : Button = findViewById(R.id.backbtn)
        var confirmLoginButton : Button = findViewById(R.id.loginbtn)

        buttonBack.setOnClickListener(){
            val intent = Intent(this, LoginOrSignUp::class.java)
            startActivity(intent)
        }
        confirmLoginButton.setOnClickListener() {
            val intent = Intent(this, Homepage::class.java)
            startActivity(intent)
        }
    }
}