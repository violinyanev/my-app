package com.example.myapplication.recipes.domain.model

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
class Recipe(
    val title: String,
    val content: String,
    val timestamp: Long,
    @PrimaryKey val id: Int? = null
)

class InvalidRecipeException(message: String) : Exception(message)
