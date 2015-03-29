package net.d3add3d.allthenonsense;

import net.d3add3d.allthenonsense.handlers.BlockRegistrar;
import net.d3add3d.allthenonsense.handlers.CreativeTabs;
import net.d3add3d.allthenonsense.lib.Reference;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;

public class ClientProxy extends CommonProxy
{

	@Override
	protected void preInit(FMLPreInitializationEvent e)
	{
		super.preInit(e);
		
	}

	@Override
	protected void init(FMLInitializationEvent e)
	{
		super.init(e);
		Reference.commonTab = new CreativeTabs(net.minecraft.creativetab.CreativeTabs.getNextID(), Reference.MODID + "commonTab", BlockRegistrar.blocks[0]);
		BlockRegistrar.populateCreativeTabs();
	}

	@Override
	protected void postInit(FMLPostInitializationEvent e)
	{
		super.postInit(e);
	}
	
}
