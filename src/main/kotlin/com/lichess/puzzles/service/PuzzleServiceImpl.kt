package com.lichess.puzzles.service

import com.lichess.puzzles.model.dto.PuzzleDTO
import com.lichess.puzzles.model.utils.mapper.PuzzleMapper
import com.lichess.puzzles.repository.PuzzleRepository
import org.springframework.stereotype.Service

@Service
class PuzzleServiceImpl(
    private val puzzleRepository: PuzzleRepository,
    private val puzzleMapper: PuzzleMapper
): PuzzleService {
    override fun getPuzzles(): List<PuzzleDTO> {
        return puzzleRepository.findAll().toList().map {
            puzzleMapper.toDTO(it)
        }
    }

    override fun createPuzzle(puzzleDTO: PuzzleDTO): PuzzleDTO {
        val puzzle =  puzzleMapper.toEntity(puzzleDTO)
        puzzleRepository.save(puzzle)
        return puzzleMapper.toDTO(puzzle)
    }
}