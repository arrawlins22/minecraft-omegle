package com.rawlins.minecraftomegle;

import org.bukkit.plugin.java.JavaPlugin;

public class MinecraftOmegle extends JavaPlugin {
    @Override
    public void onEnable() {
        getLogger().info("Minecraft Omegle has been enabled!");
    }

    @Override
    public void onDisable() {
        getLogger().info("Minecraft Omegle has been disabled!");
    }
}

