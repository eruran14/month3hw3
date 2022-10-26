package com.eru.month3hw3.pager

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class FragmentViewModel: ViewModel() {

    private var mCounter = 0
    private var mOperations = arrayListOf<String>()

    val counter = MutableLiveData<Int>()
    val operations = MutableLiveData<ArrayList<String>>()

    fun onIncrementClick(){
        mCounter++
        counter.value = mCounter
        mOperations.add("+")
        operations.value = mOperations
    }

    fun onDecrementClick(){
        mCounter--
        counter.value = mCounter
        mOperations.add("-")
        operations.value = mOperations
    }

}