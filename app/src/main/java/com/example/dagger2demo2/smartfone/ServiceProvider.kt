package com.example.dagger2demo2.smartfone

import android.util.Log
import javax.inject.Inject

class ServiceProvider @Inject constructor() {
//    init {
//        Log.i("MYTAG","Service Provider Constructed")
//    }

    fun getServiceProvider(){
        Log.i("MYTAG","Service Provider Available")
    }
}