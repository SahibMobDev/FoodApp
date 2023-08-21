package com.github.sahibmobdev.foodapp.data

import com.github.sahibmobdev.foodapp.data.network.FoodRecipesApi
import com.github.sahibmobdev.foodapp.models.FoodRecipe
import retrofit2.Response
import javax.inject.Inject

class RemoteDataSource @Inject constructor(
    private val foodRecipesApi: FoodRecipesApi
) {

    suspend fun getRecipes(queries: Map<String, String>) : Response<FoodRecipe> {
        return foodRecipesApi.getRecipes(queries)
    }
}