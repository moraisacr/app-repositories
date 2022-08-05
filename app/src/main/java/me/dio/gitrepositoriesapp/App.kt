package me.dio.gitrepositoriesapp

import android.app.Application
import me.dio.gitrepositoriesapp.data.di.DataModule
import me.dio.gitrepositoriesapp.domain.di.DomainModule
import me.dio.gitrepositoriesapp.presentation.di.PresentationModule
import org.koin.android.ext.koin.androidContext
import org.koin.core.context.startKoin

class App : Application() {

    override fun onCreate() {
        super.onCreate()

        startKoin {
            androidContext(this@App)
        }

        DataModule.load()
        DomainModule.load()
        PresentationModule.load()
    }
}