package dbm.crashingtimelines.dbmtc.proxies;

import dbm.crashingtimelines.dbmtc.gui.Kibar;
import net.minecraft.client.Minecraft;
import net.minecraftforge.common.MinecraftForge;

public class ClientProxy extends CommonProxy {

	int ModEntityID;
	private final Minecraft mc = Minecraft.getMinecraft();
	
	@Override
	public void registerRenders() {
		}

	public void registerEntities() {
}

	public void loadGUI() {
		MinecraftForge.EVENT_BUS.register(new Kibar(Minecraft.getMinecraft()));
	}
}

