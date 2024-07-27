package com.lichess.puzzles.repository

import com.lichess.puzzles.model.entity.Player
import org.springframework.data.repository.CrudRepository

interface PlayerRepository : CrudRepository<Player, String>