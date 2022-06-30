package com.example.project1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun createBdaycard(view: android.view.View) {

        val name=nameInput.editableText.toString()

        val intent = Intent(this,BIRTHDAYGREETING::class.java)
        intent.putExtra(BIRTHDAYGREETING.NAME_EXTRA,name)
        startActivity(intent)

    }




}