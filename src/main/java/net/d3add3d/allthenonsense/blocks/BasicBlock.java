package net.d3add3d.allthenonsense.blocks;

import java.util.List;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.d3add3d.allthenonsense.lib.Reference;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.IIcon;

public class BasicBlock extends CommonBlock {

	public BasicBlock(Material par0Material, String par1BlockName) {
		super(par0Material, par1BlockName);
		this.setBlockTextureName(Reference.MODID + ":" + Reference.MODID + "_" + par1BlockName);
	}

}
