package com.simarro.examen_programacio_multimedia_disposotius_movils_2.utils


import com.simarro.examen_programacio_multimedia_disposotius_movils_2.pojo.retrofit.ImageResponse
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Url

//https://rapidapi.com/SAdrian/api/moviesdatabase/

interface APIService {


    @GET
    suspend fun getMovies(@Url url: String): Response<ImageResponse>

}


