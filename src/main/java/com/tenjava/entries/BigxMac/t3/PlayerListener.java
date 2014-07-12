package com.tenjava.entries.BigxMac.t3;

import java.util.Random;

import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.World;
import org.bukkit.entity.Entity;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.Player;
import org.bukkit.entity.TNTPrimed;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDamageByEntityEvent;
import org.bukkit.event.entity.EntityDamageEvent.DamageCause;

public class PlayerListener implements Listener 
{

	
	
	@EventHandler
	public void ifHurtsnonHostile(EntityDamageByEntityEvent event)
	{
	if(TenJava.getInstance().getConfig().getBoolean("enabled") && event.getDamager() instanceof Player)
	{
			if(event.getCause() == DamageCause.ENTITY_ATTACK)
			{
				if(
						event.getEntityType() == EntityType.PIG || 
						event.getEntityType() == EntityType.COW ||
						event.getEntityType() == EntityType.SHEEP ||
						event.getEntityType() == EntityType.BAT ||
						event.getEntityType() == EntityType.CHICKEN)
						
				{
				// Random Number Generator
					Random rand = new Random();
					int number = 0;
					for(int i=1;i<=100;++i){
					
					number = 1+rand.nextInt(100);
					
				}
				
				//Gets config chance and may execute (random)
				
				if(number <= TenJava.instance.getConfig().getInt("ZombieChance")){
					
					Location loc = event.getDamager().getLocation();
					World world = event.getDamager().getWorld();
					world.spawnEntity(loc, EntityType.ZOMBIE);
					
					}
				}
			}
		}
	}
	
	
	
	
	@EventHandler
	public void hurtsCreeper(EntityDamageByEntityEvent event){
		if(TenJava.getInstance().getConfig().getBoolean("enabled") && event.getDamager() instanceof Player && 
				
				event.getCause() == DamageCause.ENTITY_ATTACK && event.getEntityType() == EntityType.CREEPER &&
				
				event.getDamage() <= 10)
		{
			
		
				Random rand = new Random();
				int number = 0;
				for(int i=1;i<=100;++i){
					
				number = 1+rand.nextInt(100);
					
				
				 
				if(number <= TenJava.instance.getConfig().getInt("CreeperChance")){
					
					Location creeper = event.getEntity().getLocation();
					Entity tnt = event.getEntity().getLocation().getWorld().spawnEntity(creeper, EntityType.PRIMED_TNT);
					((TNTPrimed)tnt).setFuseTicks(5);
					
				}
			}
		}
	}
	
	@EventHandler
	public void hurtsSkeleton(EntityDamageByEntityEvent event)
	{
		if(TenJava.getInstance().getConfig().getBoolean("enabled") && event.getDamager() instanceof Player &&
				
				event.getCause() == DamageCause.ENTITY_ATTACK && event.getEntityType() == EntityType.SKELETON &&
				
				event.getDamage() <= 19) 
			
		{
			
			Random rand = new Random();
			int number = 0;
			for(int i=1;i<=100;++i){
				
			number = 1+rand.nextInt(100);
			}
			
			
			if(number <= TenJava.instance.getConfig().getInt("SkeletonChance")){
				
				Location player = event.getDamager().getLocation();
				player.add(0, 4, 0);
				event.getDamager().getLocation().getWorld().spawnArrow(player, event.getEntity().getVelocity(), 0F, 0F);
				
				
			}
			
		}
		
	}
	
	@EventHandler
	public void hurtsSpider(EntityDamageByEntityEvent event)
	{
		if(TenJava.getInstance().getConfig().getBoolean("enabled") && event.getDamager() instanceof Player &&
				
				event.getCause() == DamageCause.ENTITY_ATTACK && event.getEntityType() == EntityType.SPIDER &&
				
				event.getDamage() <= 19) 
			
		{
			
			Random rand = new Random();
			int number = 0;
			for(int i=1;i<=100;++i){
				
			number = 1+rand.nextInt(100);
			}
			
			
			if(number <= TenJava.instance.getConfig().getInt("SpiderChance")){
				
				Location player = event.getDamager().getLocation();
				player.getBlock().setType(Material.WEB);
				player.add(0,1,0);
				player.getBlock().setType(Material.WEB);
				
				
			}
			
		}
		
	}
	
	
	
	
}
