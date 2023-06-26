package de.tzockt.rottenfleshtoleather;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.NamespacedKey;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.ShapedRecipe;
import org.bukkit.plugin.java.JavaPlugin;

public class rottenfleshtoleather extends JavaPlugin {
    @Override
    public void onEnable() {
        getLogger().info("§6Rotten Flesh to Leather aktiviert");

        NamespacedKey key = new NamespacedKey(this, "leather"); // Erstelle einen NamespacedKey für das Rezept

        ShapedRecipe rottenFleshToLeather = new ShapedRecipe(key, new ItemStack(Material.LEATHER, 1));
        rottenFleshToLeather.shape("RRR", "RRR", "RRR");
        rottenFleshToLeather.setIngredient('R', Material.ROTTEN_FLESH);

        Bukkit.addRecipe(rottenFleshToLeather);
    }

    @Override
    public void onDisable() {
        getLogger().info("§4Rotten Flesh to Leather deaktiviert");
    }
}
