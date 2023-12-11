package com.example.econome

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class IntroPage1 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_intro_page1)

        var buttonNext : Button = findViewById(R.id.nextbtn1)

        buttonNext.setOnClickListener(){
            val intent = Intent(this, IntroPage2::class.java)
            startActivity(intent)
        }

    }
}