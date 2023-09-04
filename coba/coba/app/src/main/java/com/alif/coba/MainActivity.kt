package com.alif.coba

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val submitButton = findViewById<Button>(R.id.button)
        val usernameEditText = findViewById<EditText>(R.id.editTextUsername)

        submitButton.setOnClickListener(View.OnClickListener {
            val username = usernameEditText.text.toString()
            val message = "Proses berhasil, selamat datang $username!"
            Toast.makeText(this, message, Toast.LENGTH_SHORT).show()
        })
    }
}