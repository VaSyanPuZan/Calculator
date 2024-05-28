package com.example.calculator

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity(R.layout.activity_main) {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val textView: TextView = findViewById(R.id.my_text)
        val firstButton: Button = findViewById(R.id.first_button)
        val secondButton: Button = findViewById(R.id.second_button)
        val thirdButton: Button = findViewById(R.id.third_button)
        firstButton.setOnClickListener { textView.text = "1" }
        secondButton.setOnClickListener { textView.text = "2" }
        thirdButton.setOnClickListener { textView.text = "3" }
    }

}
