package com.app.sampleapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import io.github.typeratingbar.TypeRatingBar

class MainActivity : AppCompatActivity() {

    lateinit var typeRatingBar : TypeRatingBar
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

    }
}