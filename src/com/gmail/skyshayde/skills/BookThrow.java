package com.gmail.skyshayde.skills;

import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.block.BlockBreakEvent;
import org.bukkit.event.block.BlockDamageEvent;
import org.bukkit.event.block.BlockPlaceEvent;
import org.bukkit.event.entity.EntityDamageByEntityEvent;
import org.bukkit.event.player.PlayerDropItemEvent;
import org.bukkit.event.player.PlayerInteractEntityEvent;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.event.player.PlayerItemHeldEvent;
import org.bukkit.util.Vector;

import com.gmail.skyshayde.RPG;

import me.cybermaxke.materialapi.material.CustomMaterial;

public class BookThrow extends CustomMaterial {

	public BookThrow(String id, Material material) {
		super(id, material);
		this.setLore("Basic Spellbook!", "Throw Enemies into the Air!");
		this.setName("Spellbook - Throw");
	}
	
	@Override
	public void onBlockBreak(BlockBreakEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onBlockDamage(BlockDamageEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onBlockInteract(PlayerInteractEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onBlockPlaced(BlockPlaceEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onDrop(PlayerDropItemEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onHit(EntityDamageByEntityEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onHold(PlayerItemHeldEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onInteract(PlayerInteractEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onInteractEntity(PlayerInteractEntityEvent arg0) {
		RPG.removeMana(arg0.getPlayer().getName(), 1);
		org.bukkit.entity.Entity entity = arg0.getRightClicked();
		Player player = arg0.getPlayer();
		// Get velocity unit vector:
		Vector unitVector = entity.getLocation().toVector().subtract(player.getLocation().toVector()).normalize();
		// Set speed and push entity:
		entity.setVelocity(unitVector.multiply(5));
	}

}
