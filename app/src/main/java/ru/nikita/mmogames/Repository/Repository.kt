package ru.nikita.mmogames.Repository

import retrofit2.Response
import ru.nikita.mmogames.Data.Retrofit
import ru.nikita.mmogames.Model.GamesApi

class Repository {

    suspend fun getGame(): Response<GamesApi> {
        return Retrofit.api.getGames()
    }
}
