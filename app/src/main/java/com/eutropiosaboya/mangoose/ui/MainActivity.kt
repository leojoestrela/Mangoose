package com.eutropiosaboya.mangoose.ui

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.eutropiosaboya.mangoose.R
import com.eutropiosaboya.mangoose.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.bottomNavigation.setOnItemSelectedListener { item ->
            when (item.itemId) {
                R.id.item_feed -> {
                    true
                }

                R.id.item_ajuste -> {
                    true
                }

                R.id.item_favoritos -> {
                    true
                }

                else -> false
            }
        }
    }
}