package com.lichess.puzzles.service

import com.lichess.puzzles.model.dto.PuzzleDTO

interface PuzzleService {
    fun getPuzzles(): List<PuzzleDTO>
    fun createPuzzle(puzzleDTO: PuzzleDTO): PuzzleDTO
}