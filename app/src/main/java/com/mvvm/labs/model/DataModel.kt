package com.mvvm.labs.model

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class DataItem(
    var id: String,
    var price: Int,
    var title: String
): Parcelable