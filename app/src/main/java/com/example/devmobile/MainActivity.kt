package com.example.devmobile

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    private lateinit var btnIMC: Button
    private lateinit var btnSobre: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnIMC = findViewById(R.id.btnIMC)
        btnIMC.setOnClickListener {val intent = Intent(this, SegundaTela::class.java)
            startActivity(intent)
        }

        btnSobre = findViewById(R.id.btnSobre)
        btnSobre.setOnClickListener {val intent = Intent(this, TerceiraTela::class.java)
        startActivity(intent)
        }

    }
}