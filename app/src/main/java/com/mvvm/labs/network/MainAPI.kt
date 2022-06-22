package com.mvvm.labs.network

import com.mvvm.labs.model.DataItem
import io.reactivex.rxjava3.core.Observable
import retrofit2.http.*

interface MainAPI {
    @GET("kongapi/list")
    fun getList(): Observable<List<DataItem>>
}