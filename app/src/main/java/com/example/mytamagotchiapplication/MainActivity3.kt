package com.example.tamagotchiapp

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity3 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val userInput = "The dog is playing."


        if (userInput.contains("happy", ignoreCase = true)) {
            pressButton()
        } else {
            println("The word 'happy' was not found.")
        }
    }

    fun pressButton() {
        println("Button pressed! The dog is happy.")
    }
}