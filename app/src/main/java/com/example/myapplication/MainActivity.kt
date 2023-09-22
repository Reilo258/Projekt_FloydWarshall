package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton
import android.widget.SeekBar
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    private lateinit var buttons: List<ImageButton>
    private lateinit var slider: SeekBar
    private lateinit var wagalbl: TextView
    private lateinit var floydWarshallbtn: Button
    private lateinit var ustawwagebtn: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        buttons = listOf(
            findViewById(R.id.button1),
            findViewById(R.id.button2),
            findViewById(R.id.button3),
            findViewById(R.id.button4),
            findViewById(R.id.button5)
        )
        slider = findViewById(R.id.slider)
        wagalbl = findViewById(R.id.wagalbl)
        ustawwagebtn = findViewById(R.id.wagabtn)
        floydWarshallbtn = findViewById(R.id.algorytmbtn)

    }
}