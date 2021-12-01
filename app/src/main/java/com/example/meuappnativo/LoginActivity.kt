package com.example.meuappnativo




import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.content.Intent

import com.example.meuappnativo.R



class LoginActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)


        val texto = findViewById<TextView>(R.id.txtEmail)
        val email = findViewById<EditText>(R.id.editEmail)
        val botao = findViewById<Button>(R.id.btnEntrar)


        botao.setOnClickListener {

            val intent = Intent(this, ListaActivity::class.java)
            startActivity(intent)
        }


        }
    }
