package net.d3add3d.allthenonsense;

import net.d3add3d.allthenonsense.blocks.CommonBlock;
import net.d3add3d.allthenonsense.handlers.BlockRegistrar;
import net.d3add3d.allthenonsense.handlers.CreativeTabs;
import net.d3add3d.allthenonsense.lib.Reference;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;

public class CommonProxy
{
	
	 protected void preInit(FMLPreInitializationEvent e)
	 {
		 BlockRegistrar.initAll();
	 }

	 protected void init(FMLInitializationEvent e)
	 {
		 BlockRegistrar.registerAll();
	 }

	 protected void postInit(FMLPostInitializationEvent e)
	 {
		 
	 }
	 
}
