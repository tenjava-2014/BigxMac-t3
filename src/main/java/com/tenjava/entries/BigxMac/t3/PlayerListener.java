package com.tenjava.entries.BigxMac.t3;

import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerInventoryEvent;
import org.bukkit.inventory.ItemStack;

@SuppressWarnings("deprecation")
public class PlayerListener implements Listener 
{

	@EventHandler
	public void getArmor(PlayerInventoryEvent event)
	{
		Player player = event.getPlayer();
		ItemStack leatherBoots = new ItemStack(Material.LEATHER_BOOTS);
		if(player.getInventory().getBoots() != null && player.getInventory().getBoots() == leatherBoots ){
			player.sendMessage("You are wearing leather boots!");
			
			
			
		}
		
	}
	
	
	
	
	
	
	
}
