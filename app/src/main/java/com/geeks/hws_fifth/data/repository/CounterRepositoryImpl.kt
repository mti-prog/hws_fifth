package com.geeks.hws_fifth.data.repository

import com.geeks.hws_fifth.data.api.CountApi
import com.geeks.hws_fifth.domain.models.Count
import com.geeks.hws_fifth.domain.repository.CounterRepository

class CounterRepositoryImpl(
    private val api: CountApi,
): CounterRepository {

    override fun increase() {
        api.increase()
    }

    override fun decrease() {
        api.decrease()
    }

    override fun getCount(): Count {
        val dto = api.getCount()
        return CountMapper.fromDto(dto)
    }

    override fun reset() {
        api.reset()
    }
}