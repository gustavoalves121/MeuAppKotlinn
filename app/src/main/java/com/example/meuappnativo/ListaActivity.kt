package com.example.meuappnativo

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ListView
import android.widget.ArrayAdapter
import android.widget.Button
import com.example.meuappnativo.R
import com.google.android.material.floatingactionbutton.FloatingActionButton

class ListaActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_lista)
        setTitle("@Contatinhos")

        val lista = findViewById<ListView>(R.id.lstContatos)
        val contatos = arrayOf("contato 1", "contato 2", "contato 3", "contato 4")
        val adaptador = ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, contatos)
        lista.setAdapter(adaptador)


        val botao = findViewById<FloatingActionButton>(R.id.fabAdiciona)
        botao.setOnClickListener {

            val intent = Intent(this, CadastroActivity::class.java)
            startActivity(intent)
        }
    }
}