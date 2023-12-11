package com.example.econome

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class IntroPage3 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_intro_page3)

        var buttonNext : Button = findViewById(R.id.nextbtn3)

        buttonNext.setOnClickListener(){
            val intent = Intent(this, IntroPage4::class.java)
            startActivity(intent)
        }
    }
}