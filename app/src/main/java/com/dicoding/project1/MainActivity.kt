package com.dicoding.project1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuInflater
import android.view.MenuItem
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    private lateinit var rvPokemon: RecyclerView
    private var list: ArrayList<Pokemon> = arrayListOf()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        rvPokemon = findViewById(R.id.rv_pokemon)
        rvPokemon.setHasFixedSize(true)

        list.addAll(PokemonData.listData)
        showRecyclerList()
    }


    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        val menuInflater: MenuInflater = menuInflater
        menuInflater.inflate(R.menu.menu_main, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        val moveAboutActivity = Intent(this, AboutActivity::class.java)
        startActivity(moveAboutActivity)
        return true
    }

    private fun showRecyclerList() {
        rvPokemon.layoutManager = LinearLayoutManager(this)
        val listPokemonAdapter = ListPokemonAdapter(list)
        rvPokemon.adapter = listPokemonAdapter

        listPokemonAdapter.setOnItemClickCallback(object : ListPokemonAdapter.OnItemClickCallback {
            override fun onItemClicked(data: Pokemon) {
                showSelectedPokemon(data)
            }
        })
    }

    private fun showSelectedPokemon(pokemon: Pokemon) {
//        Toast.makeText(this, "Kamu memilih ${pokemon.name}", Toast.LENGTH_SHORT).show()
        val moveDetailPokemon = Intent(this, DetailActivity::class.java)
        moveDetailPokemon.putExtra(DetailActivity.EXTRA_POS, list.indexOf(pokemon))
        startActivity(moveDetailPokemon)
    }


}