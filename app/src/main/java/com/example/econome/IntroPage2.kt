package com.example.econome

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class IntroPage2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_intro_page2)

        var buttonNext : Button = findViewById(R.id.nxtbtn2)

        buttonNext.setOnClickListener(){
            val intent = Intent(this, IntroPage3::class.java)
            startActivity(intent)
        }
    }
}