package com.example.tamagotchiapp

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val userInput = "The dog's hunger is growing."


        if (userInput.contains("hunger", ignoreCase = true)) {
            pressButton()
        } else {
            println("The word 'hunger' was not found.")
        }
    }

    fun pressButton() {
        println("Button pressed! The dog is hungry.")
    }
}