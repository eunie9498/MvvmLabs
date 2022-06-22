package com.mvvm.labs.repository

import com.mvvm.labs.network.MainAPI
import javax.inject.Inject

class MainRepository {
    @Inject
    lateinit var api: MainAPI
}