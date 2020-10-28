package com.doinc.hyshitest.Events;

import com.doinc.hyshitest.Items.ItemManager;
import org.bukkit.Location;
import org.bukkit.Sound;
import org.bukkit.entity.Arrow;
import org.bukkit.entity.Player;
import org.bukkit.entity.Snowball;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.ProjectileHitEvent;
import org.bukkit.event.entity.ProjectileLaunchEvent;

import java.util.UUID;

import static org.bukkit.Bukkit.getLogger;

public class Telebow implements Listener {
    @EventHandler
    public void onSnowThrow(ProjectileLaunchEvent Event) {
        if (Event.getEntity() instanceof Snowball) {
            Player player = (Player) Event.getEntity().getShooter();
            Snowball arrow = (Snowball) Event.getEntity();
            getLogger().info("yes");
            arrow.setPassenger(player);
        }
    }

    @EventHandler
    public void onProjectileHit(ProjectileHitEvent Event) {
        Player player = (Player) Event.getEntity().getShooter();
        Location player_location = player.getLocation();
        Location location = Event.getEntity().getLocation();
        UUID z = player.getUniqueId();
        if (Event.getEntity() instanceof Arrow) {
            Arrow arrow = (Arrow) Event.getEntity();
            arrow.remove();
            location.setYaw(player_location.getYaw());
            location.setPitch(player_location.getPitch());
            player.teleport(location);
            player.playSound(player.getLocation(), Sound.ITEM_CHORUS_FRUIT_TELEPORT, 1F, 1F);
        if (Event.getEntity() instanceof Snowball) {
            player.setInvulnerable(true);
            location.createExplosion(4F, true);
            getLogger().info("penus");
            player.setInvulnerable(false);
            player.getInventory().addItem(ItemManager.deebugstick);
        }
        }
    }
    @EventHandler
    public void onSnowHit(ProjectileHitEvent Event) {
        Player player = (Player) Event.getEntity().getShooter();
        Location location = (Location) Event.getEntity().getLocation();
        if (Event.getEntity() instanceof Snowball) {
            player.setInvulnerable(true);
            location.createExplosion(4F, false);
            getLogger().info("penus");
            player.setInvulnerable(false);
        }
    }
}
