//class by CoffeeCanGaming for the server DragonBall:CrashingTimelines
package dbm.crashingtimelines.dbmtc;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Blocks;
import net.minecraftforge.common.MinecraftForge;

import org.apache.logging.log4j.Logger;

import cpw.mods.fml.common.FMLLog;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import dbm.crashingtimelines.dbmtc.handlers.EventHandler;
import dbm.crashingtimelines.dbmtc.lib.Recipes;
import dbm.crashingtimelines.dbmtc.lib.References;
import dbm.crashingtimelines.dbmtc.proxies.ClientProxy;
import dbm.crashingtimelines.dbmtc.proxies.CommonProxy;
import dbm.crashingtimelines.dbmtc.util.TabDBM;



@Mod(modid = References.MODID, version = References.VERSION, name = References.MODNAME)
public class DBMTCMain
{
	@SidedProxy(clientSide = "dbm.crashingtimelines.dbmtc.proxies.ClientProxy", serverSide = "dbm.crashingtimelines.dbmtc.proxies.CommonProxy")
	public static CommonProxy proxy;
	public static ClientProxy cproxy;
    
	public static Logger Log = FMLLog.getLogger();

	@cpw.mods.fml.common.Mod.Instance
	public static DBMTCMain Instance;

	public static CreativeTabs DBMTab = (new TabDBM(CreativeTabs.getNextID(), "DBMTab"));

	@Mod.EventHandler
	public void preinit(FMLPreInitializationEvent event) {
		Log.info("PreInit");
		ItemsBlocks.initBlocks();
		ItemsBlocks.initItems();
		proxy.registerRenders();
		proxy.registerEntities();
		//proxy.registerTileEntities();
		Recipes.initShapedRecipes();
		Recipes.initShapelessRecipes();
		Recipes.initSmeltingRecipes();
		
		

	}

	@Mod.EventHandler
	public void init(FMLInitializationEvent event) {
		Log.info("Init");
		proxy.registerRenders();
		cproxy.initkeys();
		MinecraftForge.EVENT_BUS.register(new EventHandler());
	}

	@Mod.EventHandler
	public void postinit(FMLPostInitializationEvent event) {
		Log.info("PostInit");
		proxy.loadGUI();
	}
}
