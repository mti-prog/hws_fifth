package com.geeks.hws_fifth.domain.usecases

import com.geeks.hws_fifth.domain.models.Count
import com.geeks.hws_fifth.domain.repository.CounterRepository

class GetCountUseCase(
    private val repository: CounterRepository,
) {
    fun getCount(): Count{
        return repository.getCount()
    }
}