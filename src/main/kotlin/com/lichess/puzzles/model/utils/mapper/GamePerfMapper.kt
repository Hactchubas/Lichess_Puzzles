package com.lichess.puzzles.model.utils.mapper

import com.lichess.puzzles.model.dto.GamePerfDTO
import com.lichess.puzzles.model.entity.GamePerf

class GamePerfMapper : Mapper<GamePerfDTO, GamePerf> {
    override fun toEntity(d: GamePerfDTO): GamePerf =
        GamePerf(
            d.key,
            d.name
        )


    override fun toDTO(e: GamePerf): GamePerfDTO =
        GamePerfDTO(
            e.key,
            e.name
        )
}