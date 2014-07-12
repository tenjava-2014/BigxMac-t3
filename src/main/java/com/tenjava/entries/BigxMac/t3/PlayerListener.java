package com.tenjava.entries.BigxMac.t3;

import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerMoveEvent;
import org.bukkit.inventory.ItemStack;

public class PlayerListener implements Listener 
{

	@EventHandler
	public void getArmor(PlayerMoveEvent event)
	{
		Player player = event.getPlayer();
		
		
		if(player.getInventory().getBoots() != null){
			player.sendMessage("not null");
			if(player.getInventory().getBoots().getType().equals(new ItemStack(Material.LEATHER_BOOTS))){
				player.sendMessage("leather");
				
				
			}
			
		
		
		
		
			
		}
			
			
			
			
			
		
		
	}
	
	
	
	
	
	
	
}
