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
import dbm.crashingtimelines.dbmtc.gui.CharacterSheetGui;


public class KeyBindingHandler {
	
	public static KeyBinding charactersheet = new KeyBinding("Character Sheet", Keyboard.KEY_B, "DBM");
	
	private static final KeyBinding[] bindings = new KeyBinding[]{ charactersheet };
	
	public KeyBindingHandler() {
		MinecraftForge.EVENT_BUS.register(this);
		FMLCommonHandler.instance().bus().register(this);
		
		ClientRegistry.registerKeyBinding(charactersheet);
	}
	
	@SubscribeEvent
	public void onKey(KeyInputEvent event) {
		Minecraft mc = Minecraft.getMinecraft();
		EntityPlayer player = mc.thePlayer;
		if (!mc.inGameHasFocus || (player == null)) return;
		if (charactersheet.isPressed()){
				Minecraft.getMinecraft().displayGuiScreen(new CharacterSheetGui());
		}
	}
	
}