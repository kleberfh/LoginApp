package com.atividade.login

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val clearButton = findViewById<Button>(R.id.clear)
        val loginInput = findViewById<EditText>(R.id.login)
        val passwordInput = findViewById<EditText>(R.id.password)

        clearButton.setOnClickListener {
            loginInput.setText("")
            passwordInput.setText("")
        }
    }
}