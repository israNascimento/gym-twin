package com.isranascimento.gymtwin.dataprovider.room.entitities

import androidx.room.Entity
import androidx.room.ForeignKey

@Entity(
    primaryKeys = ["idWorkout", "muscle"],
    foreignKeys = [
        ForeignKey(
            Muscle::class,
            ["name"],
            ["muscle"]
        ),
        ForeignKey(
            Workout::class,
            ["id"],
            ["idWorkout"]
        )
    ]
)
data class WorkoutMuscles(
    val idWorkout: Int,
    val muscle: String
)