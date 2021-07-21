package com.leo.valley.configuration

import com.leo.valley.Main
import org.bukkit.configuration.file.YamlConfiguration
import java.io.File

class Storage(private val main: Main, val fileName: String) {

    var file = File(main.dataFolder, fileName)
    var configuration : YamlConfiguration = YamlConfiguration()

    init {
        if (!file.exists()) {
            file.parentFile.mkdirs()
            main.saveResource(fileName, false)
        }

        configuration.load(file)
    }


}