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
import retrofit2.Retrofit

val appCountModule = module {

    single { CountApi() }
    single<CounterRepository> { CounterRepositoryImpl(api = get()) }

    factory { IncreaseUseCase(repository = get()) }
    factory { DecreaseUseCase(repository = get()) }
    factory { ResetUseCase(repository = get()) }
    factory { GetCountUseCase(repository = get()) }

    viewModel { CountViewModel(get(), get(),
        get(), get()) }
}