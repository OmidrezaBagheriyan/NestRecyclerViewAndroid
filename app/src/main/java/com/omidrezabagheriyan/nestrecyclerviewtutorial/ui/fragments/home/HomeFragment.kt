package com.omidrezabagheriyan.nestrecyclerviewtutorial.ui.fragments.home

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import com.omidrezabagheriyan.nestrecyclerviewtutorial.R
import com.omidrezabagheriyan.nestrecyclerviewtutorial.databinding.FragmentHomeBinding
import com.omidrezabagheriyan.nestrecyclerviewtutorial.ui.utils.viewBinding
import com.omidrezabagheriyan.nestrecyclerviewtutorial.utils.FakeData
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class HomeFragment : Fragment(R.layout.fragment_home) {

    private val binding by viewBinding<FragmentHomeBinding>()
    private lateinit var adapter: FieldsOfProgrammingAdapter

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        adapter = FieldsOfProgrammingAdapter()
        adapter.submitList(FakeData.fieldsOfProgramming)
        binding.rvFieldsOfProgramming.setHasFixedSize(true)
        binding.rvFieldsOfProgramming.adapter = adapter
    }
}