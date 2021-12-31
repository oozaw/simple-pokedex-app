package com.dicoding.project1

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions

class ListPokemonAdapter(private val listPokemon: ArrayList<Pokemon>) : RecyclerView.Adapter<ListPokemonAdapter.ListViewHolder>() {
    private lateinit var onItemClickCallback: OnItemClickCallback

    fun setOnItemClickCallback(onItemClickCallback: OnItemClickCallback) {
        this.onItemClickCallback = onItemClickCallback
    }

    inner class ListViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var tvName: TextView = itemView.findViewById(R.id.tv_pokemon_name)
        var imgType: ImageView = itemView.findViewById(R.id.img_pokemon_type)
        var imgPhoto: ImageView = itemView.findViewById(R.id.img_pokemon_photo)
    }

    override fun onCreateViewHolder(viewGroup: ViewGroup, i: Int): ListViewHolder {
        val view: View = LayoutInflater.from(viewGroup.context).inflate(R.layout.item_list_pokemon, viewGroup, false)
        return ListViewHolder(view)
    }

    override fun onBindViewHolder(holder: ListViewHolder, position: Int) {
        val pokemon = listPokemon[position]

        holder.imgPhoto.setImageResource(pokemon.photo)
        holder.tvName.text = pokemon.name
        holder.imgType.setImageResource(pokemon.type)

        holder.itemView.setOnClickListener {
            onItemClickCallback.onItemClicked(listPokemon[holder.adapterPosition])
        }
    }

    override fun getItemCount(): Int {
        return listPokemon.size
    }

    interface OnItemClickCallback {
        fun onItemClicked(data: Pokemon)
    }
}