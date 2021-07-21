package com.leo.valley.skills

import org.bukkit.entity.Player

data class FarmerSkill(val bukkitPlayer: Player) : Skill(bukkitPlayer, "Fazendeiro")
data class MinerSkill(val bukkitPlayer: Player) : Skill(bukkitPlayer, "Minerador")
data class LumberjackSkill(val bukkitPlayer: Player) : Skill(bukkitPlayer, "Lenhador")