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
            ["name"],
            ["exerciseName"]
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
    val exerciseName: String,
    val series: String, // 3x12
    val advancedTechniqueName: String?
)
