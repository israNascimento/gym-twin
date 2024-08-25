package com.isranascimento.gymtwin.dataprovider.room.entitities

import androidx.room.Entity
import androidx.room.ForeignKey
import androidx.room.PrimaryKey

@Entity(
    foreignKeys = [
        ForeignKey(
            Muscle::class,
            parentColumns = ["name"],
            childColumns = ["muscle"]
        )
    ]
)
data class Exercise(
    @PrimaryKey val name: String,
    val video: String,
    val annotations: String?,
    val muscle: String,
)
