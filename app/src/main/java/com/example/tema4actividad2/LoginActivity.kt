package com.t3a3.jordichorro

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import com.google.android.material.textfield.TextInputEditText
import com.example.tema4actividad2.R

class LoginActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.login_activity)

        val button: Button = findViewById(R.id.button_login)

        val dni: TextInputEditText = findViewById(R.id.dni)
        val contrasena: TextInputEditText = findViewById(R.id.password)

        button.setOnClickListener {

            val dniText: String = dni.text.toString()
            val contrasenaText: String = contrasena.text.toString()

            if (dniText == "11111111A" && contrasenaText == "123456789") {
                // Creación del Intent y envío del DNI
                val intent = Intent(this, MainActivity::class.java)
                intent.putExtra("dni", dniText) // Envía el DNI como string
                startActivity(intent)
                finish()
            } else {
                Toast.makeText(this, "El usuario o contraseña es incorrecto.", Toast.LENGTH_SHORT)
                    .show()
            }
        }
    }
}
