package me.playajames.tmcs.client.render.blocks;

import me.playajames.tmcs.TMCS;
import me.playajames.tmcs.blocks.ModBlocks;
import net.minecraft.block.Block;
import net.minecraft.client.Minecraft;
import net.minecraft.client.resources.model.ModelResourceLocation;
import net.minecraft.item.Item;

public final class BlockRenderRegister {
	
	public static String modid = TMCS.MODID;
	
	public static void registerBlockRenderer() {
		reg(ModBlocks.genericBlock);
	}

	public static void reg(Block block) {
	    Minecraft.getMinecraft().getRenderItem().getItemModelMesher()
	    .register(Item.getItemFromBlock(block), 0, new ModelResourceLocation(modid + ":" + block.getUnlocalizedName().substring(5), "inventory"));
	}
}
