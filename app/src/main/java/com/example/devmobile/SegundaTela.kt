package com.example.devmobile

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class SegundaTela : AppCompatActivity() {

    private lateinit var btnVoltar: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_segunda_tela)

        val edtPeso = findViewById<EditText>(R.id.edtPeso)
        val edtAltura = findViewById<EditText>(R.id.edtAltura)
        val btnCalcular = findViewById<Button>(R.id.btnCalcular)
        val txtResultado = findViewById<TextView>(R.id.txtResultado)

        btnCalcular.setOnClickListener {
            val peso = edtPeso.text.toString().toFloatOrNull()
            val altura = edtAltura.text.toString().toFloatOrNull()

            if (peso != null && altura != null && altura > 0) {
                val imc = peso / (altura * altura)
                val classificacao = when {
                    imc < 18.5 -> "Abaixo do peso"
                    imc < 24.9 -> "Peso normal"
                    imc < 29.9 -> "Sobrepeso"
                    imc < 34.9 -> "Obesidade grau 1"
                    imc < 39.9 -> "Obesidade grau 2"
                    else -> "Obesidade grau 3"
                }
                txtResultado.text = "IMC: %.2f\n%s".format(imc, classificacao)
            } else {
                txtResultado.text = "Digite algum valor"
            }
        }

        btnVoltar = findViewById(R.id.btnVoltar)
        btnVoltar.setOnClickListener {val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }
    }
}