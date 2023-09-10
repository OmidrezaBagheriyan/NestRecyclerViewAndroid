package com.omidrezabagheriyan.nestrecyclerviewtutorial.ui.fragments.home

import androidx.lifecycle.ViewModel
import com.omidrezabagheriyan.nestrecyclerviewtutorial.data.NestRVRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class HomeViewModel @Inject constructor(private val repository: NestRVRepository) : ViewModel() {

}