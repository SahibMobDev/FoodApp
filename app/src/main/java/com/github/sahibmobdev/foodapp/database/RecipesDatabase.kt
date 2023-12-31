package com.github.sahibmobdev.foodapp.database

import androidx.room.Database
import androidx.room.RoomDatabase


@Database(
    entities = [RecipesEntity::class],
    version = 1,
    exportSchema = false
)
abstract class RecipesDatabase : RoomDatabase() {

    abstract fun recipesDao(): RecipesDao
}