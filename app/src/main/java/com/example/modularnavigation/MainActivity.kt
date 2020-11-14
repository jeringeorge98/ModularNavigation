package com.example.modularnavigation

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.navigation.findNavController
import androidx.navigation.ui.setupWithNavController
import com.google.android.material.bottomnavigation.BottomNavigationView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

       val bottom_nav= findViewById<BottomNavigationView>(R.id.bottom_nav)

        val navController = findNavController(R.id.mainNavHostFragment)

        bottom_nav.setupWithNavController(navController)

    }



}