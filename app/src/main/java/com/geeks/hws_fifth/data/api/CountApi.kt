package com.geeks.hws_fifth.data.api

import com.geeks.hws_fifth.data.models.CountDto

class CountApi {
    private var count: Int = 0

    fun increase(){
        count++
    }

    fun decrease(){
        count--
    }

    fun reset(){
        count = 0
    }

    fun getCount(): CountDto{
        return CountDto(
            count = count,
            typeOfOperation = null,
            createdAt = System.currentTimeMillis()
        )
    }
}