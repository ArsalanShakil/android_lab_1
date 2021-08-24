package com.example.android_lab1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.EditText


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val greetingText = findViewById<TextView>(R.id.greetingText)
        findViewById<Button>(R.id.clickBtn).setOnClickListener {
            val editTextPersonName = findViewById<EditText>(R.id.editTextPersonName)

            val username: String = editTextPersonName.text.toString()

            greetingText.text = if (editTextPersonName.text.isNotEmpty()) {
                getString(R.string.hello_name, username)
            } else {

                when (greetingText.text) {
                    resources.getString(R.string.introText) -> resources.getString(R.string.summerTxt)
                    resources.getString(R.string.summerTxt) -> resources.getString(R.string.introText)
                    else -> resources.getString(R.string.introText)
                }

            }
            editTextPersonName.text.clear()

        }
    }
}