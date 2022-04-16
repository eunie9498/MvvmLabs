package com.mvvm.labs.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.mvvm.labs.R

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //move to fragment without no arguments
        val fragment = GameFragment()
        supportFragmentManager.beginTransaction().replace(R.id.activity_component, fragment)
            .commit()
    }

}