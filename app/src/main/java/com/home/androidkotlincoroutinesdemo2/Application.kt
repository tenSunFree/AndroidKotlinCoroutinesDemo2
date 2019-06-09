package com.home.androidkotlincoroutinesdemo2

import android.app.Application
import com.facebook.drawee.backends.pipeline.Fresco
import com.home.androidkotlincoroutinesdemo2.user.di.repositoryModule
import com.home.androidkotlincoroutinesdemo2.user.di.usersRemoteModule
import com.home.androidkotlincoroutinesdemo2.user.di.viewModelModule
import org.koin.android.ext.android.startKoin

open class Application : Application() {

    private val appModules by lazy {
        listOf(usersRemoteModule, repositoryModule, viewModelModule)
    }

    override fun onCreate() {
        super.onCreate()
        startKoin(this, appModules)
        Fresco.initialize(this)
    }
}