package com.tenjava.entries.BigxMac.t3;

import org.bukkit.plugin.java.JavaPlugin;

public class TenJava extends JavaPlugin 
{
	
	public static TenJava instance;
	
	
	@Override
	public void onEnable()
	{
		
		instance = this;
		// States that the plugin is enabled!
		getLogger().info("Wild Water has been enabled!");
		//Sets up the Config
		getServer().getPluginManager().registerEvents(new PlayerListener(), getInstance());
		getConfig().addDefault("enabled", true);
		getConfig().addDefault("ZombieChance", 10);
		getConfig().addDefault("CreeperChance", 1);
		getConfig().addDefault("SkeletonChance", 1);
		getConfig().addDefault("SpiderChance", 10);
		getConfig().options().copyDefaults(true);
		saveConfig();
	}
	
	//Getter for Instance of this Class
	public static TenJava getInstance() 
	{
		
		return instance;
	}
	
	//Getter for Config
	public Object config()
	{
		return config();
	}

	//States that the plugin has been disabled!
	@Override
	public void onDisable()
	{
		
		getLogger().info("is currently disabled!");
		instance = null;
		
	}
	
	
	
	
	
	
}
