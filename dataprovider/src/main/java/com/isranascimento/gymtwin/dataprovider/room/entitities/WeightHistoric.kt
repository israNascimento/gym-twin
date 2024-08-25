package com.isranascimento.gymtwin.dataprovider.room.entitities

import androidx.room.Entity
import androidx.room.ForeignKey
import java.util.Date

@Entity(
    foreignKeys = [
        ForeignKey(
            entity = Exercise::class,
            parentColumns = ["name"],
            childColumns = ["exerciseName"]
        ),
        ForeignKey(
            entity = Exercise::class,
            parentColumns = ["name"],
            childColumns = ["substitutionName"]
        )
    ],
    primaryKeys = ["exerciseName", "trainingId", "date"]
)
data class WeightHistoric(
    val exerciseName: String,
    val trainingId: Int,
    val date: Long,
    val weight: String,
    val substitutionName: String?,
    val annotations: String?
)
