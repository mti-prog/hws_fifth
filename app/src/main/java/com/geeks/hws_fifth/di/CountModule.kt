package com.geeks.hws_fifth.di

import com.geeks.hws_fifth.data.api.CountApi
import com.geeks.hws_fifth.data.repository.CounterRepositoryImpl
import com.geeks.hws_fifth.domain.repository.CounterRepository
import com.geeks.hws_fifth.domain.usecases.DecreaseUseCase
import com.geeks.hws_fifth.domain.usecases.GetCountUseCase
import com.geeks.hws_fifth.domain.usecases.IncreaseUseCase
import com.geeks.hws_fifth.domain.usecases.ResetUseCase
import com.geeks.hws_fifth.presentation.CountViewModel
import org.koin.core.module.dsl.viewModel
import org.koin.dsl.module

val appCountModule = module {

    //data
    single { CountApi() }
    single<CounterRepository> { CounterRepositoryImpl(api = get()) }

    //domain
    single { IncreaseUseCase(repository = get()) }
    single { DecreaseUseCase(repository = get()) }
    single { ResetUseCase(repository = get()) }
    single { GetCountUseCase(repository = get()) }

    //presentation
    viewModel { CountViewModel(get(), get(),
        get(), get()) }
}