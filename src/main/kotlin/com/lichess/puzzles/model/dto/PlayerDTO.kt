package com.lichess.puzzles.model.dto

data class PlayerDTO (
    val id: String,
    val name: String,
    val color: String,
    val rating: Long
)