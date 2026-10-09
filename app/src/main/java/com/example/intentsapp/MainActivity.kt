package com.example.intentsapp

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    private lateinit var editTextInput: EditText

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        editTextInput = findViewById(R.id.editTextInput)

        findViewById<Button>(R.id.buttonOpenSecond).setOnClickListener {
            val text = editTextInput.text.toString().trim()
            if (text.isEmpty()) {
                Toast.makeText(this, "Введите текст", Toast.LENGTH_SHORT).show()
                return@setOnClickListener
            }

            val intent = Intent(this, SecondActivity::class.java).apply {
                putExtra(SecondActivity.EXTRA_TEXT, text)
            }
            startActivity(intent)
        }

        findViewById<Button>(R.id.buttonCall).setOnClickListener {
            val phone = editTextInput.text.toString().trim()
            if (!isValidPhone(phone)) {
                Toast.makeText(
                    this,
                    "Введите корректный номер телефона",
                    Toast.LENGTH_SHORT
                ).show()
                return@setOnClickListener
            }

            val intent = Intent(Intent.ACTION_DIAL).apply {
                data = Uri.parse("tel:$phone")
            }

            if (intent.resolveActivity(packageManager) != null) {
                startActivity(intent)
            } else {
                Toast.makeText(
                    this,
                    "Приложение для звонков не найдено",
                    Toast.LENGTH_SHORT
                ).show()
            }
        }

        findViewById<Button>(R.id.buttonShare).setOnClickListener {
            val text = editTextInput.text.toString().trim()
            if (text.isEmpty()) {
                Toast.makeText(
                    this,
                    "Введите текст для отправки",
                    Toast.LENGTH_SHORT
                ).show()
                return@setOnClickListener
            }

            val intent = Intent(Intent.ACTION_SEND).apply {
                type = "text/plain"
                putExtra(Intent.EXTRA_TEXT, text)
            }

            startActivity(Intent.createChooser(intent, "Поделиться через…"))
        }
    }


    private fun isValidPhone(phone: String): Boolean {
        if (phone.isEmpty()) return false
        val digits = phone.replace(Regex("[^0-9]"), "")
        return phone.matches(Regex("[0-9+\\-\\s()]+")) && digits.length in 5..15
    }
}