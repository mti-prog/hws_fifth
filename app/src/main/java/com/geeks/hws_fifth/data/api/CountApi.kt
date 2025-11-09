package com.geeks.hws_fifth.data.api

import com.geeks.hws_fifth.data.models.CountDto

class CountApi {
    private var count: Int = 0
    private var typeOfOperation = "nothing"

    fun increase(){
        count++
        typeOfOperation = "increase"
    }

    fun decrease(){
        count--
        typeOfOperation = "decrease"
    }

    fun reset(){
        count = 0
        typeOfOperation = "reset"
    }

    fun getCount(): CountDto{
        return CountDto(
            count = count,
            typeOfOperation = typeOfOperation,
            createdAt = System.currentTimeMillis()
        )
    }
}