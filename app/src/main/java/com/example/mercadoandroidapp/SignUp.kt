package com.example.mercadoandroidapp

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class SignUp : AppCompatActivity() {
    lateinit var btnGoBack: Button
    lateinit var btnSignUp: Button

    //declare 6 edit text
    lateinit var etLastName: EditText
    lateinit var etFirstName: EditText
    lateinit var etMiddleName: EditText
    lateinit var etPassword: EditText
    lateinit var etConfirmPassword: EditText
    lateinit var etEmail: EditText

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_sign_up)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        //bind the layout variable to the layout view (control)
        btnGoBack = findViewById<Button>(R.id.btnGoBack)

        //add the clock listener to the button
        btnGoBack.setOnClickListener{
            //nag-dadagdag ng listener ng on click
            //create an intent variable
            val intent = Intent(this, Login::class.java)

            //start the activity using the intent
            startActivity(intent)
        }

        btnSignUp = findViewById<Button>(R.id.btnSignUp)

        btnSignUp.setOnClickListener{
            //check if same yung password at conform password
            if (etPassword.text.toString() == etConfirmPassword.text.toString()){
                //if tama, create Bundle object
                val bundle = Bundle() //child class ng collection - particularly sa Map
                bundle.putString("firstName", etFirstName.text.toString()) //pag bundle, ang key ay laging string
                bundle.putString("middleName", etMiddleName.text.toString())
                bundle.putString("lastName", etLastName.text.toString())
                bundle.putString("email", etEmail.text.toString())
                bundle.putString("password", etPassword.text.toString())

                val intent = Intent(this, ReviewInfo::class.java)
                intent.putExtras(bundle)
                //start the activity using the intent
                startActivity(intent)
            }
            else{
                Toast.makeText(this,"Passwords do not match!",
                Toast.LENGTH_LONG).show()
            }
        }

        //bind edit text
        etFirstName = findViewById<EditText>(R.id.etFirstName)
        etMiddleName = findViewById<EditText>(R.id.etMiddleName)
        etLastName = findViewById<EditText>(R.id.etLastName)
        etEmail = findViewById<EditText>(R.id.etEmail)
        etPassword = findViewById<EditText>(R.id.etPassword)
        etConfirmPassword = findViewById<EditText>(R.id.etConfirmPassword)


    }
}