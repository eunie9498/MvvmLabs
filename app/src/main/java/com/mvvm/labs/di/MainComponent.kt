package com.mvvm.labs.di

import com.mvvm.labs.repository.MainRepository
import com.mvvm.labs.view.MainActivity
import dagger.Component
import javax.inject.Singleton

@Component(modules = [MainModule::class])
@Singleton
interface MainComponent {
    fun inject(activity: MainActivity)
    fun inject(repository: MainRepository)

    @Component.Builder
    interface Builder {
        fun networkModule(module: MainModule) : Builder
        fun build() : MainComponent
    }
}