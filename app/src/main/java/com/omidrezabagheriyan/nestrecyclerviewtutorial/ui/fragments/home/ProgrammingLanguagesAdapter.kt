package com.omidrezabagheriyan.nestrecyclerviewtutorial.ui.fragments.home

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.omidrezabagheriyan.nestrecyclerviewtutorial.databinding.ItemProgrammingLanguagesBinding
import com.omidrezabagheriyan.nestrecyclerviewtutorial.models.ProgrammingLanguages

class ProgrammingLanguagesAdapter :
    ListAdapter<ProgrammingLanguages, ProgrammingLanguagesAdapter.ProgrammingLanguagesViewHolder>(
        object : DiffUtil.ItemCallback<ProgrammingLanguages>() {
            override fun areItemsTheSame(
                oldItem: ProgrammingLanguages,
                newItem: ProgrammingLanguages
            ): Boolean {
                return oldItem.id == newItem.id
            }

            override fun areContentsTheSame(
                oldItem: ProgrammingLanguages,
                newItem: ProgrammingLanguages
            ): Boolean {
                return oldItem == newItem
            }
        }
    ) {
    class ProgrammingLanguagesViewHolder(private val binding: ItemProgrammingLanguagesBinding) :
        RecyclerView.ViewHolder(binding.root) {

        fun bind(programmingLanguages: ProgrammingLanguages) {
            binding.tvNameProgrammingLanguage.text = programmingLanguages.name
        }
    }

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): ProgrammingLanguagesViewHolder =
        ProgrammingLanguagesViewHolder(
            ItemProgrammingLanguagesBinding.inflate(
                LayoutInflater.from(parent.context),
                parent,
                false
            )
        )

    override fun onBindViewHolder(holder: ProgrammingLanguagesViewHolder, position: Int) {
        holder.bind(getItem(position))
    }
}
