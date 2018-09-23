package dbm.crashingtimelines.dbmtc.dbmitems;

import net.minecraft.entity.Entity;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemArmor.ArmorMaterial;

public class ItemAndroid17 extends ItemArmor {

	public ItemAndroid17(ArmorMaterial armorMaterial, int renderIndex, int armorType) {
		super(armorMaterial, renderIndex, armorType);
		}

	@Override
	public String getArmorTexture(ItemStack stack, Entity entity, int slot, String type) {
		if (this.armorType == 2) {
			return "dbc:textures/models/17_layer_2.png";
		}
		return "dbc:textures/models/17_layer_1.png";
	}
}
