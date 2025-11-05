package com.geeks.hws_fifth.data.models

import com.geeks.hws_fifth.domain.models.TypeOfOperation

data class CountDto(
    val count: Int? =  null,
    val typeOfOperation: String? = null,
    val createdAt: Long? = null
)
