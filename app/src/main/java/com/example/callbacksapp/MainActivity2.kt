package com.example.callbacksapp

import android.content.ContentValues.TAG
import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
        showToast(this,"onCreate Activity 2")
        Log.d(TAG, "onCreate: ")
    }
    override fun onStart() {
        super.onStart()
        showToast(this,"onStart Activity 2")
        Log.d(TAG, "onStart: ")

    }

    override fun onResume() {
        super.onResume()
        showToast(this,"onResume Activity 2")
        Log.d(TAG, "onResume: ")
    }

    override fun onPause() {
        super.onPause()
        showToast(this,"onPause Activity 2")
        Log.d(TAG, "onPause: ")
    }

    override fun onStop() {
        super.onStop()
        showToast(this,"onStop Activity 2")
        Log.d(TAG, "onStop: ")
    }

    override fun onDestroy() {
        super.onDestroy()
        showToast(this,"onDestroy Activity 2")
        Log.d(TAG, "onDestroy: ")
    }

    fun showToast(context: Context, state:String)
    {
        Toast.makeText(context,state, Toast.LENGTH_SHORT).show()
    }
    }
