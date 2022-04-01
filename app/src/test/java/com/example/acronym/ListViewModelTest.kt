package com.example.acronym

import com.example.acronym.features.list.ListViewModel
import com.example.nasaneo.data.IAcronymRepository
import io.mockk.MockKAnnotations
import io.mockk.junit5.MockKExtension
import io.mockk.mockk
import io.mockk.unmockkAll
import org.junit.jupiter.api.AfterEach
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.TestInstance
import org.junit.jupiter.api.extension.ExtendWith

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
@ExtendWith(MockKExtension::class)
class ListViewModelTest {

    private var listViewModel: ListViewModel? = null
    private val repository = mockk<IAcronymRepository>(relaxed = true)
    @BeforeEach
    fun setup() {
        MockKAnnotations.init(this)
        listViewModel = ListViewModel(repository)
    }


    @Test
    fun shouldGetList(){

    }

    @AfterEach
    fun tearDown() {
        unmockkAll()
    }
}