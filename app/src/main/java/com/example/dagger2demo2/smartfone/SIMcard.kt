package com.example.dagger2demo2.smartfone

import android.util.Log
import javax.inject.Inject
interface Card{
    fun getSimCard()
}
class SIMcard @Inject constructor(val serviceProvider: ServiceProvider):Card {
//    init {
//        Log.i("MYTAG","Sim card Constructed")
//    }

    override fun getSimCard(){
        serviceProvider.getServiceProvider()
        Log.i("MYTAG","SimCArd provied")
    }
}