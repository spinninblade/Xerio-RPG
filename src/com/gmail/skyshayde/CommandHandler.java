package com.gmail.skyshayde;

import org.bukkit.OfflinePlayer;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class CommandHandler implements CommandExecutor {

	@Override
	public boolean onCommand(CommandSender arg0, Command arg1, String arg2, String[] arg3) {
		if (arg1.getName().equalsIgnoreCase("class")) {

			return true;
		}
		return false;

	}

	public boolean onCommand1(CommandSender arg0, Command arg1, String arg2, String[] arg3) {
		if (arg1.getName().equalsIgnoreCase("spellbook")) {

			if (arg0 instanceof Player) {
				if (((Player) arg0).getPlayer().isOp() == true) {
					if(arg3.equals("burn")) {
						RPG.giveSpellbookBurn(((Player) arg0).getPlayer());
					}
					if(arg3.equals("toss")) {
						RPG.giveSpellbookBurn(((Player) arg0).getPlayer());
					}
					return true;
				}
			}
		}
		return false;

	}

	public boolean onCommand11(CommandSender arg0, Command arg1, String arg2, String[] arg3) {
		if (arg1.getName().equalsIgnoreCase("mana")) {
			if(arg0 instanceof Player) {
				arg0.sendMessage(RPG.mana.get(((Player) arg0).getPlayer().getName()).toString());
			return true;
		}}
		return false;

	}
}
