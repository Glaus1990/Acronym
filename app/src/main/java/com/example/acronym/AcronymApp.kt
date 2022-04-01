package com.example.acronym

import android.app.Application
import dagger.hilt.android.HiltAndroidApp

@HiltAndroidApp
class AcronymApp : Application() {

    override fun onCreate() {
        super.onCreate()
    }

}