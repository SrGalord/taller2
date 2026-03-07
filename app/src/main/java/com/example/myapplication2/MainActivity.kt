package com.example.myapplication2

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import com.example.myapplication2.R

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Referenciar elementos de la interfaz
        val textView = findViewById<TextView>(R.id.textView)
        val btnSaludar = findViewById<Button>(R.id.btnSaludar)

        // Variable contador
        var contador = 0

        // Asignar acción al botón
        btnSaludar.setOnClickListener {
            contador++
            textView.text = "Has hecho clic $contador veces"

            // Mostrar mensaje emergente
            Toast.makeText(
                this,
                "¡Botón presionado!",
                Toast.LENGTH_SHORT
            ).show()
        }
    }
}
