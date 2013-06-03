package com.gmail.skyshayde;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import me.cybermaxke.materialapi.inventory.CustomItemStack;
import me.cybermaxke.materialapi.material.CustomMaterial;

import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerLoginEvent;
import org.bukkit.plugin.java.JavaPlugin;

import com.gmail.skyshayde.skills.BookBurn;
import com.gmail.skyshayde.skills.BookThrow;

public class RPG extends JavaPlugin implements Listener {
	public static HashMap<String, Integer> mana = new HashMap<String, Integer>();
	HashMap<String, String> pc = new HashMap<String, String>();
	HashMap<String, Integer> level = new HashMap<String, Integer>();
	List<String> players = new ArrayList<String>();
	public static CustomMaterial BOOKTHROW;
	public static CustomMaterial BOOKBURN;
	
	public void onEnable() {
		getServer().getPluginManager().registerEvents(this, this);
		getServer().getPluginManager().registerEvents(new SkillsListener(), this);
	}
	public void onPlayerLogin(PlayerLoginEvent event) {
		players.add(event.getPlayer().getName());
	}
	
	 
	 
	void startMana() {
		this.getServer().getScheduler().scheduleSyncRepeatingTask(this, new Runnable() {

			@Override
			public void run() {
				for (Integer count = 0; players.size() > count; count++) {
					String playername = players.get(count);
					mana.put(playername, mana.get(playername) + 1);
					Integer currMana = mana.get(playername);
					if (currMana > level.get(playername) * 10) {
						currMana = level.get(playername) * 10;
					}
				}
			}

		}, 0L, 100L);
	}

	public static void removeMana(String playername, Integer amount) {
		mana.put(playername, mana.get(playername) - amount);
	}

	public static void giveSpellbookThrow(Player player) {
		 BOOKTHROW = new BookThrow("Spellbook - Throw", Material.BOOK);
	    CustomItemStack is = new CustomItemStack(BOOKTHROW);
	    player.getInventory().addItem(is.getItem());
	}
	public static void giveSpellbookBurn(Player player) {
		 BOOKBURN = new BookBurn("Spellbook - Burn", Material.BOOK);
	    CustomItemStack is = new CustomItemStack(BOOKBURN);
	    player.getInventory().addItem(is.getItem());
	}
}
