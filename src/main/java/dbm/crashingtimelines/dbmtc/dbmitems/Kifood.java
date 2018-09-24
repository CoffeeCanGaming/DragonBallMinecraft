package dbm.crashingtimelines.dbmtc.dbmitems;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import dbm.crashingtimelines.dbmtc.DBMTCMain;
import dbm.crashingtimelines.dbmtc.lib.References;
import dbm.crashingtimelines.dbmtc.player.ExtendedPlayer;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class Kifood extends ItemFood{

	public Kifood(){
		super(3,0.6F,false);
		this.setUnlocalizedName("YellowTailTuna");
		this.setCreativeTab(DBMTCMain.DBMTab);
		
	}
	@Override
	public ItemStack onEaten(ItemStack itemstack, World world, EntityPlayer player) {
		ExtendedPlayer props = ExtendedPlayer.get(player);
		props.giveEnergy(5);
		return super.onEaten(itemstack, world, player);
		
		
	}

		
	@Override
	@SideOnly(Side.CLIENT)
	public void registerIcons(IIconRegister iconReg) {
		itemIcon = iconReg.registerIcon(References.MODID + ":" + this.getUnlocalizedName().substring(this.getUnlocalizedName().indexOf(".")+1));
	}
}
