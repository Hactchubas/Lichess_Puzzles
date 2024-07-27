package com.lichess.puzzles.model.utils.mapper

import com.lichess.puzzles.model.dto.PlayerDTO
import com.lichess.puzzles.model.entity.Player

class PlayerMapper: Mapper<PlayerDTO, Player> {
    override fun toEntity(d: PlayerDTO): Player {
        return Player(
            id = d.id,
            name = d.name,
            color = d.color,
            rating = d.rating
        )
    }

    override fun toDTO(e: Player): PlayerDTO {
        return PlayerDTO(
            id = e.id,
            name = e.name,
            color = e.color,
            rating = e.rating
        )
    }
}