package com.home.androidkotlincoroutinesdemo2.user.di

import com.home.androidkotlincoroutinesdemo2.user.viewmodel.ZooViewModel
import org.koin.androidx.viewmodel.ext.koin.viewModel
import org.koin.dsl.module.module

val viewModelModule = module {
    viewModel { ZooViewModel(get()) }
}