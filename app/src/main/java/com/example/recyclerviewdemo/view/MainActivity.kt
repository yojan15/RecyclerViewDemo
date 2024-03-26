package com.example.recyclerviewdemo.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.recyclerviewdemo.R
import com.example.recyclerviewdemo.databinding.ActivityMainBinding
import com.example.recyclerviewdemo.databinding.FragmentMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)


    }
}