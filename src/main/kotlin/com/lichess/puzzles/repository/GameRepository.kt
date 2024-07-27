package com.lichess.puzzles.repository

import com.lichess.puzzles.model.entity.Game
import org.springframework.data.repository.CrudRepository

interface GameRepository : CrudRepository<Game, String>
