package net.d3add3d.allthenonsense.blocks;

import net.d3add3d.allthenonsense.lib.Reference;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class CommonBlock extends Block {

	public CommonBlock(Material par0Material, String par1BlockName)
	{
		super(par0Material);
		this.setBlockName(Reference.MODID + "_" + par1BlockName);
	}
	
	/*
	 * Block sides(facing north):
	 * 	0 - bottom
	 * 	1 - top
	 * 	2 - back mirrored
	 * 	3 - front
	 * 	4 - left
	 * 	5 - right
	 * 
	 */

}
