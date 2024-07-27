package com.lichess.puzzles.model.utils.mapper

import com.lichess.puzzles.model.dto.PuzzleDTO
import com.lichess.puzzles.model.entity.Puzzle
import org.springframework.stereotype.Service

@Service
class PuzzleMapper : Mapper<PuzzleDTO, Puzzle> {
    override fun toEntity(d: PuzzleDTO): Puzzle =
        Puzzle(
            d.id,
            d.rating,
            d.plays,
            d.solution,
            d.themes,
            d.initialPlay
        )

    override fun toDTO(e: Puzzle): PuzzleDTO =
        PuzzleDTO(
            e.id,
            e.rating,
            e.plays,
            e.solution,
            e.themes,
            e.initialPlay
        )
}