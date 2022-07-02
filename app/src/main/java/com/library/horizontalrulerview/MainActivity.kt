package com.library.horizontalrulerview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import com.library.rullerview.RulerView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val text: TextView = findViewById(R.id.value)
        val rulerView: RulerView = findViewById(R.id.rulerView)

        rulerView.setOnValueChangedListener(object :RulerView.OnValueChangedListener{
            override fun onValueChanged(value: Float) {
                text.text = value.toString()
            }

        })
    }
}