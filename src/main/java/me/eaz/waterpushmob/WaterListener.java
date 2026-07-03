package me.eaz.waterpushmob;

import org.bukkit.Material;
import org.bukkit.block.Block;
import org.bukkit.entity.Creature;
import org.bukkit.entity.Entity;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerMoveEvent;
import org.bukkit.util.Vector;

public class WaterListener implements Listener {

    @EventHandler
    public void onPlayerMove(PlayerMoveEvent event) {
        for (Entity entity : event.getPlayer().getWorld().getEntities()) {

            if (!(entity instanceof Creature))
                continue;

            Block block = entity.getLocation().getBlock();

            if (block.getType() == Material.WATER
                    || block.getType() == Material.STATIONARY_WATER) {

                Vector velocity = entity.getVelocity();

                velocity.add(new Vector(0.12, 0, 0));

                entity.setVelocity(velocity);
            }
        }
    }
}
