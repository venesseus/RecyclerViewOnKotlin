package com.example.pengenalanandroid_recyclerview

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
class Hero(
    val name: String,
    val description: String,
    val photo: Int
):Parcelable