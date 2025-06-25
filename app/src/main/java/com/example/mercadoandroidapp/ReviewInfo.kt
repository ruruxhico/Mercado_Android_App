package com.example.mercadoandroidapp

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class ReviewInfo : AppCompatActivity() {
    lateinit var btnBack: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_review_info)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        //bind the layout variable to the layout view (control)
        btnBack = findViewById<Button>(R.id.btnBack)

        //add the clock listener to the button
        btnBack.setOnClickListener{
            //nag-dadagdag ng listener ng on click
            //create an intent variable
            val intent = Intent(this, SignUp::class.java)

            //start the activity using the intent
            startActivity(intent)
        }
    }
}