package com.example.nasaneo.data.model

import com.google.gson.annotations.SerializedName
import java.io.Serializable

data class Variation(
    @SerializedName("freq")
    val freq: Int,

    @SerializedName("lf")
    val longform: String,

    @SerializedName("since")
    val since: Int
)
