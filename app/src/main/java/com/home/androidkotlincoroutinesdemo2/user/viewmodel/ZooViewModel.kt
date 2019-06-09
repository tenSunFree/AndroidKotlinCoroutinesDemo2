package com.home.androidkotlincoroutinesdemo2.user.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.home.androidkotlincoroutinesdemo2.component.CoroutineViewModel
import com.home.androidkotlincoroutinesdemo2.user.data.repository.ZooBaseRepository
import com.home.androidkotlincoroutinesdemo2.user.data.response.OneHundredAnimalDataResponse
import kotlinx.coroutines.launch

class ZooViewModel(private val repository: ZooBaseRepository) : CoroutineViewModel() {

    private val oneHundredAnimal: MutableLiveData<OneHundredAnimalDataResponse> = MutableLiveData()
    private val loading: MutableLiveData<Boolean> = MutableLiveData()
    private val error: MutableLiveData<Throwable> = MutableLiveData()

    fun oneHundredAnimal() = oneHundredAnimal as LiveData<OneHundredAnimalDataResponse>
    fun loading() = loading as LiveData<Boolean>
    fun error() = error as LiveData<Throwable>

    fun getOneHundredAnimal() {
        jobs add launch {
            loading.value = true
            try {
                oneHundredAnimal.value =
                    repository.getOneHundredAnimalDataAsync().await() // deferred.await() 可等待非同步操作處理完成
            } catch (t: Throwable) {
                oneHundredAnimal.value = null // emptyList() 返回一個只讀的空集合且實現了序列化
                error.value = t
            } finally { // 完成所有try catch後要執行的內容
                loading.value = false
            }
        }
    }
}