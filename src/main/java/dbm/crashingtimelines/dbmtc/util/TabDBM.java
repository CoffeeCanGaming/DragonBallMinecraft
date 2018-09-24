package dbm.crashingtimelines.dbmtc.util;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Items;
import net.minecraft.item.Item;

public class TabDBM extends CreativeTabs{

	public TabDBM(int ID,String name){
		super(ID,name);
	}

	// I need to add dragonballs to the return image
	
	@Override
	@SideOnly(Side.CLIENT)
	public Item getTabIconItem() {
		return Items.apple;
	}
}
