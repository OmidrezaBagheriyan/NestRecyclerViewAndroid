package com.omidrezabagheriyan.nestrecyclerviewtutorial.data

import com.omidrezabagheriyan.nestrecyclerviewtutorial.models.dto.GameOfThronesDto
import retrofit2.Response
import retrofit2.http.GET

interface ApiService {
    @GET("https://game-of-thrones-quotes.herokuapp.com/v1/houses")
    suspend fun getGameOfThrones(): Response<List<GameOfThronesDto>>
}