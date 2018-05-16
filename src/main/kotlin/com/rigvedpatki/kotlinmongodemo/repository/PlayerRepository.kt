package com.rigvedpatki.kotlinmongodemo.repository

import com.rigvedpatki.kotlinmongodemo.model.Player
import org.springframework.data.repository.CrudRepository

interface PlayerRepository : CrudRepository<Player, String> {
    fun findTop3ByOrderByTotalScoreDesc() : List<Player>
}