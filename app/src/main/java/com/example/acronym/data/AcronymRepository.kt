package com.example.nasaneo.data

import com.example.nasaneo.data.model.AcromineResponse
import javax.inject.Inject

interface IAcronymRepository {
    suspend fun getAcronyms(query: String): List<AcromineResponse>
}

class AcronymRepository @Inject constructor(
    private val arcronymApi: AcronymApi
): IAcronymRepository {
    override suspend fun getAcronyms(query: String) = arcronymApi.getAcronyms(query)
}
