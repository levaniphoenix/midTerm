package com.levaniphoenix.midterm

import android.content.Context
import android.content.Intent
import android.content.SharedPreferences
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.ImageButton
import android.widget.TextView

class MainActivity2 : AppCompatActivity() {

    lateinit var imageButton: ImageButton
    lateinit var textView: TextView
    lateinit var sharedPref:SharedPreferences

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
        sharedPref = getSharedPreferences("Prefs",Context.MODE_PRIVATE)

        imageButton = findViewById(R.id.button2)
        textView = findViewById(R.id.textView2)

        if(sharedPref.getString("personName", "default") == "default")
            Log.d("bruh","BRUH!")
        else
            textView.setText("Hello, " + sharedPref.getString("personName", "default"))

        imageButton.setOnClickListener(View.OnClickListener {
            finish()
        })
    }
}