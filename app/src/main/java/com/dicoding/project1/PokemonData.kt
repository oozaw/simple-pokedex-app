package com.dicoding.project1

object PokemonData {
    private val pokeName = arrayOf(
        "Charmander",
        "Pidgey",
        "Pikachu",
        "Gyarados",
        "Squirtle",
        "Lapras",
        "Seviper",
        "Turtwig",
        "Abra",
        "Jigglypuff",
        "Onix"
    )

    private val pokeType = intArrayOf(
        R.drawable.api,
        R.drawable.pidgey_type,
        R.drawable.listrik,
        R.drawable.gyarados_type,
        R.drawable.air,
        R.drawable.lapras_type,
        R.drawable.racun,
        R.drawable.daun,
        R.drawable.telepati,
        R.drawable.jigglypuff_type,
        R.drawable.onix_type
    )

    private val pokeWeak = arrayOf(
        "Air, Tanah, Karang",
        "Listrik, Es, Karang",
        "Tanah",
        "Listrik, Karang",
        "Listrik, Daun",
        "Listrik, Daun, Petarung, Karang",
        "Tanah, Telepati",
        "Es, Racun, Api, Terbang, Serangga",
        "Es, Hantu, Kegelapan, Serangga",
        "Es, Racun, Logam",
        "Es, Petarung, Logam, Daun, Air, Tanah"
    )

    private val pokeHeight = arrayOf(
        "0.6 m",
        "0.3 m",
        "0.4 m",
        "6.5 m",
        "0.5 m",
        "2.5 m",
        "2.7 m",
        "0.4 m",
        "0.9 m",
        "0.5 m",
        "8.8 m"
    )

    private val pokeCategory = arrayOf(
        "Pokemon Kadal",
        "Pokemon Burung Kecil",
        "Pokemon Tikus",
        "Pokemon Mengerikan",
        "Pokemon Anak Kura-kura",
        "Pokemon Transportasi",
        "Pokemon Ular Bertaring",
        "Pokemon Daun Muda",
        "Pokemon Supernatural",
        "Pokemon Balon",
        "Pokemon Ular Batu"
    )

    private val pokeWeight = arrayOf(
        "8.5 kg",
        "1.8 kg",
        "6.0 kg",
        "235.0 kg",
        "9.0 kg",
        "220.0 kg",
        "52.5 kg",
        "10.2 kg",
        "19.5 kg",
        "5.5 kg",
        "210.0 kg"
    )

    private val pokeEvolution = intArrayOf(
        R.mipmap.charmander_evo,
        R.mipmap.pidgey_evo,
        R.mipmap.pikachu_evo,
        R.mipmap.gyarados_evo,
        R.mipmap.squirtle_evo,
        R.mipmap.img_transparent,
        R.mipmap.img_transparent,
        R.mipmap.turtwig_evo,
        R.mipmap.abra_evo,
        R.mipmap.jigglypuff_evo,
        R.mipmap.onix_evo
    )

    private val pokeImage = intArrayOf(
        R.drawable.charmander,
        R.drawable.pidgey,
        R.drawable.pikachu,
        R.drawable.gyarados,
        R.drawable.squirtle,
        R.drawable.lapras,
        R.drawable.seviper,
        R.drawable.turtwig,
        R.drawable.abra,
        R.drawable.jigglypuff,
        R.drawable.onix
    )

    private const val pokeGender = R.drawable.gender

    val listData: ArrayList<Pokemon>
        get() {
            val list = arrayListOf<Pokemon>()
            for (position in pokeName.indices) {
                val pokemon = Pokemon()
                pokemon.name = pokeName[position]
                pokemon.photo = pokeImage[position]
                pokemon.type = pokeType[position]
                pokemon.weak = pokeWeak[position]
                pokemon.height = pokeHeight[position]
                pokemon.category = pokeCategory[position]
                pokemon.weight = pokeWeight[position]
                pokemon.gender = pokeGender
                pokemon.evolutionPhoto = pokeEvolution[position]
                list.add(pokemon)
            }
            return list
        }
}