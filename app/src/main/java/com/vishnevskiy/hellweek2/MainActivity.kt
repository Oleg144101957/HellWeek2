package com.vishnevskiy.hellweek2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.vishnevskiy.hellweek2.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnGetData.setOnClickListener {

        }

        binding.btnSaveData.setOnClickListener {

        }

    }
}