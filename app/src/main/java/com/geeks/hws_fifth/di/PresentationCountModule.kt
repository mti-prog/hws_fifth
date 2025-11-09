package com.geeks.hws_fifth.di

import com.geeks.hws_fifth.presentation.CountViewModel
import org.koin.core.module.dsl.viewModel
import org.koin.dsl.module

val PresentationCountModule = module{
    viewModel { CountViewModel(get(), get(),
        get(), get()) }
}