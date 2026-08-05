package com.example.currencyconverter

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import com.example.currencyconverter.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)

        enableEdgeToEdge()
        setContentView(binding.root)

        binding.buttonConverter.setOnClickListener {

            val text = binding.editConverter.text.toString()

            if (text.isBlank()) {
                binding.editConverter.error = "Digite um valor"
                return@setOnClickListener
            }

            val euro = text.toDouble()
            val dollars = String.format("%.2f", euro * 0.8656)

            binding.textViewCurrencyResult.text = dollars
        }

    }
}