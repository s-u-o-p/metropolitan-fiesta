package com.doinc.hyshitest.Commands;

import com.doinc.hyshitest.Items.ItemManager;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class Give implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (!(sender instanceof Player)) {
            return true;
        }
        Player player = (Player) sender;
        if (command.getName().equalsIgnoreCase("deebugwand")) {
            player.getInventory().addItem(ItemManager.deebugstick);
        }
        return true;
    }
}