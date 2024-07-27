package com.lichess.puzzles.repository

import com.lichess.puzzles.model.entity.Puzzle
import org.springframework.data.repository.CrudRepository

interface PuzzleRepository : CrudRepository<Puzzle, String>
