package com.leo.valley.skills.events

import com.leo.valley.entities.CitizenManager
import org.bukkit.Bukkit

import org.bukkit.Material
import org.bukkit.event.EventHandler
import org.bukkit.event.Listener
import org.bukkit.event.block.BlockBreakEvent

class FarmEvents(private val citizenManager: CitizenManager) : Listener {


    @EventHandler
    fun onBlockBreakEvent(event: BlockBreakEvent) {
        Bukkit.getConsoleSender().sendMessage(".")
        if (event.block.type != Material.CROPS) return
        val player = event.player
        player.sendMessage("aqui!")
        val citizen = citizenManager.getCitizen(player)
        citizen.farmer.increment()

    }



}