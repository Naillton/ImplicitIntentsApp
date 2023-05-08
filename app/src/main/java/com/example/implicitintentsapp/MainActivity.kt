package com.example.implicitintentsapp

/*
    Intencoes implicitas sao usadas quando queremos fazer com que o app implicitamente faca algo,
    usando o Intent implícito, os componentes não podem ser especificados.

*/

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btn: Button = findViewById(R.id.button)

        btn.setOnClickListener {
            // definindo uma intencao e passando como paremetro do valor da intencao uma acao de view
            val intent = Intent(Intent.ACTION_VIEW)
            // definindo o data que vai conter o caminho do site especificado
            intent.data = Uri.parse("https://www.google.com")
            startActivity(intent)
        }
    }
}