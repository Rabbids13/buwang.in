package com.example.buangin_v1.data

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class Artikel(
    val judul: String,
    val sub_judul: String,
    val photo: Int
) : Parcelable
