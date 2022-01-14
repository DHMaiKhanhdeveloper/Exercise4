package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity3 : AppCompatActivity() {
    private val man_hinh_3: Button by lazy {
        findViewById(R.id.man_hinh_3)
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main3)

        man_hinh_3.setOnClickListener{
            startActivity(Intent(this@MainActivity3,MainActivity4::class.java))
        }
    }
}