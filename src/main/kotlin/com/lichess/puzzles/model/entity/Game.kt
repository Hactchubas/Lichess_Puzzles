package com.lichess.puzzles.model.entity

import jakarta.persistence.*

@Entity
data class Game(
    @Id
    val id: String,
    @ManyToOne
    val perf: GamePerf,
    val rated : Boolean,
    @ManyToMany
    val players : List<Player>,
    val pgn: String,
    val clock: String
)
