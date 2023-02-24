package com.example.benchmarkexample

import android.app.Application
import android.util.Log

class MyApp: Application() {
    override fun onCreate() {
        super.onCreate()
        Log.d("SMG","App on create")
    }
}
