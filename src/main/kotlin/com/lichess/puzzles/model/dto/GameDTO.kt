package com.lichess.puzzles.model.dto

import com.lichess.puzzles.model.entity.GamePerf
import com.lichess.puzzles.model.entity.Player

data class GameDTO (
    val id: String,
    val perf: GamePerf,
    val rated : Boolean,
    val players : List<Player>,
    val pgn: String,
    val clock: String
)