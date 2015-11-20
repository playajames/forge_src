package me.playajames.tmcs;

import me.playajames.tmcs.blocks.ModBlocks;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

public class CommonProxy {
	public void preInit(FMLPreInitializationEvent e) {
		ModBlocks.createBlocks();
    }

    public void init(FMLInitializationEvent e) {
		//here
    }

    public void postInit(FMLPostInitializationEvent e) {
		//here
    }
}
