package com.gmail.skyshayde.skills;

import org.bukkit.Effect;
import org.bukkit.Material;
import org.bukkit.event.block.BlockBreakEvent;
import org.bukkit.event.block.BlockDamageEvent;
import org.bukkit.event.block.BlockPlaceEvent;
import org.bukkit.event.entity.EntityDamageByEntityEvent;
import org.bukkit.event.player.PlayerDropItemEvent;
import org.bukkit.event.player.PlayerInteractEntityEvent;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.event.player.PlayerItemHeldEvent;
import com.gmail.skyshayde.RPG;

import me.cybermaxke.materialapi.material.CustomMaterial;

public class BookBurn extends CustomMaterial {

	public BookBurn(String id, Material material) {
		super(id, material);
		this.setLore("Basic Spellbook!", "Light Enemies on Fire!");
		this.setName("Spellbook - Burn");
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
		RPG.removeMana(arg0.getPlayer().getName(), 2);
		org.bukkit.entity.Entity entity = arg0.getRightClicked();
		entity.setFireTicks(60);
	    entity.getWorld().playEffect(entity.getLocation(), Effect.MOBSPAWNER_FLAMES, 2);
		
	}
}
