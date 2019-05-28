package kr.co.woobi.imyeon.diceroller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import java.util.*

class MainActivity : AppCompatActivity() {

    lateinit var imageDice: ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val buttonRoll: Button = findViewById(R.id.button_roll)
        buttonRoll.setOnClickListener {
            Toast.makeText(this, "button Clicked", Toast.LENGTH_SHORT).show()
            rollDice()
        }
        imageDice=findViewById(R.id.image_dice)
    }

    private fun rollDice() {
        val textResult: TextView = findViewById(R.id.text_result)
        val randomInt = Random().nextInt(6) + 1
        textResult.text = randomInt.toString()

        val drawableResource = when (randomInt) {
            1 -> R.drawable.dice_1
            2 -> R.drawable.dice_2
            3 -> R.drawable.dice_3
            4 -> R.drawable.dice_4
            5 -> R.drawable.dice_5
            else -> R.drawable.dice_6
        }
        imageDice.setImageResource(drawableResource)

    }
}
