package com.example.snigdha.myfirstapp

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
// toast button
    fun toastMe(view: View) {
        // should create a short message saying "hello toast"
        val myToast = Toast.makeText(this, "Hello Toast!", Toast.LENGTH_SHORT)
        // this part should show the message on the screen
        myToast.show()
    }
// count button
    fun countMe (view: View) {
        // what value is in the text view? we will get it
        val countString = textView.text.toString()
        // string to number (int) converter
        var count: Int = Integer.parseInt(countString)
        count++
        // this part should show the value that we have incremented
        textView.text = count.toString()
    }

//random button
    fun randomMe (view: View) {
        // intent
        val randomIntent = Intent(this, SecondActivity::class.java)
        val countString = textView.text.toString()
        val count = Integer.parseInt(countString)
        randomIntent.putExtra(SecondActivity.TOTAL_COUNT, count)
        startActivity(randomIntent)
    }

    fun resetMe (view: View) {
       // reset the counter to 0
        val countString = textView.text.toString()
        // all we are doing is creating an int of 0
        val count: Int = 0
        textView.text = count.toString()

    }
}
