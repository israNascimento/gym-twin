package com.isranascimento.gymtwin.dataprovider.room.database

import androidx.room.Database
import androidx.room.RoomDatabase
import com.isranascimento.gymtwin.dataprovider.room.entitities.AdvancedTechniques
import com.isranascimento.gymtwin.dataprovider.room.entitities.Exercise
import com.isranascimento.gymtwin.dataprovider.room.entitities.Muscle
import com.isranascimento.gymtwin.dataprovider.room.entitities.Stretching
import com.isranascimento.gymtwin.dataprovider.room.entitities.Substitution
import com.isranascimento.gymtwin.dataprovider.room.entitities.WeightHistoric
import com.isranascimento.gymtwin.dataprovider.room.entitities.Workout
import com.isranascimento.gymtwin.dataprovider.room.entitities.WorkoutExercise
import com.isranascimento.gymtwin.dataprovider.room.entitities.WorkoutMuscles
import com.isranascimento.gymtwin.dataprovider.room.entitities.WorkoutPlan

@Database(
    entities = [
        AdvancedTechniques::class,
        Exercise::class,
        Muscle::class,
        Stretching::class,
        Substitution::class,
        WeightHistoric::class,
        Workout::class,
        WorkoutExercise::class,
        WorkoutMuscles::class,
        WorkoutPlan::class
    ],
    version = 1
)
abstract class GymTwinDatabase : RoomDatabase()
