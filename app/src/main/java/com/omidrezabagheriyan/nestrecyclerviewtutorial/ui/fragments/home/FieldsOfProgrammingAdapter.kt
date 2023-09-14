package com.omidrezabagheriyan.nestrecyclerviewtutorial.ui.fragments.home

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.omidrezabagheriyan.nestrecyclerviewtutorial.databinding.ItemFieldsOfProgrammingBinding
import com.omidrezabagheriyan.nestrecyclerviewtutorial.models.FieldsOfProgramming

class FieldsOfProgrammingAdapter :
    ListAdapter<FieldsOfProgramming, FieldsOfProgrammingAdapter.FieldsOfProgrammingViewHolder>(
        object : DiffUtil.ItemCallback<FieldsOfProgramming>() {
            override fun areItemsTheSame(
                oldItem: FieldsOfProgramming,
                newItem: FieldsOfProgramming
            ): Boolean {
                return oldItem.id == newItem.id
            }

            override fun areContentsTheSame(
                oldItem: FieldsOfProgramming,
                newItem: FieldsOfProgramming
            ): Boolean {
                return oldItem == newItem
            }
        }
    ) {

    inner class FieldsOfProgrammingViewHolder(private val binding: ItemFieldsOfProgrammingBinding) :
        RecyclerView.ViewHolder(binding.root) {
        fun bind(item: FieldsOfProgramming) {
            binding.tvTitleFieldsOfProgramming.text = item.name
            binding.rvListProgrammingLanguages.setHasFixedSize(true)
            val adapterProgrammingLanguages = ProgrammingLanguagesAdapter()
            adapterProgrammingLanguages.submitList(item.languageList)
            binding.rvListProgrammingLanguages.adapter = adapterProgrammingLanguages
        }
    }

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): FieldsOfProgrammingViewHolder =
        FieldsOfProgrammingViewHolder(
            ItemFieldsOfProgrammingBinding.inflate(
                LayoutInflater.from(parent.context),
                parent,
                false
            )
        )

    override fun onBindViewHolder(
        holder: FieldsOfProgrammingAdapter.FieldsOfProgrammingViewHolder,
        position: Int
    ) {
        holder.bind(getItem(position))
    }

}