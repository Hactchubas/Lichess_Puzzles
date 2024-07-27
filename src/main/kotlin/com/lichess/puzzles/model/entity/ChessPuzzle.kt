package com.lichess.puzzles.model.entity

import com.fasterxml.jackson.annotation.JsonProperty
import jakarta.persistence.*

@Entity
data class ChessPuzzle(
    @Id
    @GeneratedValue
    @JsonProperty(value = "id", access = JsonProperty.Access.READ_ONLY)
    val id: Long,
    @ManyToOne
    val game: Game,
    @OneToOne
    val puzzle: Puzzle,
)
