package com.example.task_1_androfund_angelicadeddyardian_a_afternoon

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class User(
    val username:String,
    val password:String
):Parcelable
