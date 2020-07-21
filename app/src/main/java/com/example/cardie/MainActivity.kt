package com.example.cardie

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import java.util.*

class MainActivity : AppCompatActivity() {
    val choiceList = arrayOf("Staring with you, name the national parks found in Kenya","Starting with you, list colors in swahili. However fails or delays, drinks","Starting with you, list Kenya's top exports","Challenge the player on right to give names of all the countries bordering Kenya in alphabetical order","The person on your right to carry you around the room.","Who was the first president of the Republic of Kenya?","Starting with you, list the tribes in Kenya","Starting with you, list names of any football player in Kenya","Starting with you, list names of any music artist in Kenya","Challenge the player on your left to sing the second verse of the Kenya national anthem","The player whose name starts with alphabets to do 20 squarts", "Starting with you, name popular rivers in Kenya. The person that delays to drink.", " Starting with you name Hills in Kenya, the person the delays to drink","Starting with you name volcanic mountains in Kenya the one that delays drinks", "Every player to shout 'Wamlambez'", "All players in relationships to drink","This playe to keep this as you can use it to dare other player to do your dare.","Every player who has never been to Kisumu drinks")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        trigger.setOnClickListener{
            val random= Random()
            val randomOutput= random.nextInt(choiceList.count())
            output.text=choiceList[randomOutput]
        }

    }
}