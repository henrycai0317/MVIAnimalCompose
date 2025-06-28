package com.example.mvianimalcompose.api

import com.example.mvianimalcompose.model.Animal
import retrofit2.http.GET

interface AnimalApi {

    @GET("animals.json")
    suspend fun getAnimals(): List<Animal>

}