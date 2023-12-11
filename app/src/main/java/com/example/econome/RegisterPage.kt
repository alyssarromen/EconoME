package com.example.econome

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.TextUtils
import android.view.View
import android.widget.Button
import android.widget.EditText
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.auth.auth
import com.google.firebase.database.DatabaseReference
//import com.google.firebase.database.DatabaseReference
import com.google.firebase.database.FirebaseDatabase
import com.example.econome.R

class RegisterPage : AppCompatActivity() {

    lateinit var databaseReference: DatabaseReference

    var editName: EditText = findViewById(R.id.editName)
    var editEmail: EditText = findViewById(R.id.editEmail)
    var editPhone: EditText = findViewById(R.id.editPhone)
    var editPassword: EditText = findViewById(R.id.editPassword)
    var editConfirmPassword: EditText = findViewById(R.id.editConfirmPassword)
    var buttonSignUp: Button = findViewById(R.id.buttonSignUp)
    var backbtn: Button = findViewById(R.id.backbtn)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register_page)

        var buttonBack: Button = findViewById( R.id.backbtn)

        buttonBack.setOnClickListener() {

            if (validateForm()) {
                val name = editName.text.toString()
                val email = editEmail.text.toString()
                val phone = editPhone.text.toString()
                val password = editPassword.text.toString()
                val cpassword = editConfirmPassword.text.toString()


            }
        }
        buttonBack.setOnClickListener(View.OnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        })
    }

    private fun validateForm(): Boolean {
        var valid = true

        val name = editName.text.toString()
        if (TextUtils.isEmpty(name)) {
            editName.error = "Required."
            valid = false
        } else {
            editName.error = null
        }

        val email = editEmail.text.toString()
        if (TextUtils.isEmpty(email)) {
            editEmail.error = "Required."
            valid = false
        } else {
            editEmail.error = null
        }

        val password = editPassword.text.toString()
        if (TextUtils.isEmpty(email)) {
            editPassword.error = "Required."
            valid = false
        } else {
            editPassword.error = null
        }

        val cpassword = editConfirmPassword.text.toString()
        if (TextUtils.isEmpty(cpassword)) {
            editConfirmPassword.error = "Required."
            valid = false
        } else {
            editConfirmPassword.error = null
        }

        return valid
    }

}