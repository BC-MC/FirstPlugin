package com.bct.fp;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.plugin.java.JavaPlugin;

public class Core extends JavaPlugin {
	
	public void onEnable(){
		Bukkit.getServer().getLogger().info("[First Plugin] Enabled!");
	}
	
	public void onDisable(){
		Bukkit.getServer().getLogger().info("[First Plugin] Disable!");
	}
	
	
	@Override
	public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
		
		if (!(sender instanceof Player)){
			sender.sendMessage(ChatColor.RED + "This Command can only be ran by a player!");
			 return true;
		}
		
		Player player = (Player) sender;
		
		if (command.getName().equalsIgnoreCase("fp")){
			player.sendMessage(ChatColor.GREEN + "This is the first plugin of the new show!");
		}
		
		return true;
	}
	

}
