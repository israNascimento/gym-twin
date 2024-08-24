package com.isranascimento.gymtwin.dataprovider.room.entitities

import androidx.room.Entity
import androidx.room.ForeignKey

@Entity(
    foreignKeys = [
        ForeignKey(
            entity = Workout::class,
            parentColumns = ["id"],
            childColumns = ["workoutId"]
        )
    ],
    primaryKeys = ["id", "workoutId"]
)
data class WorkoutPlan(
    val id: Int,
    val workoutId: Int
)
