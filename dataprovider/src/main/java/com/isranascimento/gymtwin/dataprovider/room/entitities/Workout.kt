package com.isranascimento.gymtwin.dataprovider.room.entitities

import androidx.room.Entity
import androidx.room.PrimaryKey
import java.util.Date

@Entity
data class Workout(
    @PrimaryKey(autoGenerate = true)
    val id: Int,
    val identifier: Char,
    val date: Long,
    val hasPreWorkout: Boolean,
    val focus: String,
    val aerobic: String
)
