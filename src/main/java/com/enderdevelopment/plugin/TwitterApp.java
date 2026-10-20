package com.enderdevelopment.plugin;

import org.bukkit.entity.Player;

public class TwitterApp implements App {

    @Override
    public void install(Player player) {
        player.sendMessage("Installing Twitter app...");
        // Implement Twitter app installation logic here
    }

    @Override
    public void launch(Player player) {
        player.sendMessage("Launching Twitter app...");
        // Implement Twitter app launch logic here
    }
}