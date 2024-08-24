package com.isranascimento.gymtwin.dataprovider.room.entitities

import androidx.room.Entity
import androidx.room.ForeignKey
import java.util.Date

@Entity(
    foreignKeys = [
        ForeignKey(
            entity = Exercise::class,
            parentColumns = ["id"],
            childColumns = ["exerciseId"]
        ),
        ForeignKey(
            entity = Exercise::class,
            parentColumns = ["id"],
            childColumns = ["substitutionId"]
        )
    ],
    primaryKeys = ["exerciseId", "trainingId", "date"]
)
data class WeightHistoric(
    val exerciseId: Int,
    val trainingId: Int,
    val date: Long,
    val weight: String,
    val substitutionId: Int?,
    val annotations: String?
)
