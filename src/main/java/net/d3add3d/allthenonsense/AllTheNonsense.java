package net.d3add3d.allthenonsense;

import net.d3add3d.allthenonsense.lib.Reference;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = Reference.MODID, version = Reference.VERSION, name = Reference.MOD_NAME)
public class AllTheNonsense
{
	
	@SidedProxy(clientSide="net.d3add3d.allthenonsense.ClientProxy", serverSide="net.d3add3d.allthenonsense.ServerProxy")
	public static CommonProxy proxy;

	@EventHandler
    public void preInit(FMLPreInitializationEvent event)
	{
    	this.proxy.preInit(event);
    }
	
	@EventHandler
	public void init(FMLInitializationEvent event)
	{
		this.proxy.init(event);
	}
	
	@EventHandler
	public void postInit(FMLPostInitializationEvent event)
	{
		this.proxy.postInit(event);
	}
    
}