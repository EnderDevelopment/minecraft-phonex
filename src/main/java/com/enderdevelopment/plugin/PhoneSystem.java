package com.enderdevelopment.plugin;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerCommandPreprocessEvent;
import org.bukkit.plugin.java.JavaPlugin;

public class PhoneSystem implements Listener {

    private static JavaPlugin plugin;

    public static void init(JavaPlugin plugin) {
        PhoneSystem.plugin = plugin;
        plugin.getServer().getPluginManager().registerEvents(new PhoneSystem(), plugin);
    }

    @EventHandler
    public void onPlayerCommand(PlayerCommandPreprocessEvent event) {
        Player player = event.getPlayer();
        String message = event.getMessage().toLowerCase();

        if (message.startsWith("/phone")) {
            event.setCancelled(true);
            openPhoneInterface(player);
        }
    }

    private void openPhoneInterface(Player player) {
        // Implement phone interface logic here
        player.sendMessage("Opening phone interface...");
    }

    public static void makeCall(Player player, String number) {
        // Implement call logic here
        player.sendMessage("Calling " + number + "...");
    }
}