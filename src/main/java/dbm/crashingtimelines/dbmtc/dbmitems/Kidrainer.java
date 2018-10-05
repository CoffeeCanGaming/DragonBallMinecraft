//class by CoffeeCanGaming for the server DragonBall:CrashingTimelines
package dbm.crashingtimelines.dbmtc.dbmitems;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import dbm.crashingtimelines.dbmtc.DBMTCMain;
import dbm.crashingtimelines.dbmtc.lib.References;
import dbm.crashingtimelines.dbmtc.player.ExtendedPlayer;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class Kidrainer extends Item{
	
	public Kidrainer(){
	this.setUnlocalizedName("Kidrainer");
	this.setCreativeTab(DBMTCMain.DBMTab);
}

	public ItemStack onItemRightClick (ItemStack itemstack, World world, EntityPlayer player){
		ExtendedPlayer props = ExtendedPlayer.get(player);
		props.consumeEnergy(25);
		return super.onItemRightClick(itemstack, world, player) ;
		
	}
	@Override
	@SideOnly(Side.CLIENT)
	public void registerIcons(IIconRegister iconReg) {
		itemIcon = iconReg.registerIcon(References.MODID + ":" + this.getUnlocalizedName().substring(this.getUnlocalizedName().indexOf(".")+1));
	}
}
