package com.thethirdeye.esport.thethirdeye.tournament

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.thethirdeye.esport.thethirdeye.databinding.ItemTournamentBinding
import com.thethirdeye.esport.thethirdeye.model.Tournament

class TournamentAdapter(
    private val list: List<Tournament>
) : RecyclerView.Adapter<TournamentAdapter.TournamentViewHolder>() {

    inner class TournamentViewHolder(val binding: ItemTournamentBinding) :
        RecyclerView.ViewHolder(binding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TournamentViewHolder {
        val binding = ItemTournamentBinding.inflate(
            LayoutInflater.from(parent.context),
            parent,
            false
        )
        return TournamentViewHolder(binding)
    }

    override fun onBindViewHolder(holder: TournamentViewHolder, position: Int) {
        val tournament = list[position]

        holder.binding.apply {
            tvTournamentName.text = tournament.title
            tvTournamentType.text = tournament.game
            tvTournamentPrize.text = "₹ ${tournament.prizePool}"
        }
    }

    override fun getItemCount(): Int = list.size
}
