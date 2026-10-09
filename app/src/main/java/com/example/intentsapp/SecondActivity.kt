package com.example.intentsapp

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class SecondActivity : AppCompatActivity() {

    companion object {
        const val EXTRA_TEXT = "extra_text"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        val textViewReceived = findViewById<TextView>(R.id.textViewReceived)
        val text = intent.getStringExtra(EXTRA_TEXT)

        textViewReceived.text = if (text.isNullOrEmpty()) {
            "Текст не передан"
        } else {
            text
        }
    }
}