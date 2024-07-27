package com.lichess.puzzles.model.entity

import jakarta.persistence.*

@Entity
data class Puzzle(
    @Id
    val id: String,
    val rating: Long,
    val plays: Long,
    @ElementCollection
    val solution: List<String>,
    @ElementCollection
    val themes: List<String>,
    val initialPlay: Long
)
