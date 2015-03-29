package net.d3add3d.allthenonsense.handlers;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import net.d3add3d.allthenonsense.blocks.BasicBlock;
import net.d3add3d.allthenonsense.blocks.CommonBlock;
import net.d3add3d.allthenonsense.lib.Reference;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import cpw.mods.fml.common.registry.GameRegistry;

public class BlockRegistrar {
	
	public static CommonBlock[] blocks;
	private static ArrayList<HashMap<String, Object>> blockObjects = new ArrayList<HashMap<String, Object>>();

	private static void populate()
	{
		
		//TODO: load blocks from file instead of defining them in code
		
		//Block 0, "test"
		HashMap<String, Object> map;
		map = new HashMap<String, Object>();
		map.put("type", "basic");
		map.put("material", Material.rock);
		map.put("name", "test");
		map.put("hardness", 1.8F);
		map.put("resistance", 2.0F);
		map.put("step", Block.soundTypeStone);
		map.put("light", 1.0F);
		blockObjects.add(map);
		
		
	}
	
	public static void initAll()
	{
		populate();
		blocks = new CommonBlock[blockObjects.size()];
		for(int i = 0; i < blockObjects.size(); i++)
		{
			System.out.println(i);
			blocks[i] = init(((String)blockObjects.get(i).get("type")),((Material)blockObjects.get(i).get("material")), ((String)blockObjects.get(i).get("name")));
			if(blockObjects.get(i).containsKey("light")) {
				blocks[i].setLightLevel(((float)blockObjects.get(i).get("light")));
			}
		}
	}
	
	public static void registerAll()
	{
		for(int i = 0; i < blocks.length; i++)
		{
			GameRegistry.registerBlock(blocks[i], Reference.MODID + "_" + ((String)blockObjects.get(i).get("name")));
		}
	}
	
	private static CommonBlock init(String par0Type, Material par1Material, String par2BlockName)
	{
		switch(par0Type)
		{
		case "basic":
			return new BasicBlock(par1Material, par2BlockName);
		default:
			return new CommonBlock(par1Material, par2BlockName);
		}
	}

	public static void populateCreativeTabs() {
		for(int j = 0; j < blocks.length; j++)
		{
			blocks[j].setCreativeTab(Reference.commonTab);
		}
	}
	
}
