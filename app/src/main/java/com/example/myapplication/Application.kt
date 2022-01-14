package com.example.myapplication

import android.app.Application
import android.content.res.Configuration
import android.util.Log
import android.widget.Toast

class Application: Application() {
    override fun onCreate() {
        super.onCreate()
        Log.d("Application","onCreate")
    }

    override fun onConfigurationChanged(newConfig: Configuration) {
        super.onConfigurationChanged(newConfig)
        Toast.makeText(this,"orientation",Toast.LENGTH_SHORT).show()
    }
}