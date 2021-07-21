package com.leo.valley.entities

import com.leo.valley.Main
import org.bukkit.entity.Player

class CitizenManager(main: Main) {

    private val citizenCache = arrayListOf<Citizen>()

    fun getCitizen(player: Player): Citizen {
        val requiredCitizen = citizenCache.filter { it.uuid == player.uniqueId.toString() }
        return if (requiredCitizen.isEmpty()) {
            val newCitizen = Citizen(player)
            citizenCache.add(newCitizen)
            return newCitizen

        } else requiredCitizen.first()
    }

}