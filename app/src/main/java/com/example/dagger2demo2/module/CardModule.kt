package com.example.dagger2demo2.module

import com.example.dagger2demo2.smartfone.Card
import com.example.dagger2demo2.smartfone.SIMcard
import dagger.Module
import dagger.Provides

@Module
class CardModule {
    @Provides
    fun getSimCard(siMcard: SIMcard):Card{
        return siMcard
    }
}