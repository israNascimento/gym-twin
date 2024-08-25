package com.isranascimento.gymtwin.dataprovider.room.entitities

import androidx.room.Entity
import androidx.room.ForeignKey
import androidx.room.PrimaryKey

@Entity(
    foreignKeys = [
        ForeignKey(
            Exercise::class,
            parentColumns = ["name"],
            childColumns = ["nameExercise"]
        ),
        ForeignKey(
            Exercise::class,
            parentColumns = ["name"],
            childColumns = ["nameExerciseSubstitute"],
        ),
    ]
)
data class Substitution(
    @PrimaryKey(true) val id: Int,
    val nameExercise: String,
    val nameExerciseSubstitute: String?
)
