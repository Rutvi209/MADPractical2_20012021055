package com.example.madpractical2_20012021055

import android.nfc.Tag
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import androidx.constraintlayout.widget.ConstraintLayout
import com.google.android.material.snackbar.Snackbar

class MainActivity : AppCompatActivity() {
    private val Tag = "MainActivity"
    private lateinit var mylayout: ConstraintLayout;
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        mylayout= findViewById(R.id.mylayout);
        Log.i(Tag,"onCreate function called:")
        Toast.makeText(this, "onCreate function called",Toast.LENGTH_SHORT).show()
        Snackbar.make(findViewById(R.id.mylayout), "onCreate function called",
        Snackbar.LENGTH_SHORT).show()
    }
    private fun showmessage(msg: String) {
        Log.i(Tag,msg)
        Toast.makeText(applicationContext,msg, Toast.LENGTH_SHORT).show()
    }

    override fun onStart() {
        super.onStart()
        showmessage("start function called")
        Snackbar.make(findViewById(R.id.mylayout),"onStart function called",
        Snackbar.LENGTH_SHORT).show()

    }

    override fun onResume() {
        super.onResume()
        showmessage("onResume function called")
        Snackbar.make(findViewById(R.id.mylayout),"onResume function called",
        Snackbar.LENGTH_SHORT).show()
    }

    override fun onPause() {
        super.onPause()
        showmessage("onPause function called")
        Snackbar.make(findViewById(R.id.mylayout),"onPause function called",
        Snackbar.LENGTH_SHORT).show()

    }

    override fun onStop() {
        super.onStop()
        showmessage("onStop function called")
        Snackbar.make(findViewById(R.id.mylayout),"onStop function called",
        Snackbar.LENGTH_SHORT).show()
    }

    override fun onDestroy() {
        super.onDestroy()
        showmessage("onDestroy function called")
        Snackbar.make(findViewById(R.id.mylayout),"onDestroy function called",
        Snackbar.LENGTH_SHORT).show()
    }

    override fun onRestart() {
        super.onRestart()
        showmessage("onRestart function called")
        Snackbar.make(findViewById(R.id.mylayout),"onRestart function called",
        Snackbar.LENGTH_SHORT).show()
    }

}