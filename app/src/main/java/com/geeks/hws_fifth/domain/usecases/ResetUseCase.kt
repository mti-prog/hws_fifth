package com.geeks.hws_fifth.domain.usecases

import com.geeks.hws_fifth.domain.repository.CounterRepository

class ResetUseCase(
    private val repository: CounterRepository,
) {
    fun reset() { repository.reset() }
}