package com.thethirdeye.esport.thethirdeye.main

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import com.google.android.material.bottomnavigation.BottomNavigationView
import com.thethirdeye.esport.thethirdeye.R
import com.thethirdeye.esport.thethirdeye.match.MatchHistoryActivity
import com.thethirdeye.esport.thethirdeye.profile.EditProfileActivity
import com.thethirdeye.esport.thethirdeye.team.TeamFragment
import com.thethirdeye.esport.thethirdeye.tournament.TournamentFragment

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        loadFragment(TournamentFragment())

        findViewById<BottomNavigationView>(R.id.bottomNav)
            .setOnItemSelectedListener {

                when(it.itemId) {

                    R.id.nav_tournament -> loadFragment(TournamentFragment())

                    R.id.nav_team -> loadFragment(TeamFragment())

                    R.id.nav_match -> {
                        startActivity(Intent(this, MatchHistoryActivity::class.java))
                    }

                    R.id.nav_profile -> {
                        startActivity(Intent(this, EditProfileActivity::class.java))
                    }
                }
                true
            }
    }

    private fun loadFragment(fragment: Fragment) {
        supportFragmentManager.beginTransaction()
            .replace(R.id.fragment_container, fragment)
            .commit()
    }
}
