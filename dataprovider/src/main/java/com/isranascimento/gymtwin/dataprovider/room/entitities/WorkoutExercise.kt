package com.isranascimento.gymtwin.dataprovider.room.entitities

import androidx.room.Entity
import androidx.room.ForeignKey
import androidx.room.PrimaryKey

@Entity(
    foreignKeys = [
        ForeignKey(
            Workout::class,
            ["id"],
            ["idWorkout"]
        ),
        ForeignKey(
            Exercise::class,
            ["id"],
            ["idExercise"]
        ),
        ForeignKey(
            AdvancedTechniques::class,
            ["name"],
            ["advancedTechniqueName"]
        )
    ]
)
data class WorkoutExercise(
    @PrimaryKey val id: Int,
    val idWorkout: Int,
    val idExercise: Int,
    val series: String,
    val advancedTechniqueName: String
)
