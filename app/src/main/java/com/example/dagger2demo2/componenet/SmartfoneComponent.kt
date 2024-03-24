package com.example.dagger2demo2.componenet

import com.example.dagger2demo2.MainActivity
import com.example.dagger2demo2.module.CardModule
import com.example.dagger2demo2.smartfone.Smartfone
import dagger.Component
import javax.inject.Singleton

@Singleton
@Component(modules = [CardModule::class])
interface SmartfoneComponent {
//    fun getSmartfone():Smartfone

    fun inject(mainActivity: MainActivity)
}