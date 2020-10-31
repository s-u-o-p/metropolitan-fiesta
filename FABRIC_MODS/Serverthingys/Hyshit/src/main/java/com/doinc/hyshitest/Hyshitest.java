package com.doinc.hyshitest;

import com.doinc.hyshitest.Commands.Give;
import com.doinc.hyshitest.Events.Telebow;
import com.doinc.hyshitest.Items.ItemManager;
import org.bukkit.block.Block;
import org.bukkit.entity.Entity;
import org.bukkit.entity.Player;
import org.bukkit.entity.Pose;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerBedLeaveEvent;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.inventory.EquipmentSlot;
import org.bukkit.plugin.java.JavaPlugin;
import org.bukkit.event.EventHandler;

public final class Hyshitest extends JavaPlugin implements Listener {

    @Override
    public void onEnable() {
        getLogger().info("Hmm yes");
        ItemManager.init();
        getCommand("deebugwand").setExecutor(new Give());
        getServer().getPluginManager().registerEvents(new Telebow(), this);
        // Plugin startup logic

    }

    @Override
    public void onDisable() {
        getLogger().info("Hmm no");
        // Plugin shutdown logic


    }

    public void onBedLeave(PlayerBedLeaveEvent Event) {
        Player player = Event.getPlayer();
        Pose z = player.getPose();
        player.setHealth(1d);
    }


}
