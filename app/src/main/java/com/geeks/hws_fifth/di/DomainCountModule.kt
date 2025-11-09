package com.geeks.hws_fifth.di

import com.geeks.hws_fifth.domain.usecases.DecreaseUseCase
import com.geeks.hws_fifth.domain.usecases.GetCountUseCase
import com.geeks.hws_fifth.domain.usecases.IncreaseUseCase
import com.geeks.hws_fifth.domain.usecases.ResetUseCase
import org.koin.dsl.module

val domainCountModule = module {
    factory { IncreaseUseCase(repository = get()) }
    factory { DecreaseUseCase(repository = get()) }
    factory { ResetUseCase(repository = get()) }
    factory { GetCountUseCase(repository = get()) }
}