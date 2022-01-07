package ru.nikita.mmogames.Data

import retrofit2.Response
import retrofit2.http.GET
import ru.nikita.mmogames.Model.GamesApi

interface ApiService {
    @GET("games")
    suspend fun getGames(): Response<GamesApi>
}
