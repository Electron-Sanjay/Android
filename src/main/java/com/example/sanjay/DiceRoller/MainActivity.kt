package com.example.sanjay.DiceRoller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val rollbutton: Button = findViewById(R.id.button)
        rollbutton.setOnClickListener {
            Toast.makeText(this,"Dice Rolled",Toast.LENGTH_SHORT).show()
            Thread.sleep(1000)
            RollDice()
        }


    }

    private fun RollDice() {
         val dice = Dice(6)
        val diceroll=dice.Roll()
        val txtview: TextView = findViewById(R.id.textView)
        txtview.text = diceroll.toString()




    }
}
class Dice(val numsides:Int){
    fun Roll() :Int{
        return (1..numsides).random()
    }
}