package com.tenjava.entries.BigxMac.t3;

import org.bukkit.plugin.Plugin;
import org.bukkit.plugin.java.JavaPlugin;

public class TenJava extends JavaPlugin {
	
	public static TenJava instance;
	
	@Override
	public void onEnable(){
		
		instance = this;
		
		getLogger().info("Wild Water has been enabled!");
		getServer().getPluginManager().registerEvents(new PlayerListener(), getInstance());
		
	}
	
	
	private Plugin getInstance() {
		
		return instance;
	}


	@Override
	public void onDisable(){
		
		getLogger().info("is currently disabled!");
		instance = null;
		
	}
	
	
	
	
	
}
