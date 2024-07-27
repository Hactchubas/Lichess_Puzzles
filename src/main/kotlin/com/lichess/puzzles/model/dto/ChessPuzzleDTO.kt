package com.lichess.puzzles.model.dto

import com.lichess.puzzles.model.entity.Game
import com.lichess.puzzles.model.entity.Puzzle

data class ChessPuzzleDTO(
    val id: Long,
    val game: Game,
    val puzzle: Puzzle,
)