package com.example.mvianimalcompose.api

class AnimalRepo(private val api: AnimalApi) {

    suspend fun getAnimals() = api.getAnimals()

}