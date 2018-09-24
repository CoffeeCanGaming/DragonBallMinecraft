package dbm.crashingtimelines.dbmtc.handlers;

import net.minecraft.client.Minecraft;
import net.minecraft.client.settings.KeyBinding;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraftforge.common.MinecraftForge;

import org.lwjgl.input.Keyboard;

import cpw.mods.fml.client.registry.ClientRegistry;
import cpw.mods.fml.common.FMLCommonHandler;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import cpw.mods.fml.common.gameevent.InputEvent.KeyInputEvent;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

@SideOnly(Side.CLIENT)
public class KeyBindingHandler {
	
	public static final KeyBinding backpackOpen =
			new KeyBinding("key.betterstorage.backpackOpen", Keyboard.KEY_B, "key.categories.gameplay");
	public static final KeyBinding drinkingHelmet =
			new KeyBinding("key.betterstorage.drinkingHelmet", Keyboard.KEY_F, "key.categories.gameplay");
	
	private static final KeyBinding[] bindings = new KeyBinding[]{ backpackOpen, drinkingHelmet };
	
	public KeyBindingHandler() {
		MinecraftForge.EVENT_BUS.register(this);
		FMLCommonHandler.instance().bus().register(this);
		
		ClientRegistry.registerKeyBinding(backpackOpen);
		ClientRegistry.registerKeyBinding(drinkingHelmet);
	}
	
	@SubscribeEvent
	public void onKey(KeyInputEvent event) {
		Minecraft mc = Minecraft.getMinecraft();
		EntityPlayer player = mc.thePlayer;
		if (!mc.inGameHasFocus || (player == null)) return;
		if (backpackOpen.isPressed() && (ItemBackpack.getBackpack(player) != null) &&
		    BetterStorage.globalConfig.getBoolean(GlobalConfig.enableBackpackOpen))
			BetterStorage.networkChannel.sendToServer(new PacketBackpackOpen());
		else if (drinkingHelmet.isPressed() && (player.getEquipmentInSlot(EquipmentSlot.HEAD) != null))
			BetterStorage.networkChannel.sendToServer(new PacketDrinkingHelmetUse());
	}
	
}