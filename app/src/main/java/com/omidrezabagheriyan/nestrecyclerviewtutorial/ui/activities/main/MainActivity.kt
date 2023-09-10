package com.omidrezabagheriyan.nestrecyclerviewtutorial.ui.activities.main

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.omidrezabagheriyan.nestrecyclerviewtutorial.databinding.ActivityMainBinding
import com.omidrezabagheriyan.nestrecyclerviewtutorial.ui.utils.viewBinding
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : AppCompatActivity() {

    private val binding by viewBinding(ActivityMainBinding::inflate)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(binding.root)
    }
}