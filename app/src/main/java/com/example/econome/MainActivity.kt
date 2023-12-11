package com.example.econome

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.example.econome.R.*

class MainActivity : AppCompatActivity() {

       override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(layout.activity_main)

        var buttonNext : Button = findViewById(R.id.nextbtn1)

        buttonNext.setOnClickListener(){
            val intent = Intent(this, IntroPage1::class.java)
            startActivity(intent)
        }
    }
}