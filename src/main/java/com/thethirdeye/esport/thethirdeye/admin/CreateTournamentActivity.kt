package com.thethirdeye.esport.thethirdeye.admin

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.google.firebase.firestore.FirebaseFirestore
import com.thethirdeye.esport.thethirdeye.databinding.ActivityCreateTournamentBinding

class CreateTournamentActivity : AppCompatActivity() {

    private lateinit var binding: ActivityCreateTournamentBinding
    private val db = FirebaseFirestore.getInstance()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityCreateTournamentBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnCreate.setOnClickListener {
            createTournament()
        }
    }

    private fun createTournament() {
        val title = binding.etTitle.text.toString()
        val game = binding.etGame.text.toString()
        val prize = binding.etPrize.text.toString()
        val entry = binding.etEntry.text.toString()

        if (title.isEmpty() || game.isEmpty()) {
            toast("Fill all fields")
            return
        }

        val map = hashMapOf(
            "title" to title,
            "game" to game,
            "prizePool" to prize,
            "entryFee" to entry,
            "status" to "OPEN"
        )

        db.collection("tournaments")
            .add(map)
            .addOnSuccessListener {
                toast("Tournament Created")
                finish()
            }
            .addOnFailureListener {
                toast(it.message ?: "Error")
            }
    }

    private fun toast(msg: String) {
        Toast.makeText(this, msg, Toast.LENGTH_SHORT).show()
    }
}