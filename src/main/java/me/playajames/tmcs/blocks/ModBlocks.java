package me.playajames.tmcs.blocks;

import net.minecraft.block.Block;
import net.minecraftforge.fml.common.registry.GameRegistry;

public final class ModBlocks {

	public static Block genericBlock;
	
	public static void createBlocks() {
		GameRegistry.registerBlock(genericBlock = new BasicBlock("generic_block"), "generic_block");
	}

}
