package com.example.econome

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class LoginOrSignUp : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login_or_sign_up)

        var buttonSignUp : Button = findViewById(R.id.SignUpBtn)
        var buttonLogin : Button = findViewById(R.id.LoginBtn)

        buttonSignUp.setOnClickListener(){
            val intent = Intent(this, RegisterPage::class.java)
            startActivity(intent)
        }

        buttonLogin.setOnClickListener(){
            val intent = Intent(this, LoginPage::class.java)
            startActivity(intent)
        }
    }
}