package com.lichess.puzzles.model.dto


data class PuzzleDTO (
    val id: String,
    val rating: Long,
    val plays: Long,
    val solution: List<String>,
    val themes: List<String>,
    val initialPlay: Long
)