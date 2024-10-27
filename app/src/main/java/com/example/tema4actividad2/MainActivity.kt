package com.t3a3.jordichorro

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import com.example.tema4actividad2.R

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Recuperar el DNI enviado desde LoginActivity
        val dniRecibido = intent.getStringExtra("dni")

        // Referencia el TextView desde el layout
        val textViewDni: TextView = findViewById(R.id.usuario)

        // Mostrar el DNI si no es nulo
        dniRecibido?.let {
            textViewDni.text = "$it" // Mostrar el DNI en el TextView
        }
    }
}
