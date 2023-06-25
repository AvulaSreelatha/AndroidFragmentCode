package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.widget.LinearLayoutCompat
import androidx.fragment.app.Fragment
import com.example.myapplication.Fragments.FirstFragment
import com.example.myapplication.Fragments.SecondFragment

class MainActivity : AppCompatActivity() {
    lateinit var firstButton:Button
    lateinit var secondButton:Button
    lateinit var linearLayout:LinearLayoutCompat
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        firstButton=findViewById(R.id.button1)
        secondButton=findViewById(R.id.button2)
        linearLayout=findViewById(R.id.layoutlinear)
        firstButton.setOnClickListener{
            // var fragmentFirst:Fragment = FirstFragment()
            supportFragmentManager.beginTransaction().replace(R.id.layoutlinear,FirstFragment()).commit()

        }
        secondButton.setOnClickListener{
            //var fragmentSecond:Fragment = SecondFragment()
            supportFragmentManager.beginTransaction().replace(R.id.layoutlinear,SecondFragment()).commit()

        }

    }
}