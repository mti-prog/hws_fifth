package com.geeks.hws_fifth.domain.usecases

import com.geeks.hws_fifth.domain.repository.CounterRepository

class IncreaseUseCase(
    private val repository: CounterRepository,
) {
    fun increase() { repository.increase() }
}