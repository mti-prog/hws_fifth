package com.geeks.hws_fifth

import android.app.Application
import com.geeks.hws_fifth.di.appCountModule
import com.geeks.hws_fifth.di.cartoonModule
import org.koin.android.ext.koin.androidContext
import org.koin.android.ext.koin.androidLogger
import org.koin.core.context.startKoin
import org.koin.core.logger.Level
import org.koin.dsl.module

class App: Application() {
    override fun onCreate() {
        super.onCreate()
        startKoin {
            androidLogger(level = Level.DEBUG)
            androidContext(this@App)
            modules(appCountModule, cartoonModule)
        }
    }
}