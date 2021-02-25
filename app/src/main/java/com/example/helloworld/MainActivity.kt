package com.example.helloworld

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Para referenciar direto pelo id do componente é necessario adiocionar id 'kotlin-android-extensions'
        // na build.gradle(:app)

        val btCalcular = calcular
        val resultado = resultado

        btCalcular.setOnClickListener {

            val primeiraNota = Integer.parseInt(primeiraNota.text.toString())
            val segundaNota = Integer.parseInt(segundaNota.text.toString())
            val media = (primeiraNota + segundaNota)/2

            val faltas = Integer.parseInt(faltas.text.toString())

            if (media >= 6 && faltas <= 10)
            {
                resultado.setText("Aluno aprovado: " + media + "\n Com " + faltas + " faltas.")
                resultado.setTextColor(Color.GREEN)
            }
            else
            {
                resultado.setText("Aluno reprovado: " + media + "\n Com " + faltas + " faltas.")
                resultado.setTextColor(Color.RED)
            }
        }
    }
}