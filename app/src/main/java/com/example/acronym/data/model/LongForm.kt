package com.example.nasaneo.data.model

import com.google.gson.annotations.SerializedName
import java.io.Serializable

data class LongForm(
    @SerializedName("freq")
    val freq: Int,

    @SerializedName("lf")
    val longform: String,

    @SerializedName("vars")
    val variations: List<Variation>,

    @SerializedName("since")
    val since: Int
)
