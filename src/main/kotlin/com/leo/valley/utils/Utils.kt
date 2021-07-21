package com.leo.valley.utils

import net.minecraft.server.v1_8_R3.ChatComponentText
import net.minecraft.server.v1_8_R3.PacketPlayOutChat
import org.bukkit.ChatColor
import org.bukkit.craftbukkit.v1_8_R3.entity.CraftPlayer
import org.bukkit.entity.Player

fun Player.sendActionBar(message: String) {
    val packet = PacketPlayOutChat(ChatComponentText(message), 2)
    (this as CraftPlayer).handle.playerConnection.sendPacket(packet)
}

fun String.colorize(): String {
    return ChatColor.translateAlternateColorCodes('§', this)
}
