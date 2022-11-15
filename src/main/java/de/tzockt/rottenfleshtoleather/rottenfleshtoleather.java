package de.tzockt.rottenfleshtoleather;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.ShapedRecipe;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.plugin.java.JavaPlugin;
public class rottenfleshtoleather extends JavaPlugin {
    @Override
    public void onEnable() {
        getLogger().info("Rotten Flesh to Leather aktiviert");

    ShapedRecipe rottenfleshtoleather = new ShapedRecipe(new ItemStack(Material.LEATHER, 1));
    rottenfleshtoleather.shape("RRR", "RRR", "RRR" );
    rottenfleshtoleather.setIngredient('R', Material.ROTTEN_FLESH);
    Bukkit.addRecipe(rottenfleshtoleather);
    
    }
    @Override
    public void onDisable() {
        getLogger().info("Rotten Flesh to Leather deaktiviert");
    }
}
