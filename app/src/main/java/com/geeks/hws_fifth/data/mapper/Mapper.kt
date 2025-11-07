package com.geeks.hws_fifth.data.mapper

import com.geeks.hws_fifth.data.models.CountDto
import com.geeks.hws_fifth.domain.models.Count
import com.geeks.hws_fifth.domain.models.TypeOfOperation

fun CountDto.fromDto(): Count{
    return Count(
        count = this.count ?: 0,
        typeOfOperation = when(this.typeOfOperation){
            "INCREASE" -> TypeOfOperation.INCREASE
            "DECREASE" -> TypeOfOperation.DECREASE
            "RESET" -> TypeOfOperation.RESET
            else -> TypeOfOperation.RESET
        },
        createdAt = this.createdAt ?: System.currentTimeMillis()
    )
}