package com.leo.valley.entities

import com.leo.valley.skills.*
import org.bukkit.entity.Player

class Citizen(val player: Player) {
    val uuid = player.uniqueId.toString()
    val farmer = FarmerSkill(player)
    val miner = MinerSkill(player)
    val lumberjack = LumberjackSkill(player)

}