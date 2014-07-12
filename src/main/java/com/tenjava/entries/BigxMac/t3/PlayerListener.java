package com.tenjava.entries.BigxMac.t3;

import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDamageByEntityEvent;
import org.bukkit.event.entity.EntityDamageEvent.DamageCause;

public class PlayerListener implements Listener 
{

	@EventHandler
	public void ifHurtsnonHostile(EntityDamageByEntityEvent event){
		if(event.getDamager() instanceof Player){
			if(event.getCause() == DamageCause.ENTITY_ATTACK){
				Bukkit.broadcastMessage("test");
				
			}
			
			
		}
		
		
	}
	
}
