package com.home.androidkotlincoroutinesdemo2.user.data.repository

import com.home.androidkotlincoroutinesdemo2.user.data.api.ZooApi
import kotlinx.coroutines.Dispatchers.IO
import kotlinx.coroutines.async
import kotlinx.coroutines.withContext

class ZooRepository(private val api: ZooApi) : ZooBaseRepository {

    /**
     * 要使用Coroutine 必須要先創建一個對應的CoroutineScope
     * async: 在後台創建一個有返回值的新協程, 返回的是Deferred類型
     */
    override suspend fun getOneHundredAnimalDataAsync() = withContext(IO) {
        async { api.getOneHundredAnimalDataAsync().await() }
    }
}