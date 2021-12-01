package com.example.meuappnativo

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.example.meuappnativo.R

class CadastroActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_cadastro)
        setTitle("Novo Contato")

        val botaocancelar = findViewById<Button>(R.id.btnCancelar)
        botaocancelar.setOnClickListener {

            finish()    }

        val botaosalvar = findViewById<Button>(R.id.btnSalvar)

        botaosalvar.setOnClickListener {

            val intent = Intent(this, ListaActivity::class.java)
            startActivity(intent)}

        val intent = getIntent()
        intent.getCharSequenceExtra("id")


    }
}