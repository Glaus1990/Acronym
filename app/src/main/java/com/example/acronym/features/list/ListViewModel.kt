package com.example.acronym.features.list

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.nasaneo.data.AcronymRepository
import com.example.nasaneo.data.IAcronymRepository
import com.example.nasaneo.data.model.LongForm
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class ListViewModel @Inject constructor(
    val repository: IAcronymRepository
) : ViewModel() {
    private val _acronyms = MutableLiveData<List<LongForm>>()
    val acronyms: LiveData<List<LongForm>> = _acronyms

    private val _loading = MutableLiveData<Boolean>()
    val loading: LiveData<Boolean> = _loading

    fun searchClicked(query: String) = viewModelScope.launch {
        Log.e("TAG", "Search Clicked $query")
        _loading.postValue(true)
        val acronyms = repository.getAcronyms(query)
        val lfs = if (acronyms.isEmpty()) listOf() else acronyms[0].lfs
        _acronyms.postValue(lfs)
        _loading.postValue(false)
    }
}
