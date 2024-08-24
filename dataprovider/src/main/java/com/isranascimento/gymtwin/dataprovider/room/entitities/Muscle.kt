package com.isranascimento.gymtwin.dataprovider.room.entitities

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class Muscle(
    @PrimaryKey
    val name: String
)
