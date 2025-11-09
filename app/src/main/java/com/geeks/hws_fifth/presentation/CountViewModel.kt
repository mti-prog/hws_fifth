package com.geeks.hws_fifth.presentation

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.geeks.hws_fifth.domain.models.Count
import com.geeks.hws_fifth.domain.usecases.DecreaseUseCase
import com.geeks.hws_fifth.domain.usecases.GetCountUseCase
import com.geeks.hws_fifth.domain.usecases.IncreaseUseCase
import com.geeks.hws_fifth.domain.usecases.ResetUseCase

class CountViewModel(
    private val increaseUseCase: IncreaseUseCase,
    private val decreaseUseCase: DecreaseUseCase,
    private val getCountUseCase: GetCountUseCase,
    private val resetUseCase: ResetUseCase
) : ViewModel(){

    private val _countData = MutableLiveData<Count>()
    val countData: LiveData<Count> = _countData

    fun increase(){
        increaseUseCase.increase()
        getCount()
    }

    fun decrease(){
        decreaseUseCase.decrease()
        getCount()
    }

    fun reset(){
        resetUseCase.reset()
        getCount()
    }

    private fun getCount(){
        val response = getCountUseCase.getCount()
        _countData.value = response
    }

}