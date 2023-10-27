package com.example.tiptime

import android.annotation.SuppressLint
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
import com.example.tiptime.R.string
import com.example.tiptime.ui.theme.TipTimeTheme
import com.example.tiptime.databinding.ActivityMainBinding
import java.text.NumberFormat

class MainActivity : ComponentActivity() {

    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(R.layout.activity_main)
//        binding.calculateButton.setOnClickListener { calculateTip() }
    }
//    @SuppressLint("StringFormatInvalid")
//    private fun calculateTip() {
//        val stringInTextField = binding.costOfService.text.toString()
//        if (stringInTextField.isEmpty()) {
//            binding.tipResult.text = ""
//            return
//        }
//        val cost = stringInTextField.toDouble()
//        val tipPercentage = when (binding.tipOptions.checkedRadioButtonId) {
//            R.id.option_twenty_percent -> 0.20
//            R.id.option_eighteen_percent -> 0.18
//            else -> 0.15
//        }
//        var tip = tipPercentage * cost
//        if (binding.roundUpSwitch.isChecked) {
//            tip = kotlin.math.ceil(tip)
//        }
//        val formattedTip = NumberFormat.getCurrencyInstance().format(tip)
//        binding.tipResult.text = getString(R.string.tip_amount, formattedTip)
//    }
}

//@Composable
//fun Greeting(name: String, modifier: Modifier = Modifier) {
//    Text(
//        text = "Hello $name!",
//        modifier = modifier
//    )
//}
//
//@Preview(showBackground = true)
//@Composable
//fun GreetingPreview() {
//    TipTimeTheme {
//        Greeting("Android")
//    }
//}