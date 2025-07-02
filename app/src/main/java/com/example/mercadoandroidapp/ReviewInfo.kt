package com.example.mercadoandroidapp

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class ReviewInfo : AppCompatActivity() {
    lateinit var btnBack: Button

    lateinit var tvLastNameField: TextView
    lateinit var tvFirstNameField: TextView
    lateinit var tvMiddleNameField: TextView
    lateinit var tvEmailField: TextView

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

        //bind text view
        tvFirstNameField = findViewById<TextView>(R.id.tvFirstNameField)
        tvMiddleNameField = findViewById<TextView>(R.id.tvMiddleNameField)
        tvLastNameField = findViewById<TextView>(R.id.tvLastNameField)
        tvEmailField = findViewById<TextView>(R.id.tvEmailField)

        val bundle = intent.extras

        //check kung may laman si bundle
        if(bundle != null){
            tvFirstNameField.text = bundle.getString("firstName")
            tvMiddleNameField.text = bundle.getString("middleName")
            tvLastNameField.text = bundle.getString("lastName")
            tvEmailField.text = bundle.getString("email")
        }
    }
}