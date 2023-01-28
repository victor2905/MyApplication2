package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    var txtVCiudad:TextView? = null
    var txtVGrados:TextView? = null
    var txtVEstatus:TextView? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        txtVCiudad = findViewById(R.id.txtViewCiudad);
        txtVGrados = findViewById(R.id.txtViewGrados);
        txtVEstatus = findViewById(R.id.txtViewStatus);

        val ciudad = intent.getStringExtra("com.example.myapplication.Ciudades.TAG");

        val cQuito = Ciudad("ciudadQuito",25,"Soleado");
        val cBerlin = Ciudad("ciudadBerlin",-8,"Frio");

        if (ciudad == "ciudadQuito") {
            //Mostrar informacion Ciudad de Quito
            txtVCiudad?.text = cQuito.nombre
            txtVGrados?.text = cQuito.grados.toString() + "°"
            txtVEstatus?.text = cQuito.estatus
        }
        else if (ciudad == "ciudadBerlin"){
            //Mostrar informacion Ciudad de Berlin
            txtVCiudad?.text = cQuito.nombre
            txtVGrados?.text = cQuito.grados.toString() + "°"
            txtVEstatus?.text = cQuito.estatus
        }
        else {
            Toast.makeText(this,ciudad,Toast.LENGTH_SHORT).show();
        }

    }
}