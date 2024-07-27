package com.lichess.puzzles.web.rest.controller

import com.lichess.puzzles.model.dto.PuzzleDTO
import com.lichess.puzzles.service.PuzzleService
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/puzzles")
class ChessPuzzleController (
    private val puzzleService: PuzzleService
){

    @GetMapping
    fun getAllPuzzles(): List<PuzzleDTO> = puzzleService.getPuzzles()
    @PostMapping("/new")
    fun createPuzzle(@RequestBody puzzleDTO: PuzzleDTO) : PuzzleDTO {
        return puzzleService.createPuzzle(puzzleDTO)
    }

}