package com.app.matches_simulator

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.app.matches_simulator.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        /*metodo de acesso aos componentes de um layout sem View Binding:
            setContentView(R.layout.activity_main)
            val tvHello = findViewById<TextView>(R.id.tvHello)
        */

        /*utiliza do View Binding para facilitar o acesso aos componentes definidos via layout XML
        * tornando as chamadas do método findViewById desnecessarias*/
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        //binding.tvHello.text = "Teste Binding"
    }
}