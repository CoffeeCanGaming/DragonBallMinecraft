package dbm.crashingtimelines.dbmtc.dbmCapitems;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import dbm.crashingtimelines.dbmtc.DBMTCMain;
import dbm.crashingtimelines.dbmtc.lib.References;
import dbm.crashingtimelines.dbmtc.player.ExtendedPlayer;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class PowerCapsuleZ extends Item{

	
	
	public PowerCapsuleZ(){
		super();
		this.setUnlocalizedName("PowerCapsuleZ");
		this.setCreativeTab(DBMTCMain.DBMTab);
		
	}
	@Override
	public ItemStack onEaten(ItemStack itemstack, World world, EntityPlayer player) {
		ExtendedPlayer props = ExtendedPlayer.get(player);
		props.giveEnergy(200);
		return super.onEaten(itemstack, world, player);
		
		
	}

		
	@SideOnly(Side.CLIENT)
	public void registerIcons(IIconRegister iconReg) {
		itemIcon = iconReg.registerIcon(References.MODID + ":" + this.getUnlocalizedName().substring(this.getUnlocalizedName().indexOf(".")+1));
	}
}

