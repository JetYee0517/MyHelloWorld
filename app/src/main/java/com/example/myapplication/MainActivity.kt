package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import kotlinx.android.synthetic.main.activity_main.*

//MainActivity is an instance of AppCompatActivity
class MainActivity : AppCompatActivity() {

    //onCreate = main() function
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        //Display UI. R = resources
        setContentView(R.layout.activity_main)
        //TODO : Continue your code here
        //val = value, var = variable
        // link code (variable name) to UI
        //val buttonShowName: Button = findViewById(R.id.buttonShowName)
        buttonShowName.setOnClickListener { showName() }
        buttonShowName2.setOnClickListener { reset() }
    }

    private fun reset() {
        textViewName.setText("Hello World!")
    }

    private fun showName() {
        textViewName.setText("Hello Jet Yee")
    }
}
