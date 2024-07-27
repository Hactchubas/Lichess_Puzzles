package com.lichess.puzzles.model.entity

import jakarta.persistence.Entity
import jakarta.persistence.Id

@Entity
data class Player (
    @Id
    val id: String,
    val name: String,
    val color: String,
    val rating: Long
)
