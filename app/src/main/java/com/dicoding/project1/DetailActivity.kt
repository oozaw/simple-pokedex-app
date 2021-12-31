package com.dicoding.project1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import java.util.ArrayList

class DetailActivity : AppCompatActivity() {
    private val listPokemon: ArrayList<Pokemon> = arrayListOf()

    companion object {
        const val EXTRA_POS = "extra_pos"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)

        listPokemon.addAll(PokemonData.listData)

        val tvPokeName: TextView = findViewById(R.id.tv_pokemon_name_detail)
        val imgPokePhoto: ImageView = findViewById(R.id.img_pokemon_photo_detail)
        val imgPokeType: ImageView = findViewById(R.id.img_pokemon_type_detail)
        val tvPokeWeakness: TextView = findViewById(R.id.tv_pokemon_weakness)
        val tvPokeHeight: TextView = findViewById(R.id.tv_pokemon_height)
        val tvPokeCategory: TextView = findViewById(R.id.tv_pokemon_category)
        val tvPokeWeight: TextView = findViewById(R.id.tv_pokemon_weight)
        val imgPokeGender: ImageView = findViewById(R.id.img_pokemon_gender)
        val imgPokeEvo: ImageView = findViewById(R.id.img_poke_evo)

        val pos = intent.getIntExtra(EXTRA_POS, 0)
        val pokemon = listPokemon[pos]

        val img = pokemon.photo
        val name = pokemon.name
        val type = pokemon.type
        val weak = pokemon.weak
        val height = pokemon.height
        val category = pokemon.category
        val weight = pokemon.weight
        val gender = pokemon.gender
        val evoPhoto = pokemon.evolutionPhoto
        val text = ""

        tvPokeName.text = name
        imgPokePhoto.setImageResource(img)
        imgPokeType.setImageResource(type)
        tvPokeWeakness.text = weak
        tvPokeHeight.text = height
        tvPokeCategory.text = category
        tvPokeWeight.text = weight
        imgPokeGender.setImageResource(gender)
        imgPokeEvo.setImageResource(evoPhoto)

        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        supportActionBar?.title = "Pokemon Details"
    }

    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return true
    }

}