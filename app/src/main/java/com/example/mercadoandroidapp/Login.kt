package com.example.mercadoandroidapp

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class Login : AppCompatActivity() {
    lateinit var btnSignUp: Button
    lateinit var btnLogin: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_login)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        //bind the layout variable to the layout view (control)
        btnSignUp = findViewById<Button>(R.id.btnSignUp)

        //add the clock listener to the button
        btnSignUp.setOnClickListener{
            //nag-dadagdag ng listener ng on click
            //create an intent variable
            val intent = Intent(this, SignUp::class.java)

            //start the activity using the intent
            startActivity(intent)
        }

        //bind the layout variable to the layout view (control)
        btnLogin = findViewById<Button>(R.id.btnLogIn)

        //add the clock listener to the button
        btnLogin.setOnClickListener{
            //nag-dadagdag ng listener ng on click
            //create an intent variable
            val intent = Intent(this, SignUp::class.java)

            //start the activity using the intent
            startActivity(intent)
        }
    }
}