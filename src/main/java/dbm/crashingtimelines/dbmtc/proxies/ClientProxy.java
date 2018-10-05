//class by CoffeeCanGaming for the server DragonBall:CrashingTimelines
package dbm.crashingtimelines.dbmtc.proxies;

import org.lwjgl.input.Keyboard;

import cpw.mods.fml.client.registry.ClientRegistry;
import dbm.crashingtimelines.dbmtc.gui.Kibar;
import dbm.crashingtimelines.dbmtc.handlers.KeyBindingHandler;
import net.minecraft.client.Minecraft;
import net.minecraft.client.settings.KeyBinding;
import net.minecraftforge.common.MinecraftForge;

public class ClientProxy extends CommonProxy {

	int ModEntityID;
	private final Minecraft mc = Minecraft.getMinecraft();
	public static KeyBinding[] keyBindings;
	
	@Override
	public void registerRenders() {
		}

	public void registerEntities() {
}

	public void loadGUI() {
		MinecraftForge.EVENT_BUS.register(new Kibar(Minecraft.getMinecraft()));
	}
	public void initkeys(){
	
		// declare an array of key bindings
		keyBindings = new KeyBinding[1]; 
		  
		// instantiate the key bindings
		keyBindings[0] = new KeyBinding("DBMTC.CharaterSheet.desc", Keyboard.KEY_V, "DBMTC.CharaterSheet.category");
		  
		// register all the key bindings
		for (int i = 0; i < keyBindings.length; ++i) 
		{
		    ClientRegistry.registerKeyBinding(keyBindings[i]);
		}

	
	}
}

