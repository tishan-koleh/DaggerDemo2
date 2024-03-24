package com.example.dagger2demo2.smartfone

import android.util.Log
import javax.inject.Inject

class Memory @Inject constructor() {
//    init {
//        Log.i("MYTAG","Memory Constructd")
//    }

    fun getMemory(){
        Log.i("MYTAG","Memory Provided")
    }

}
