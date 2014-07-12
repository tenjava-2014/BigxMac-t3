package com.tenjava.entries.BigxMac.t3;

import org.bukkit.plugin.java.JavaPlugin;

public class TenJava extends JavaPlugin 
{
	
	public static TenJava instance;
	
	
	@Override
	public void onEnable()
	{
		
		instance = this;
		
		getLogger().info("Wild Water has been enabled!");
		getServer().getPluginManager().registerEvents(new PlayerListener(), getInstance());
		getConfig().addDefault("Enabled", true);
		getConfig().addDefault("ZombieChance", 10);
		getConfig().addDefault("CreeperChance", 1);
		getConfig().addDefault("SkeletonChance", 1);
		getConfig().addDefault("SpiderChance", 10);
		getConfig().options().copyDefaults(true);
		saveConfig();
	}
	
	
	public static TenJava getInstance() 
	{
		
		return instance;
	}
	
	
	
	
	public Object config()
	{
		return config();
	}


	@Override
	public void onDisable()
	{
		
		getLogger().info("is currently disabled!");
		instance = null;
		
	}
	
	
	
	
	
	
}
