package com.example.signupsscreengradient

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class SignUpActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_sign_up)

        val btnLogin = findViewById<TextView>(R.id.tvLogin)

        btnLogin.setOnClickListener {
            intent = Intent(this, LoginActivity::class.java)
            startActivity(intent)
        }


    }
}