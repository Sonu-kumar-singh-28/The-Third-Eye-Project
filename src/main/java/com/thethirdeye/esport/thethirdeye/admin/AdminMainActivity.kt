package com.thethirdeye.esport.thethirdeye.admin

import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import com.thethirdeye.esport.thethirdeye.databinding.ActivityAdminMainBinding

class AdminMainActivity : AppCompatActivity() {

    private val binding: ActivityAdminMainBinding by lazy {
        ActivityAdminMainBinding.inflate(layoutInflater)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(binding.root)

        // Create Tournament
        binding.cardCreateTournament.setOnClickListener {
            startActivity(
                Intent(this, CreateTournamentActivity::class.java)
            )
        }

        //  All Tournaments
        binding.cardAllTournaments.setOnClickListener {
            startActivity(
                Intent(this, AllTournamentActivity::class.java)
            )
        }
    }
}