package dbm.crashingtimelines.dbmtc.handlers;

import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import dbm.crashingtimelines.dbmtc.player.ExtendedPlayer;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraftforge.event.entity.EntityEvent.EntityConstructing;

public class EventHandler {
	
	@SubscribeEvent
	public void onEntityConstructing(EntityConstructing event) {
	
	if (event.entity instanceof EntityPlayer && ExtendedPlayer.get((EntityPlayer)event.entity)==null)
		ExtendedPlayer.register((EntityPlayer)event.entity);
	
	if (event.entity instanceof EntityPlayer && event.entity.getExtendedProperties(ExtendedPlayer.Energy) == null)
		event.entity.registerExtendedProperties(ExtendedPlayer.Energy, new ExtendedPlayer((EntityPlayer)event.entity));
	
	}	
}
