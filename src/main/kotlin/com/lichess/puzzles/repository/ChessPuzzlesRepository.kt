package com.lichess.puzzles.repository

import com.lichess.puzzles.model.entity.ChessPuzzle
import org.springframework.data.repository.CrudRepository

interface ChessPuzzlesRepository: CrudRepository<ChessPuzzle, Long> {}