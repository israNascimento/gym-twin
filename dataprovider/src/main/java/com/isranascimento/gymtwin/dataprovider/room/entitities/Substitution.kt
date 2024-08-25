package com.isranascimento.gymtwin.dataprovider.room.entitities

import androidx.room.Entity
import androidx.room.ForeignKey

@Entity(
    primaryKeys = ["nameExercise", "nameExerciseSubstitute"],
    foreignKeys = [
        ForeignKey(
            Exercise::class,
            parentColumns = ["name"],
            childColumns = ["nameExercise"]
        ),
        ForeignKey(
            Exercise::class,
            parentColumns = ["name"],
            childColumns = ["nameExerciseSubstitute"]
        ),
    ]
)
data class Substitution(
    val nameExercise: String,
    val nameExerciseSubstitute: String
)
