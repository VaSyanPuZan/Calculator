package com.example.calculator

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.calculator.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity(R.layout.activity_main) {
    companion object {
        private const val defaultText = "Нажмите на кнопку"
    }

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)
        binding.myText.text = defaultText
        binding.firstButton.setOnClickListener {
            binding.myText.text = binding.myText.text.toString() + "1"
        }
        binding.secondButton.setOnClickListener {
            binding.myText.text = binding.myText.text.toString() + "2"
        }
        binding.thirdButton.setOnClickListener {
            binding.myText.text = binding.myText.text.toString() + "3"
        }
        binding.fourButton.setOnClickListener {
            binding.myText.text = binding.myText.text.toString() + "4"
        }
        binding.fiveButton.setOnClickListener {
            binding.myText.text = binding.myText.text.toString() + "5"
        }
        binding.sixButton.setOnClickListener {
            binding.myText.text = binding.myText.text.toString() + "6"
        }
        binding.sevenButton.setOnClickListener {
            binding.myText.text = binding.myText.text.toString() + "7"
        }
        binding.eightButton.setOnClickListener {
            binding.myText.text = binding.myText.text.toString() + "8"
        }


    }

}