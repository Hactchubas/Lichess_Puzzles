package com.lichess.puzzles.repository

import com.lichess.puzzles.model.entity.GamePerf
import org.springframework.data.repository.CrudRepository

interface GamePerfRepository : CrudRepository<GamePerf, String>
