package com.thethirdeye.esport.thethirdeye.match

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.thethirdeye.esport.thethirdeye.R
import com.thethirdeye.esport.thethirdeye.databinding.ActivityMatchHistoryBinding

class MatchHistoryActivity : AppCompatActivity() {

    private val binding: ActivityMatchHistoryBinding by lazy {
        ActivityMatchHistoryBinding.inflate(layoutInflater)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(binding.root)
    }


}