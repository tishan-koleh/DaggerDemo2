package com.example.dagger2demo2.smartfone

import android.util.Log
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class Smartfone @Inject constructor(val battery: Battery,val memory: Memory,val card: Card) {
//    init {
//        Log.i("MYTAG","Smartfone constructed")
//
//    }

    fun getSmartfone(){
        Log.i("MYTAG","Smartfone Available")
        battery.getPower()
        memory.getMemory()
        card.getSimCard()
    }
}