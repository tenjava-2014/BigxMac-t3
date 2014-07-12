package com.tenjava.entries.BigxMac.t3;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.weather.WeatherEvent;

public class PlayerListener implements Listener 
{

	@EventHandler
	public void whenRaining(WeatherEvent event)
	{
	
		
	
		
		if(event.getWorld().hasStorm())
		{
			
			event.getWorld().getWeatherDuration();
			//TODO CHANGE TIME TO MORE TICKS (20tps) 3 secs is for demo!
			if(event.getWorld().getWeatherDuration() <=  60){
				
				
				
				
			}
			
			
			
		}else{}
		
		
	}
	
	
}
