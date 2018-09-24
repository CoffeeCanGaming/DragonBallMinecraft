package dbm.crashingtimelines.dbmtc;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Blocks;

import org.apache.logging.log4j.Logger;

import cpw.mods.fml.common.FMLLog;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import dbm.crashingtimelines.dbmtc.lib.Recipes;
import dbm.crashingtimelines.dbmtc.lib.References;
import dbm.crashingtimelines.dbmtc.util.TabDBM;


@Mod(modid = References.MODID, version = References.VERSION, name = References.MODNAME)
public class DBMTCMain
{
    
	public static Logger Log = FMLLog.getLogger();

	@cpw.mods.fml.common.Mod.Instance
	public static DBMTCMain Instance;

	public static CreativeTabs DBMTab = (new TabDBM(CreativeTabs.getNextID(), "TeaTab"));

	@EventHandler
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

	@EventHandler
	public void init(FMLInitializationEvent event) {
		Log.info("Init");
		//proxy.registerNetworkHandler();
	}

	@EventHandler
	public void postinit(FMLPostInitializationEvent event) {
		Log.info("PostInit");
	}
}
