package com.baharlou.sampletoolbar

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import androidx.core.content.ContextCompat
import com.baharlou.sampletoolbar.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        setToolbar()
        setCollapsing()
        setFab()
    }

    private fun setFab() {
        binding.fabOpenSite.setOnClickListener {

        }
    }

    private fun setCollapsing() {
        binding.collapsingMain.setExpandedTitleColor(
            ContextCompat.getColor(this, android.R.color.transparent)
        )

        //binding.collapsingMain.title = "my title"
    }

    private fun setToolbar() {
        setSupportActionBar(binding.toolbarMain)

        supportActionBar!!.setHomeButtonEnabled(true)
        supportActionBar!!.setDisplayHomeAsUpEnabled(true)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {

        if (item.itemId == android.R.id.home) {
            onBackPressed()
        }

        return true
    }
}