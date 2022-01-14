package com.example.myapplication

import android.app.SearchManager
import android.content.Intent
import android.content.res.Configuration
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.MediaStore
import android.util.Log
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.core.app.ActivityCompat.startActivityForResult




class MainActivity : AppCompatActivity() {
//    private lateinit var text : String
    private val man_hinh_1: Button by lazy {
        findViewById(R.id.man_hinh_1)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Log.d("MainActivity","onCreate")
        Log.d("MainActivity", savedInstanceState?.toString()?:"null")

        //text = hello.text.toString()
        man_hinh_1.setOnClickListener {
            startActivity(Intent(this@MainActivity,MainActivity2::class.java).also { intent ->
                intent.flags = Intent.FLAG_ACTIVITY_NEW_TASK or Intent.FLAG_ACTIVITY_CLEAR_TASK

            })
//            val email = Intent(Intent.ACTION_SEND, Uri.parse("mailto:"))
//            email.putExtra(Intent.EXTRA_EMAIL, "Email nhận")
//            email.putExtra(Intent.EXTRA_SUBJECT, "Tiêu đề")
//            email.putExtra(Intent.EXTRA_TEXT, "Nội dung")
//            startActivity(Intent.createChooser(email, "Title của cửa sổ chọn ứng dụng để gửi"))

//            val query = "Từ cần search"
//            val intent = Intent(Intent.ACTION_WEB_SEARCH)
//            intent.putExtra(SearchManager.QUERY, query)
//            startActivity(intent)

//            val intent = Intent()
//            intent.action = Intent.ACTION_VIEW
//            intent.flags = Intent.FLAG_ACTIVITY_NEW_TASK or Intent.FLAG_ACTIVITY_CLEAR_TASK
//            intent.type = "image/*" // mở tất cả ứng dụng */* hoặc các loại khác application/*
//            intent.flags = Intent.FLAG_ACTIVITY_NEW_TASK
//            startActivity(intent)

//            val i = Intent(Intent.ACTION_PICK, MediaStore.Images.Media.EXTERNAL_CONTENT_URI)
//            i.flags = Intent.FLAG_ACTIVITY_NEW_TASK or Intent.FLAG_ACTIVITY_CLEAR_TASK
//            startActivityForResult(i, 5) // requestcode  kiểu int

        }

        savedInstanceState?.let{ savedInstanceState ->

        }
        Intent().let{ intent -> // lưu dữ liệu

        }
    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)
        if(requestCode == 5) {

        }
    }

    override fun onStart() {
        super.onStart()
        Log.d("MainActivity","onStart")
    }

    override fun onResume() {
        super.onResume()
        Log.d("MainActivity","onResume")
    }

    override fun onPause() {
        super.onPause()
        Log.d("MainActivity","onPause")
    }

    override fun onStop() {
        super.onStop()
        Log.d("MainActivity","onStop")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d("MainActivity","onDestroy")
    }

    override fun onRestart() {
        super.onRestart()
        Log.d("MainActivity","onRestart")
    }

    override fun onSaveInstanceState(outState: Bundle) {
        super.onSaveInstanceState(outState)
        Log.d("MainActivity","onSaveInstanceState")
        Log.d("MainActivity",outState.toString())
        outState.putString("Key","value ")
    }

    override fun onRestoreInstanceState(savedInstanceState: Bundle) {
        super.onRestoreInstanceState(savedInstanceState)
        Log.d("MainActivity","onRestoreInstanceState")
        Log.d("MainActivity",savedInstanceState.toString())
        Log.d("onRestoreInstanceState",savedInstanceState.getString("Key",""))
    }

    override fun onConfigurationChanged(newConfig: Configuration) {
        super.onConfigurationChanged(newConfig)
        onSaveInstanceState(Bundle())
        when(newConfig.orientation) {
            Configuration.ORIENTATION_LANDSCAPE ->{
                //Log.d("MainActivity","Landscape")
                Toast.makeText(this,"Landscape",Toast.LENGTH_SHORT).show()
            }
            Configuration.ORIENTATION_PORTRAIT ->{
               // Log.d("MainActivity","Portrait")
                Toast.makeText(this,"Portrait",Toast.LENGTH_SHORT).show()
            }
        }
    }

}