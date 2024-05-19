package com.baharlou.sampletoolbar

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.baharlou.sampletoolbar.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        setToolbar()
    }

    private fun setToolbar() {
        setSupportActionBar(binding.toolbarMain)
    }
}