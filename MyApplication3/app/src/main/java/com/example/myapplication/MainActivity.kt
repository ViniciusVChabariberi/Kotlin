package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.RadioButton

class MainActivity : AppCompatActivity() {
    lateinit var editText:EditText
    lateinit var celsiusRadio:RadioButton
    lateinit var fahreinheitRadioButton: RadioButton
    lateinit var converterButton: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        editText = findViewById(R.id.valorTemp) as EditText
        celsiusRadio = findViewById(R.id.celsiusRadio) as RadioButton
        fahreinheitRadioButton = findViewById(R.id.fahrinheitRadio) as RadioButton
        converterButton = findViewById(R.id.converterButton) as Button
        converterButton.setOnClickListener{ converter(it) }
    }
    fun converter(view: View){
        var temp:Double = editText.text.toString().toDouble()
        if (celsiusRadio.isChecked){
            temp = (temp - 32)*5/9
        } else if (fahreinheitRadioButton.isChecked){
            temp = temp*9/5+32
        }
        editText.setText(temp.toString())
    }
}