package com.enderdevelopment.plugin;

import org.bukkit.entity.Player;
import org.bukkit.plugin.java.JavaPlugin;

import java.util.HashMap;
import java.util.Map;

public class AppStore {

    private static JavaPlugin plugin;
    private static Map<String, App> apps = new HashMap<>();

    public static void init(JavaPlugin plugin) {
        AppStore.plugin = plugin;
        // Add default apps
        apps.put("twitter", new TwitterApp());
    }

    public static void openAppStore(Player player) {
        // Implement app store interface logic here
        player.sendMessage("Opening app store...");
    }

    public static void installApp(Player player, String appName) {
        App app = apps.get(appName.toLowerCase());
        if (app != null) {
            app.install(player);
        } else {
            player.sendMessage("App not found: " + appName);
        }
    }

    public static void launchApp(Player player, String appName) {
        App app = apps.get(appName.toLowerCase());
        if (app != null) {
            app.launch(player);
        } else {
            player.sendMessage("App not found: " + appName);
        }
    }
}