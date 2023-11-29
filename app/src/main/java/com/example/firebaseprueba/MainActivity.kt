package com.example.firebaseprueba

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class MainActivity : AppCompatActivity() {
    lateinit var user : EditText
    lateinit var pass : EditText
    lateinit var btn : Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        user = findViewById(R.id.Usuario)
        pass = findViewById(R.id.Password)
        btn = findViewById(R.id.button)

        btn.setOnClickListener {

        }
    }
}