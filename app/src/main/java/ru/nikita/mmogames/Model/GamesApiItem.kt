package ru.nikita.mmogames.Model

data class GamesApiItem(
    var developer: String,
    var game_url: String,
    var genre: String,
    var id: Int,
    var platform: String,
    var profile_url: String,
    var publisher: String,
    var release_date: String,
    var short_description: String,
    var thumbnail: String,
    var title: String
)
