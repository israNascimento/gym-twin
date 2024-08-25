package com.isranascimento.gymtwin.dataprovider.room.database

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import com.isranascimento.gymtwin.dataprovider.room.ExerciseDao
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
abstract class GymTwinDatabase : RoomDatabase() {

    public abstract fun exerciseDao(): ExerciseDao

    companion object {
        @Volatile
        private var INSTANCE: GymTwinDatabase? = null

        fun getInstance(context: Context): GymTwinDatabase {
            synchronized(this) {
                var instance = INSTANCE
                if (instance == null) {
                    instance = Room.databaseBuilder(
                        context, GymTwinDatabase::class.java, "gymtwin.db"
                    )
                        .createFromAsset("gymtwin.db")
                        .build()
                    INSTANCE = instance
                }
                return instance
            }
        }
    }
}
