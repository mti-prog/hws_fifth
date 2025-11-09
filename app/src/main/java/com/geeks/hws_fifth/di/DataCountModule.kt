package com.geeks.hws_fifth.di

import com.geeks.hws_fifth.data.api.CountApi
import com.geeks.hws_fifth.data.repository.CounterRepositoryImpl
import com.geeks.hws_fifth.domain.repository.CounterRepository
import com.geeks.hws_fifth.presentation.CountViewModel
import org.koin.core.module.dsl.viewModel
import org.koin.dsl.module

val dataCountModule = module {
    single { CountApi() }
    single<CounterRepository> { CounterRepositoryImpl(api = get()) }
}