package com.example.empoweringthenationapp

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class SignUpActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sign_up)

        val nameInput = findViewById<EditText>(R.id.signUpName)
        val emailInput = findViewById<EditText>(R.id.signUpEmail)
        val passwordInput = findViewById<EditText>(R.id.signUpPassword)
        val signUpBtn = findViewById<Button>(R.id.signUpSubmitBtn)
        val backBtn = findViewById<Button>(R.id.signUpBackBtn)

        signUpBtn.setOnClickListener {
            val name = nameInput.text.toString().trim()
            val email = emailInput.text.toString().trim()
            val password = passwordInput.text.toString().trim()

            if (name.isEmpty() || email.isEmpty() || password.isEmpty()) {
                Toast.makeText(this, "Please fill in all fields", Toast.LENGTH_SHORT).show()
            } else {
                Toast.makeText(this, "Account created for $name!", Toast.LENGTH_LONG).show()
                nameInput.text.clear()
                emailInput.text.clear()
                passwordInput.text.clear()
            }
        }

        backBtn.setOnClickListener {
            startActivity(Intent(this, MainActivity::class.java))
            finish()
        }
    }
}
