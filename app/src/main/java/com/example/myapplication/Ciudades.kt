package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.Toast

class Ciudades : AppCompatActivity() {

    val TAG = "com.example.myapplication.Ciudades.CIUDAD"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ciudades)

        val btnQuito = findViewById<Button>(R.id.btnQuito);
        val btnBerlin = findViewById<Button>(R.id.btnMoscu);

        btnQuito.setOnClickListener(View.OnClickListener {
            //Toast.makeText(this,"Ciudad de Quito",Toast.LENGTH_SHORT).show();
            val intent = Intent(this,MainActivity::class.java);
            intent.putExtra(TAG,"ciudadQuito");
            startActivity(intent);
        })

        btnBerlin.setOnClickListener(View.OnClickListener {
            //Toast.makeText(this,"Ciudad de Berlin",Toast.LENGTH_SHORT).show();
            val intent2 = Intent(this,MainActivity::class.java);
            intent2.putExtra(TAG,"ciudadBerlin");
            startActivity(intent2);
        })
    }
}