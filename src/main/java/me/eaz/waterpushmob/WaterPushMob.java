package me.eaz.waterpushmob;

import org.bukkit.plugin.java.JavaPlugin;

public class WaterPushMob extends JavaPlugin {

    @Override
    public void onEnable() {
        getServer().getPluginManager().registerEvents(new WaterListener(), this);
        getLogger().info("WaterPushMob enabled!");
    }

    @Override
    public void onDisable() {
        getLogger().info("WaterPushMob disabled!");
    }
}
