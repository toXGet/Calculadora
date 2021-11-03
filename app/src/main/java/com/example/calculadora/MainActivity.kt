package com.example.calculadora

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val etNumUno = findViewById<EditText>(R.id.etNumeroUno)
        val etNumDos = findViewById<EditText>(R.id.etNumeroDos)
        val btnRes = findViewById<Button>(R.id.btnResultado)
        val tvRes = findViewById<TextView>(R.id.tvResultado)

        btnRes.setOnClickListener(){
            var numeroUno: Int = etNumUno.text.toString().toInt()
            var numeroDos: Int = etNumDos.text.toString().toInt()
            var resultado: Int = numeroUno + numeroDos
            tvRes.text = "El resultado es $resultado"
        }

    }
}