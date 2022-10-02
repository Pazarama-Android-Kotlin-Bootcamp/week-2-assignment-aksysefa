package com.aksoysefa.secondweeksignup

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class LoginActivity : AppCompatActivity() {
    private lateinit var button: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        button=findViewById(R.id.button_signup)
        button.setOnClickListener {
            var intent= Intent(LoginActivity@this,SignUpActivity::class.java)
            startActivity(intent)

    }
}
}