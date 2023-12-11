package com.example.econome

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class IntroPage4 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_intro_page4)
        var buttonNext : Button = findViewById(R.id.nxtbtn4)

        buttonNext.setOnClickListener(){
            val intent = Intent(this, LoginOrSignUp::class.java)
            startActivity(intent)
        }
    }
}