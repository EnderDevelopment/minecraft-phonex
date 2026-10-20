package com.enderdevelopment.plugin;

import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin {

    @Override
    public void onEnable() {
        getLogger().info("PhonePlugin has been enabled!");
        // Initialize phone and app store systems
        PhoneSystem.init(this);
        AppStore.init(this);
    }

    @Override
    public void onDisable() {
        getLogger().info("PhonePlugin has been disabled!");
    }
}