package de.tzockt.rottenfleshtoleather;

import org.bukkit.plugin.java.JavaPlugin;
public class App extends JavaPlugin {
    @Override
    public void onEnable() {
        getLogger().info("Rotten Flesh to Leather aktiviert");
    }
    @Override
    public void onDisable() {
        getLogger().info("Rotten Flesh to Leather deaktiviert");
    }
}
