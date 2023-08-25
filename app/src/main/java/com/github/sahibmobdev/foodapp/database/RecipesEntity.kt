package com.github.sahibmobdev.foodapp.database

import androidx.room.Entity
import androidx.room.PrimaryKey
import com.github.sahibmobdev.foodapp.models.FoodRecipe
import com.github.sahibmobdev.foodapp.util.Constants.RECIPES_TABLE

@Entity(tableName = RECIPES_TABLE)
class RecipesEntity(
    var foodRecipe: FoodRecipe
) {
    @PrimaryKey(autoGenerate = false)
    val id: Int = 0
}