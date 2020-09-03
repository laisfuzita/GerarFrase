package com.lais.appseufuturo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.appcompat.view.menu.ShowableListMenu
import kotlinx.android.synthetic.main.activity_resultado.*
import kotlin.random.Random

class ResultadoActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_resultado)

        btnRevelarResultado.setOnClickListener {
            if(txtFraseResultado.text.isEmpty()){
                gerarResultado()
            }
        }

        btnRefazerResultado.setOnClickListener {
            if(txtFraseResultado.text.isNotEmpty()){
                gerarResultado()
            }
        }
    }

    private fun gerarResultado() {
        val frase = listOf(
            "Seus dias de pobreza estão contados! Chega de contar moedas.",
            "Huuum...acho melhor começar a rever os seus caminhos desde já!",
            "Sabe aquele ditado que diz azar no jogo e sorte no amor? Pois é...",
            "Você conquistará uma habilidade que nunca tinha pensado em ter.",
            "Como diz o Luan Santana: Eu, você, dois filhos e um cachorro.",
            "Uau...prepara a pipoca, você será uma grande estrela do cinema.",
            "Oi seguimores! Sim, você se tornou a grande celebridade das redes sociais.",
            "Prepare as malas, você ainda vai viajar muito pelo o mundo!",
            "Mas que maravilha, você dará aula de Kotlin para a Estação Hack."
        )
        val resultado = frase.random()
        txtFraseResultado.setText(resultado)
    }

}