package com.tenjava.entries.BigxMac.t3;

import java.util.Random;

import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.entity.EntityType;
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
				if(event.getEntityType() == EntityType.PIG){
				Random rand = new Random();
				int number = 0;
				for(int i=1;i<=100;++i){
					
					number = 1+rand.nextInt(100);
					
				}
				//TODO ADD CONFIG THAT ALLOWS CHANGE!
				if(number <= 100){
					
					Location loc = event.getDamager().getLocation();
					Bukkit.broadcastMessage(loc + "");
					
				}
			}
			
			
		}
		}
		
	}
	
}
