package com.home.androidkotlincoroutinesdemo2.component

import androidx.lifecycle.ViewModel
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers.Main
import kotlinx.coroutines.Job

open class CoroutineViewModel : ViewModel(), CoroutineScope {

    override val coroutineContext = Main
    protected val jobs = ArrayList<Job>() // 統一管理所有的Job

    /**
     * 將每次新增的Job 都添加至jobs
     */
    infix fun ArrayList<Job>.add(job: Job) {
        this.add(job)
    }

    /**
     * 當前Activity被系統銷毀時, Framework會調用ViewModel的onCleared()方法, 我們可以在onCleared()方法中做一些資源清理操作
     * forEach 這裡的it指代被遍歷的jobs中的值
     */
    override fun onCleared() {
        super.onCleared()
        jobs.forEach { if (!it.isCancelled) it.cancel() } // 取消所有的任務
    }
}