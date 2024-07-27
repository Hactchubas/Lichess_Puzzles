package com.lichess.puzzles.model.utils.mapper

interface Mapper <D, E>{
    fun toEntity(d: D): E
    fun toDTO(e: E): D
}