package com.lichess.puzzles.model.utils.mapper

import com.lichess.puzzles.model.dto.GameDTO
import com.lichess.puzzles.model.entity.Game

class GameMapper : Mapper<GameDTO, Game> {
    override fun toEntity(d: GameDTO): Game =
        Game(
            d.id,
            d.perf,
            d.rated,
            d.players,
            d.pgn,
            d.clock
        )

    override fun toDTO(e: Game): GameDTO =
        GameDTO(
            e.id,
            e.perf,
            e.rated,
            e.players,
            e.pgn,
            e.clock
        )
}