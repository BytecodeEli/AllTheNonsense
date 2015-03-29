package net.d3add3d.allthenonsense.handlers;

import net.d3add3d.allthenonsense.blocks.CommonBlock;
import net.d3add3d.allthenonsense.items.CommonItem;
import net.minecraft.block.Block;
import net.minecraft.item.Item;

public class CreativeTabs extends net.minecraft.creativetab.CreativeTabs {

	CommonBlock block;
	CommonItem item;
	
	public CreativeTabs(int p_i1853_1_, String p_i1853_2_, CommonBlock par2Block) {
		super(p_i1853_1_, p_i1853_2_);
		block = par2Block;
	}

	@Override
	public Item getTabIconItem() {
		return Item.getItemFromBlock(block);
	}
	
}
