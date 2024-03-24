package com.example.dagger2demo2

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.dagger2demo2.application.SmartfoneApplication
import com.example.dagger2demo2.componenet.DaggerSmartfoneComponent
import com.example.dagger2demo2.componenet.SmartfoneComponent
import com.example.dagger2demo2.smartfone.Battery
import com.example.dagger2demo2.smartfone.Memory
import com.example.dagger2demo2.smartfone.SIMcard
import com.example.dagger2demo2.smartfone.ServiceProvider
import com.example.dagger2demo2.smartfone.Smartfone
import javax.inject.Inject

class MainActivity : AppCompatActivity() {
    @Inject
    lateinit var smartfone: Smartfone
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

//        val smartfoneComponent = DaggerSmartfoneComponent.builder().build()
//        smartfoneComponent.inject(this)

        (application as SmartfoneApplication).smartfoneComponent.inject(this)
        smartfone.getSmartfone()
    }
}