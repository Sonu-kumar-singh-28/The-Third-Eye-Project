package com.thethirdeye.esport.thethirdeye.admin

import android.os.Bundle
import android.util.Log
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import com.google.firebase.firestore.FirebaseFirestore
import com.thethirdeye.esport.thethirdeye.Adaptor.TournamentAdapter
import com.thethirdeye.esport.thethirdeye.databinding.ActivityAllTournamentBinding
import com.thethirdeye.esport.thethirdeye.model.TournamentModel

class AllTournamentActivity : AppCompatActivity() {

    private val binding: ActivityAllTournamentBinding by lazy {
        ActivityAllTournamentBinding.inflate(layoutInflater)
    }

    private val db = FirebaseFirestore.getInstance()

    private val tournamentList = ArrayList<TournamentModel>()

    private lateinit var adapter: TournamentAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(binding.root)

        adapter = TournamentAdapter(tournamentList)

        binding.tournamentRecycler.layoutManager = LinearLayoutManager(this)
        binding.tournamentRecycler.adapter = adapter

        loadTournaments()
    }

    private fun loadTournaments() {

        db.collection("tournaments")
            .get()
            .addOnSuccessListener { result ->

                tournamentList.clear()

                for (doc in result.documents) {

                    Log.d("FIREBASE_DATA", doc.data.toString())

                    val model = TournamentModel(
                        doc.getString("title") ?: "",
                        doc.getString("game") ?: "",
                        doc.getString("prize") ?: "",
                        doc.getString("entry") ?: "",
                        doc.getString("description") ?: "",
                        doc.getString("image") ?: ""
                    )

                    tournamentList.add(model)
                }

                adapter.notifyDataSetChanged()

                Log.d("FIREBASE_SIZE", tournamentList.size.toString())
            }

            .addOnFailureListener {
                Log.e("FIREBASE_ERROR", it.message.toString())
            }
    }
}