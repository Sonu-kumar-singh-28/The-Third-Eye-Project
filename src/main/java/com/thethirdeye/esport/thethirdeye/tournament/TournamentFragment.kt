package com.thethirdeye.esport.thethirdeye.tournament

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import com.google.firebase.firestore.FirebaseFirestore
import com.thethirdeye.esport.thethirdeye.databinding.FragmentTournamentBinding
import com.thethirdeye.esport.thethirdeye.model.Tournament

class TournamentFragment : Fragment() {

    private lateinit var binding: FragmentTournamentBinding
    private lateinit var adapter: TournamentAdapter
    private val tournamentList = mutableListOf<Tournament>()
    private val db = FirebaseFirestore.getInstance()

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {

        binding = FragmentTournamentBinding.inflate(inflater, container, false)

        adapter = TournamentAdapter(tournamentList)
        binding.rvTournaments.layoutManager = LinearLayoutManager(requireContext())
        binding.rvTournaments.adapter = adapter

        loadTournaments()

        return binding.root
    }

    private fun loadTournaments() {
        db.collection("tournaments")
            .get()
            .addOnSuccessListener { snapshot ->
                tournamentList.clear()

                snapshot.documents.forEach { doc ->
                    try {
                        val tournament = doc.toObject(Tournament::class.java)
                        tournament?.let { tournamentList.add(it) }
                    } catch (e: Exception) {
                        e.printStackTrace()
                    }
                }

                adapter.notifyDataSetChanged()
            }
            .addOnFailureListener {
                it.printStackTrace()
            }
    }
}
