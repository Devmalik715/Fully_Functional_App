package com.example.fullyfunctionalapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class SecondActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        val firstButtonIntent=findViewById<Button>(R.id.button1)
        val secondButtonIntent =findViewById<Button>(R.id.button2)
        val thirdButtonIntent = findViewById<Button>(R.id.button3)
        val fourthButtonIntent= findViewById<Button>(R.id.button4)
        val fifthButtonIntent = findViewById<Button>(R.id.button5)
        val sixthButtonIntent = findViewById<Button>(R.id.button6)

        firstButtonIntent.setOnClickListener{
            //open a new activity'
            intent = Intent(applicationContext,FirstButton::class.java)
            startActivity(intent)
        }
        secondButtonIntent.setOnClickListener{
            //open another activity
            intent = Intent(applicationContext,SecondButton::class.java)
            startActivity(intent)
        }
        thirdButtonIntent.setOnClickListener{
            intent = Intent(applicationContext,ThirdButton::class.java)
            startActivity(intent)
        }
        fourthButtonIntent.setOnClickListener{
            intent = Intent(applicationContext,FourthButton::class.java)
            startActivity(intent)
        }
        fifthButtonIntent.setOnClickListener{
            intent =Intent(applicationContext,FifthButton::class.java)
            startActivity(intent)
        }
        sixthButtonIntent.setOnClickListener{
            intent = Intent(applicationContext,SixthButton::class.java)
            startActivity(intent)
        }

    }
}