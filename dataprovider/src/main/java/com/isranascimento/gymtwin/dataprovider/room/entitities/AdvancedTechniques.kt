package com.isranascimento.gymtwin.dataprovider.room.entitities

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class AdvancedTechniques(
    @PrimaryKey val name: String,
    val video: String,
    val annotation: String?
)