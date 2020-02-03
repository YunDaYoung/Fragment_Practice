package com.example.fragment01

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btn1.setOnClickListener {
            supportFragmentManager.beginTransaction()
                .replace(R.id.fragment, AFragment())
                .commit()
        }
        btn2.setOnClickListener {
            supportFragmentManager.beginTransaction()
                .replace(R.id.fragment, BFragment())
                .commit()
        }
    }
}
