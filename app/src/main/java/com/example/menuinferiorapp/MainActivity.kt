package com.example.menuinferiorapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import androidx.appcompat.app.ActionBar
import androidx.fragment.app.Fragment
import com.example.menuinferiorapp.databinding.ActivityMainBinding
import com.google.android.material.bottomnavigation.BottomNavigationView

class MainActivity : AppCompatActivity() {
    //lateinit var toolbar: ActionBar
    //private lateinit var binding: ActivityMainBinding
    lateinit var bottomNav : BottomNavigationView
    override fun onCreate(savedInstanceState: Bundle?) {
        setContentView(R.layout.activity_main)
        bottomNav = findViewById(R.id.bottomNavigationView)

        super.onCreate(savedInstanceState)
        //binding = ActivityMainBinding.inflate(layoutInflater)
        //setContentView(binding.root)
        replaceFragment(FragmentTrofeos())
        val menu: Menu

        //bottonNav.setOnItemSelectedListener

        bottomNav.setOnItemSelectedListener{
            when(it.itemId){


                R.id.trofeos -> replaceFragment(FragmentTrofeos())

                R.id.abuelita -> replaceFragment(FragmentAbuelita())

                R.id.luna -> replaceFragment(FragmentLuna())

                else -> {

                }
            }
            true
        }
    }
    private fun replaceFragment(fragment : Fragment){
        val fragmentManager = supportFragmentManager
        val fragmentTransaction = fragmentManager.beginTransaction()
        fragmentTransaction.replace(R.id.frame_layout,fragment)
        fragmentTransaction.commit()

    }
}