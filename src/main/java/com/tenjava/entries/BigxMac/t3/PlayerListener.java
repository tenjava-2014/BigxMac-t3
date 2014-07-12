package com.tenjava.entries.BigxMac.t3;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.event.weather.WeatherEvent;

public class PlayerListener implements Listener 
{

	Boolean storm = false;
	
	@SuppressWarnings("deprecation")
	@EventHandler
	public void onPlayerJoin(PlayerInteractEvent event)
	{
		
		Player player = event.getPlayer();
		 // Location loc = player.getLocation();
		
		if(storm){
			if(player.isOnGround()){
				
				
				
			
			 
			player.sendMessage("Its raining!");
		}
		}
		
		
	}
	
	@EventHandler
	public void whenRaining(WeatherEvent event)
	{

	
		if(event.getWorld().hasStorm())
		{
			
			event.getWorld().getWeatherDuration();
			//TODO CHANGE TIME TO MORE TICKS (20tps) 3 secs is for demo!
			if(event.getWorld().getWeatherDuration() <=  60){
				
				boolean storm = true;
				
				
				
			}
			
			
			
		}else{
			
			
			
		}
		
		
		
	}
	
	
	
}
