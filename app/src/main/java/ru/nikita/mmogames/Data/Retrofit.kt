package ru.nikita.mmogames.Data

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object Retrofit {

    private val retrofit by lazy {
        Retrofit.Builder()
            .baseUrl("https://www.mmobomb.com/api1/")
            .addConverterFactory(GsonConverterFactory.create())
            .build()
    }
    val api: ApiService by lazy {
        retrofit.create(ApiService::class.java)
    }


}
