package com.camacho.givenatrandom

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import java.util.*
import kotlinx.android.synthetic.main.activity_main.activity_main__btn__button_principal as giveAtRandomBtn
import kotlinx.android.synthetic.main.activity_main.activity_main__img__img_dice as diceImg

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        giveAtRandomBtn.setOnClickListener {
            generateDiceRandom()
        }
    }

    private fun generateDiceRandom() {
        val randomInt = Random().nextInt(6) + 1
        val imageToLoad = when(randomInt) {
            1 -> R.drawable.dado_1
            2 -> R.drawable.dado_2
            3 -> R.drawable.dado_3
            4 -> R.drawable.dado_4
            5 -> R.drawable.dado_5
            6 -> R.drawable.dado_6
            else -> R.drawable.dado_vacio
        }
        diceImg.setImageResource(imageToLoad)
    }
}