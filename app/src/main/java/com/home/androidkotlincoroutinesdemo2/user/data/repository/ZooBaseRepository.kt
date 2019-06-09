package com.home.androidkotlincoroutinesdemo2.user.data.repository

import com.home.androidkotlincoroutinesdemo2.user.data.response.OneHundredAnimalDataResponse
import kotlinx.coroutines.Deferred

interface ZooBaseRepository {

    suspend fun getOneHundredAnimalDataAsync(): Deferred<OneHundredAnimalDataResponse>
}