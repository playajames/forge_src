package me.playajames.tmcs.commands;

import java.util.ArrayList;
import java.util.List;

import net.minecraft.command.CommandException;
import net.minecraft.command.ICommand;
import net.minecraft.command.ICommandSender;
import net.minecraft.util.BlockPos;
import net.minecraft.util.ChatComponentText;

public class SampleCommand implements ICommand {
	private List aliases;
  	public SampleCommand() {
    this.aliases = new ArrayList();
    this.aliases.add("sample");
    this.aliases.add("sam");
}

	@Override
	public boolean isUsernameIndex(String[] astring, int i) {
		return false;
	}
	
	@Override
	public int compareTo(Object o) {
		return 0;
	}
	
	@Override
	public String getName() {
		return "sample";
	}
	
	@Override
	public List getAliases() {
		return this.aliases;
	}
	
	@Override
	public void execute(ICommandSender sender, String[] args) throws CommandException {
		if (args.length == 0) {
			sender.addChatMessage(new ChatComponentText("Invalid argument!"));
		} else {
			sender.addChatMessage(new ChatComponentText("Sample: [" + args[0] + "]"));
		}
	}
	
	@Override
	public boolean canCommandSenderUse(ICommandSender sender) {
		return true;
	}
	
	@Override
	public List addTabCompletionOptions(ICommandSender sender, String[] args, BlockPos pos) {
		return null;
	}
	
	@Override
	public String getCommandUsage(ICommandSender sender) {
		return "sample <text>";
	}
}