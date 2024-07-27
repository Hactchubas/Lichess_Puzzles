package com.lichess.puzzles.model.entity

import jakarta.persistence.Entity
import jakarta.persistence.Id

@Entity
data class GamePerf(
    @Id
    val key: String,
    val name: String,
)
