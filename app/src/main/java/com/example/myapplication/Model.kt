package com.example.myapplication

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
class Model (
    public val id: Int,
    public var name: String
    ): Parcelable