package com.home.androidkotlincoroutinesdemo2.user.di

import com.home.androidkotlincoroutinesdemo2.user.data.repository.ZooBaseRepository
import com.home.androidkotlincoroutinesdemo2.user.data.repository.ZooRepository
import org.koin.dsl.module.module

val repositoryModule = module {
    single { ZooRepository(get()) as ZooBaseRepository }
}