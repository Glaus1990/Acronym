package com.example.nasaneo.data.model

import com.google.gson.annotations.SerializedName

data class AcromineResponse(
    @SerializedName("sf")
    val sf: String,

    @SerializedName("lfs")
    val lfs: List<LongForm>
)
