package com.example.cardie

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import java.util.*

class MainActivity : AppCompatActivity() {
    val choiceList = arrayOf("Starting with you, name the national parks found in Kenya. Whoever fails or delays, drinks.","Starting with you, list colors in swahili. Whoever fails or delays, drinks","If the number of players is odd, every player drinks.","Starting with you, list Kenya's top exports. Whoever fails or delays drinks.","Challenge the player on right to give names of all the countries bordering Kenya in alphabetical order","The person on your right to carry you around the room.","Starting with you, give names of all Kenya's vice presidents. Whoever fails or delays, drinks","Challenge your left player to say 'she saw Susie sitting in a shoeshine shop' 5 times.","Starting with you, list names of any football player in Kenya.Whomever fails or delays drinks.","Starting with you, list names of any music artist in Kenya","Going in circles, give Kenya's top local slang. eg 'Naenda hivi nakam.'","Challenge the player on your left to sing the second verse of the Kenya national anthem","The player whose name starts with alphabets to do 15 squarts. Failed? let him or her drink.", "Starting with you, name popular rivers in Kenya. The person that delays to drink.", " Starting with you name Hills in Kenya, the person the delays or fail to drink","Starting with you name volcanic mountains in Kenya the one that delays drinks", "Every player to shout 'Wamlambez'", "All players in relationships to drink","This player to keep a flag as he/she can use it to dare other player to do the dare instead.","This player to keep a flag as he/she can use it to dare other player to do the dare instead.","Every player who has never been to Kisumu drinks","Choose a player of your will to stand up and twerk. If the player fails, he/she drinks")
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