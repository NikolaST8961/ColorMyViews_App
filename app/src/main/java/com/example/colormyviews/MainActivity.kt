package com.example.colormyviews

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.graphics.Color
import android.widget.Button


class MainActivity : AppCompatActivity() {
    lateinit var btn1:Button
    lateinit var btn2:Button
    lateinit var btn3:Button
    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setListeners()
        btn1 = findViewById(R.id.btnColor1)
        btn2 = findViewById(R.id.btnColor2)
        btn3 = findViewById(R.id.btnColor3)
        btn1.setOnClickListener{
            coloredFirstBtn()
        }
        btn2.setOnClickListener{
            coloredSecondBtn()
        }
        btn3.setOnClickListener{
            coloredThirdBtn()
        }

    }
    private fun coloredFirstBtn(){
        val box1:View = findViewById(R.id.box_one_text)
        box1.setBackgroundColor(Color.BLUE)
    }
    private fun coloredSecondBtn(){
        val box2:View = findViewById(R.id.box_two_text)
        box2.setBackgroundColor(Color.MAGENTA)
    }
    private fun coloredThirdBtn(){
        val box3:View = findViewById(R.id.box_three_text)
        box3.setBackgroundColor(Color.YELLOW)
    }


    private fun setListeners() {
        val clickableViews: List<View> =
            listOf(findViewById(R.id.box_one_text), findViewById(R.id.box_two_text), findViewById(R.id.box_three_text),
                findViewById(R.id.box_four_text), findViewById(R.id.box_five_text))

        for (item in clickableViews) {
            item.setOnClickListener { makeColored(it) }
        }
    }

    private fun makeColored(view: View) {
        when (view.id) {

            // Boxes using Color class colors for background
            R.id.box_one_text -> view.setBackgroundColor(Color.DKGRAY)
            R.id.box_two_text -> view.setBackgroundColor(Color.GRAY)

            // Boxes using Android color resources for background
            R.id.box_three_text -> view.setBackgroundResource(android.R.color.holo_green_light)
            R.id.box_four_text -> view.setBackgroundResource(android.R.color.holo_green_dark)
            R.id.box_five_text -> view.setBackgroundResource(android.R.color.holo_green_light)

            else -> view.setBackgroundColor(Color.BLUE)
        }
}
}