//class by CoffeeCanGaming for the server DragonBall:CrashingTimelines
package dbm.crashingtimelines.dbmtc.handlers;

import cpw.mods.fml.common.eventhandler.EventPriority;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import cpw.mods.fml.common.gameevent.InputEvent.KeyInputEvent;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import dbm.crashingtimelines.dbmtc.player.ExtendedPlayer;
import dbm.crashingtimelines.dbmtc.proxies.ClientProxy;
import net.minecraft.client.settings.KeyBinding;
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
	@SideOnly(Side.CLIENT)
	@SubscribeEvent(priority=EventPriority.NORMAL, receiveCanceled=true)
	public static void onEvent(KeyInputEvent event)
	{
	    // DEBUG
	    System.out.println("Key Input Event");

	    // make local copy of key binding array
	    KeyBinding[] keyBindings = ClientProxy.keyBindings;
	   
	    // check each enumerated key binding type for pressed and take appropriate action
	    if (keyBindings[0].isPressed()) 
	    {
	        // DEBUG
	        System.out.println("Key binding ="+keyBindings[0].getKeyDescription());
	            
	      
	    }
	}
}
