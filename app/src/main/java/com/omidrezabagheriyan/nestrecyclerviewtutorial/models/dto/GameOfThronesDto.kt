package com.omidrezabagheriyan.nestrecyclerviewtutorial.models.dto

import com.google.gson.annotations.SerializedName

data class GameOfThronesDto(
    @SerializedName("members")
    val members: List<Member>,
    @SerializedName("name")
    val name: String,
    @SerializedName("slug")
    val slug: String
) {
    data class Member(
        val name: String,
        val slug: String
    )
}