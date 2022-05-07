package com.levaniphoenix.midterm

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.ImageButton

class MainActivity : AppCompatActivity() {
    lateinit var editText:EditText
    lateinit var button:Button
    lateinit var imageButton: ImageButton

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val sharedPref = getSharedPreferences("Prefs",Context.MODE_PRIVATE)
        editText = findViewById(R.id.editTextTextPersonName)
        button = findViewById(R.id.button)
        imageButton = findViewById(R.id.button1)

        button.setOnClickListener(View.OnClickListener {
            if(editText.text.isNotEmpty())
                sharedPref.edit().putString("personName", editText.text.toString()).apply()
            val intent = Intent(this,MainActivity2::class.java)
            startActivity(intent)
        })

        imageButton.setOnClickListener(View.OnClickListener {

            val intent = Intent(this,MainActivity2::class.java)
            startActivity(intent)
        })
    }

}