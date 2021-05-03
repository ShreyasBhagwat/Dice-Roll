package com.example.diceroller

import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

lateinit var diceImage:ImageView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        diceImage= findViewById(R.id.dice_image)
        val rollButton: Button = findViewById(R.id.button)


        rollButton.setOnClickListener {
            rollDice()
            Toast.makeText(this, "Dice Rolled", Toast.LENGTH_SHORT).show()
        }


    }

    private fun rollDice() {
        //New dice obj with 6 side and rolling it
        //Updating the screen with dice roll
        val drawableResource = when ((1..6).random()) {
            1 -> R.drawable.dice_1
            2 -> R.drawable.dice_2
            3 -> R.drawable.dice_3
            4 -> R.drawable.dice_4
            5 -> R.drawable.dice_5
            else -> R.drawable.dice_6
        }
        diceImage.setImageResource(drawableResource)
    }

}
