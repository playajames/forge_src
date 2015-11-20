package me.playajames.tmcs;

import me.playajames.tmcs.blocks.ModBlocks;
import me.playajames.tmcs.commands.SampleCommand;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.event.FMLServerStartingEvent;

@Mod(modid = TMCS.MODID, version = TMCS.VERSION)
public class TMCS {
	@SidedProxy(clientSide="me.playajames.tmcs.ClientProxy", serverSide="me.playajames.tmcs.ServerProxy")
	public static CommonProxy proxy;
	
    public static final String MODID = "tmcs";
    public static final String VERSION = "0.1";
    
    @EventHandler
    public void preInit(FMLPreInitializationEvent event) {
    	proxy.preInit(event);
    }
    
    @EventHandler
    public void init(FMLInitializationEvent event) {
    	proxy.init(event);

    }
    
    @EventHandler
    public void postInit(FMLPostInitializationEvent event) {
    	proxy.postInit(event);

    }
    
    @EventHandler
    public void serverLoad(FMLServerStartingEvent event) {
    	 event.registerServerCommand(new SampleCommand());
    }
}
