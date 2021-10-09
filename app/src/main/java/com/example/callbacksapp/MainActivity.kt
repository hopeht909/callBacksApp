package com.example.callbacksapp

import android.content.ContentValues.TAG
import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        showToast(this,"onCreate Activity 1")
        Log.d(TAG,"onCreate Activity 1")
        val btStartActivity2 = findViewById<Button>(R.id.button)

        btStartActivity2.setOnClickListener(object : View.OnClickListener{
            override fun onClick(v: View?) {
                val intent = Intent(this@MainActivity , MainActivity2::class.java)
                startActivity(intent)
            }

        })
    }

    override fun onStart() {
        super.onStart()
        showToast(this,"onStart Activity 1")
        Log.d(TAG,"onSatrt Activity 1")
    }

    override fun onResume() {
        super.onResume()
        showToast(this,"onResume Activity 1")
        Log.d(TAG,"onResume Activity 1")
    }

    override fun onPause() {
        super.onPause()
        showToast(this,"onPause Activity 1")
        Log.d(TAG,"onPause Activity 1")
    }

    override fun onStop() {
        super.onStop()
        showToast(this,"onStop Activity 1")
        Log.d(TAG,"onStop Activity 1")
    }

    override fun onDestroy() {
        super.onDestroy()
        showToast(this,"onDestroy Activity 1")
        Log.d(TAG,"onDestroy Activity 1")
    }

    fun showToast(context : Context , state : String){
        Toast.makeText(context,state, Toast.LENGTH_LONG).show()
    }
}