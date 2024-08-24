package com.isranascimento.gymtwin.dataprovider.room.entitities

import androidx.room.Entity
import androidx.room.ForeignKey

@Entity(
    primaryKeys = ["idExercise", "idExerciseSubstitute"],
    foreignKeys = [
        ForeignKey(
            Exercise::class,
            parentColumns = ["id"],
            childColumns = ["idExercise"]
        ),
        ForeignKey(
            Exercise::class,
            parentColumns = ["id"],
            childColumns = ["idExerciseSubstitute"]
        ),
    ]
)
data class Substitution(
    val idExercise: Int,
    val idExerciseSubstitute: Int
)
