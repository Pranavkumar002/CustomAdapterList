package com.pranavkumar.customadapterlist

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.pranavkumar.customadapterlist.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(R.layout.activity_main)
    }
}