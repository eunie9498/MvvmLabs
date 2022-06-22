package com.mvvm.labs.di

import android.content.Context
import com.mvvm.labs.network.MainAPI
import dagger.Module
import dagger.Provides
import retrofit2.Retrofit
import retrofit2.adapter.rxjava3.RxJava3CallAdapterFactory
import retrofit2.converter.gson.GsonConverterFactory
import javax.inject.Singleton

@Module
class MainModule(val context: Context) {
    @Provides
    fun providecontext() : Context = context

    @Provides
    @Singleton
    fun provideAPI(): MainAPI {
        return Retrofit.Builder().baseUrl("https://62b2c88c20cad3685c93b3f8.mockapi.io/")
            .addCallAdapterFactory(RxJava3CallAdapterFactory.create())
            .addConverterFactory(GsonConverterFactory.create())
            .build()
            .create(MainAPI::class.java)
    }
}