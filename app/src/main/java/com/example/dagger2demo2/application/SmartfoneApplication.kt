package com.example.dagger2demo2.application

import android.app.Application
import com.example.dagger2demo2.componenet.DaggerSmartfoneComponent
import com.example.dagger2demo2.componenet.SmartfoneComponent

class SmartfoneApplication:Application() {
    lateinit var smartfoneComponent: SmartfoneComponent
    override fun onCreate() {
        smartfoneComponent = initDagger()
        super.onCreate()
    }

    private fun initDagger():SmartfoneComponent=
        DaggerSmartfoneComponent.create()
}