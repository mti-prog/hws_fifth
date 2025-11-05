package com.geeks.hws_fifth.domain.repository

import com.geeks.hws_fifth.domain.models.Count

interface CounterRepository {
    fun increase()
    fun decrease()
    fun getCount(): Count
    fun reset()
}