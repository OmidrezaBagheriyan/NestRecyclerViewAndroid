package com.omidrezabagheriyan.nestrecyclerviewtutorial.utils

import com.omidrezabagheriyan.nestrecyclerviewtutorial.models.FieldsOfProgramming
import com.omidrezabagheriyan.nestrecyclerviewtutorial.models.ProgrammingLanguages

object FakeData {
    private val mobileProgrammingLanguages = mutableListOf(
        ProgrammingLanguages(0, "Java1", "Java is best"),
        ProgrammingLanguages(1, "Java2", "Java is best"),
        ProgrammingLanguages(2, "Java3", "Java is best"),
        ProgrammingLanguages(3, "Java4", "Java is best"),
        ProgrammingLanguages(4, "Java5", "Java is best"),
        ProgrammingLanguages(5, "Java6", "Java is best"),
    )
    private val webProgrammingLanguages = mutableListOf(
        ProgrammingLanguages(0, "Java1", "Java is best"),
        ProgrammingLanguages(1, "Java2", "Java is best"),
        ProgrammingLanguages(2, "Java3", "Java is best"),
        ProgrammingLanguages(3, "Java4", "Java is best"),
    )
    private val desktopProgrammingLanguages = mutableListOf(
        ProgrammingLanguages(0, "Java1", "Java is best"),
        ProgrammingLanguages(1, "Java2", "Java is best"),
        ProgrammingLanguages(2, "Java3", "Java is best"),
        ProgrammingLanguages(3, "Java4", "Java is best"),
        ProgrammingLanguages(4, "Java5", "Java is best"),
    )
    val fieldsOfProgramming = mutableListOf(
        FieldsOfProgramming(0, "Mobile", mobileProgrammingLanguages),
        FieldsOfProgramming(1, "Web", webProgrammingLanguages),
        FieldsOfProgramming(2, "Desktop", desktopProgrammingLanguages),
    )
}