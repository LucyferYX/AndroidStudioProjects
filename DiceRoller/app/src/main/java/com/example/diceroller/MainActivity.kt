package com.example.diceroller

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.diceroller.ui.theme.DiceRollerTheme
import android.widget.Button
import android.widget.TextView

/**
 * This activity allows the user to roll a dice
 * and view the result on the screen.
 */
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            DiceRollerTheme {
                setContentView(R.layout.activity_main)
                val rollButton: Button = findViewById(R.id.button)
                rollButton.setOnClickListener {
                    val resultTextView: TextView = findViewById(R.id.textView)
                    rollButton.setOnClickListener {
                        rollDice()
                    }
                }
            }
        }
    }

    /**
    Roll the dice and update the screen with the result.
     */
    private fun rollDice() {
        val dice = Dice(6)
        val diceRoll = dice.roll()
        val resultTextView: TextView = findViewById(R.id.textView)
        resultTextView.text = diceRoll.toString()
    }
}

class Dice(private val numSides: Int) {
    fun roll(): Int {
        return (1..numSides).random()
    }
}

//@Composable
//fun Greeting(name: String, modifier: Modifier = Modifier) {
//    Text(
//        text = "Hello $name!",
//        modifier = modifier
//    )
//}

//@Preview(showBackground = true)
//@Composable
//fun GreetingPreview() {
//    DiceRollerTheme {
//        Greeting("Android")
//    }
//}