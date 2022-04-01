package com.example.nasaneo.data

import androidx.lifecycle.LiveData
import io.reactivex.Single
import com.example.nasaneo.data.model.AcromineResponse
import retrofit2.http.GET
import retrofit2.http.Query

interface AcronymApi {
    @GET("/software/acromine/dictionary.py")
    suspend fun getAcronyms(@Query("sf") query: String): List<AcromineResponse>
}
