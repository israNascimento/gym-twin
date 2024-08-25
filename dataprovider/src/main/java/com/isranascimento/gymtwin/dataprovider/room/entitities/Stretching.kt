package com.isranascimento.gymtwin.dataprovider.room.entitities

import androidx.room.Entity
import androidx.room.ForeignKey
import androidx.room.PrimaryKey

@Entity(
    foreignKeys = [
        ForeignKey(
            entity = Muscle::class,
            parentColumns = ["name"],
            childColumns = ["muscle"]
        )
    ]
)
data class Stretching(
    @PrimaryKey(autoGenerate = true) val id: Int,
    val muscle: String,
    val video: String,
    val annotation: String?
)
