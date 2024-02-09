package com.example.getirclone

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        ilkFragment(findViewById<View>(R.id.frameLayout))
    }

    fun ilkFragment(view: View){

        val fragmentManager = supportFragmentManager
        val fragmentTransaction = fragmentManager.beginTransaction()

        val ilkFragment = BlankFragment()
        fragmentTransaction.replace(R.id.frameLayout, ilkFragment).commit()

    }

    fun ikinciFragment(view: View){

        val fragmentManager = supportFragmentManager
        val fragmentTransaction = fragmentManager.beginTransaction()

        val ikinciFragment = BlankFragment2()
        fragmentTransaction.replace(R.id.frameLayout, ikinciFragment).commit()

    }

}