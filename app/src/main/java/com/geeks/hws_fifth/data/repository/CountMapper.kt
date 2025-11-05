package com.geeks.hws_fifth.data.repository

import com.geeks.hws_fifth.data.models.CountDto
import com.geeks.hws_fifth.domain.models.Count
import com.geeks.hws_fifth.domain.models.TypeOfOperation

object CountMapper {
    fun toDto(count: Count): CountDto{
        return CountDto(
            count = count.count,
            typeOfOperation = count.typeOfOperation.name,
            createdAt = count.createdAt
        )
    }

    fun fromDto(dto: CountDto): Count{
        return Count(
            count = dto.count ?: 0,
            typeOfOperation = when(dto.typeOfOperation){
                "INCREASE" -> TypeOfOperation.INCREASE
                "DECREASE" -> TypeOfOperation.DECREASE
                "RESET" -> TypeOfOperation.RESET
                else -> TypeOfOperation.RESET
            },
            createdAt = dto.createdAt ?: System.currentTimeMillis()
        )
    }
}