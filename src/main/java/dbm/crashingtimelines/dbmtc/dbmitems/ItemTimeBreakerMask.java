package dbm.crashingtimelines.dbmtc.dbmitems;

import net.minecraft.entity.Entity;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemArmor.ArmorMaterial;

public class ItemTimeBreakerMask  extends ItemArmor {

	public ItemTimeBreakerMask(ArmorMaterial armorMaterial, int renderIndex, int armorType) {
		super(armorMaterial, renderIndex, armorType);
		}

	@Override
	public String getArmorTexture(ItemStack stack, Entity entity, int slot, String type) {
		if (this.armorType == 2) {
			return "dbc:textures/models/TimeBreakermask_layer_2.png";
		}
		return "dbc:textures/models/TimeBreakermask_layer_1.png";
	}
}
