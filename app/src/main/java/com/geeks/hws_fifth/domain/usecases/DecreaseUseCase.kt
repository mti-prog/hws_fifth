package com.geeks.hws_fifth.domain.usecases

import com.geeks.hws_fifth.domain.repository.CounterRepository

class DecreaseUseCase(
    private val repository: CounterRepository,
) {
    fun decrease() { repository.decrease() }
}