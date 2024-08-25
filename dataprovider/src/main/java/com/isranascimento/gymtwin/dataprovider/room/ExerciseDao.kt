package com.isranascimento.gymtwin.dataprovider.room

import androidx.room.Dao
import androidx.room.Query
import com.isranascimento.gymtwin.dataprovider.room.entitities.Exercise

@Dao
interface ExerciseDao {
    @Query("SELECT * FROM exercise")
    fun getExercises(): List<Exercise>
}