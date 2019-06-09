package com.home.androidkotlincoroutinesdemo2.user.data.api

import com.home.androidkotlincoroutinesdemo2.user.data.response.OneHundredAnimalDataResponse
import kotlinx.coroutines.Deferred
import retrofit2.http.GET

interface ZooApi {

    @GET("apiAccess?limit=100&rid=a3e2b221-75e0-45c1-8f97-75acbd43d613&scope=resourceAquire")
    fun getOneHundredAnimalDataAsync(): Deferred<OneHundredAnimalDataResponse>
}