package com.lichess.puzzles.model.utils.mapper

import com.lichess.puzzles.model.dto.ChessPuzzleDTO
import com.lichess.puzzles.model.entity.ChessPuzzle

class ChessPuzzleMapper : Mapper<ChessPuzzleDTO, ChessPuzzle> {
    override fun toEntity(d: ChessPuzzleDTO): ChessPuzzle =
        ChessPuzzle(
            d.id,
            d.game,
            d.puzzle
        )

    override fun toDTO(e: ChessPuzzle): ChessPuzzleDTO =
        ChessPuzzleDTO(
            e.id,
            e.game,
            e.puzzle
        )
}