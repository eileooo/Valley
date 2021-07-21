package com.leo.valley

import br.com.devsrsouza.kotlinbukkitapi.architecture.KotlinPlugin
import br.com.devsrsouza.kotlinbukkitapi.extensions.server.pluginManager
import com.leo.valley.configuration.Storage
import com.leo.valley.entities.CitizenManager
import com.leo.valley.skills.events.FarmEvents

class Main : KotlinPlugin() {

    private lateinit var storage : Storage
    private lateinit var config : Storage
    private lateinit var citizenManager : CitizenManager

    override fun onPluginEnable() {
        storage = Storage(this, "playerStorage.yml")
        config = Storage(this, "config.yml")
        citizenManager = CitizenManager(this)

        pluginManager.registerEvents(FarmEvents(citizenManager), this)

    }
}