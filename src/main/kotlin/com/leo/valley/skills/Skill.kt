package com.leo.valley.skills

import com.leo.valley.utils.sendActionBar
import com.leo.valley.utils.colorize
import org.bukkit.entity.Player

abstract class Skill(val player: Player, val name: String) {
    var xp = 0.0
    var requiredXp = 100.0
    var level = 1
    var incrementor = 1.0

    init {

    }

    private fun getNextLevelXp(): Double = requiredXp * 2.5

    fun increment() {
        xp += incrementor
        if (xp >= requiredXp) {
            requiredXp = getNextLevelXp()
            xp = 0.0
            level++
        }
        player.sendMessage("§e$name - §6$level - §e+${incrementor} §6($xp/$requiredXp)".colorize())
        player.sendActionBar("§e$name - §6$level - §e+${incrementor} §6($xp/$requiredXp)".colorize())
    }

}


