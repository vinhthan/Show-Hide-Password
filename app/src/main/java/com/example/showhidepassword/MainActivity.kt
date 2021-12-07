package com.example.showhidepassword

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.InputType
import android.widget.CheckBox
import android.widget.EditText

class MainActivity : AppCompatActivity() {
    lateinit var edtPass : EditText
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var cb: CheckBox = findViewById(R.id.cb)
        edtPass = findViewById(R.id.edtPass)
        cb.setOnClickListener {
            if (cb.isChecked) {
                edtPass.inputType = 1
            } else {
                edtPass.inputType = InputType.TYPE_CLASS_TEXT or InputType.TYPE_TEXT_VARIATION_PASSWORD
            }
        }
    }
}