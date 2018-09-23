package dbm.crashingtimelines.dbmtc;

import cpw.mods.fml.common.registry.GameRegistry;
import dbm.crashingtimelines.dbmtc.dbmitems.ItemAndroid17;
import dbm.crashingtimelines.dbmtc.dbmitems.ItemBasicclothes;
import dbm.crashingtimelines.dbmtc.dbmitems.ItemTienGi;
import dbm.crashingtimelines.dbmtc.dbmitems.ItemTimeBreakerMask;
import dbm.crashingtimelines.dbmtc.dbmitems.ItemYoungGohan;
import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemArmor;
import net.minecraftforge.common.util.EnumHelper;

public class ItemsBlocks {

	public static ToolMaterial DBMIron = EnumHelper.addToolMaterial("DBMIron", 0, 50000, 0.0F, 30.0F, 0);
	public static ItemArmor.ArmorMaterial DBMarmor = EnumHelper.addArmorMaterial("DBMarmor", 500000, new int[] { 2, 6, 4, 2 },0);
	
	public static Item Basicclothestorso;
	public static Item Basicclothespants;
	public static Item TienGitorso;
	public static Item TienGipants;
	public static Item TienGiboots;
	public static Item YoungGohantorso;
	public static Item YoungGohanpants;
	public static Item YoungGohanboots;
	public static Item Android17torso;
	public static Item Android17pants;
	public static Item Android17boots;
	public static Item TimeBreakerMask;
	
	public static void initItems() {
		
		Basicclothestorso = new ItemBasicclothes(DBMarmor,0,1).setUnlocalizedName("Basicclothestorso")
				.setTextureName("dbc:Basicclothestorso").setCreativeTab(DBMTCMain.DBMTab);
		GameRegistry.registerItem(Basicclothestorso, "Basicclothestorso");
		Basicclothespants = new ItemBasicclothes(DBMarmor,0,2).setUnlocalizedName("Basicclothespants")
				.setTextureName("dbc:Basicclothespants").setCreativeTab(DBMTCMain.DBMTab);
		GameRegistry.registerItem(Basicclothespants, "Basicclothespants");
		
		
		
		TienGitorso = new ItemTienGi(DBMarmor,0,1).setUnlocalizedName("TienGitorso")
				.setTextureName("dbc:TienGitorso").setCreativeTab(DBMTCMain.DBMTab);
		GameRegistry.registerItem(TienGitorso, "TeinGitorso");
		TienGipants = new ItemTienGi(DBMarmor,0,2).setUnlocalizedName("TienGipants")
				.setTextureName("dbc:TienGipants").setCreativeTab(DBMTCMain.DBMTab);
		GameRegistry.registerItem(TienGipants, "TienGipants");
		TienGiboots = new ItemTienGi(DBMarmor,0,3).setUnlocalizedName("TienGiboots")
				.setTextureName("dbc:TienGiboots").setCreativeTab(DBMTCMain.DBMTab);
		GameRegistry.registerItem(TienGiboots, "TienGiboots");
		
		YoungGohantorso = new ItemYoungGohan(DBMarmor,0,1).setUnlocalizedName("YoungGohantorso")
				.setTextureName("dbc:YoungGohantorso").setCreativeTab(DBMTCMain.DBMTab);
		GameRegistry.registerItem(YoungGohantorso, "YoungGohantorso");
		YoungGohanpants = new ItemYoungGohan(DBMarmor,0,2).setUnlocalizedName("YoungGohanpants")
				.setTextureName("dbc:YoungGohanpants").setCreativeTab(DBMTCMain.DBMTab);
		GameRegistry.registerItem(YoungGohanpants, "YoungGohanpants");
		YoungGohanboots = new ItemYoungGohan(DBMarmor,0,3).setUnlocalizedName("YoungGohanboots")
				.setTextureName("dbc:YoungGohanboots").setCreativeTab(DBMTCMain.DBMTab);
		GameRegistry.registerItem(YoungGohanboots, "YoungGohanboots");
		
		Android17torso = new ItemAndroid17(DBMarmor,0,1).setUnlocalizedName("Android17torso")
				.setTextureName("dbc:Android17torso").setCreativeTab(DBMTCMain.DBMTab);
		GameRegistry.registerItem(Android17torso, "Android17torso");
		Android17pants = new ItemAndroid17(DBMarmor,0,2).setUnlocalizedName("Android17pants")
				.setTextureName("dbc:Android17pants").setCreativeTab(DBMTCMain.DBMTab);
		GameRegistry.registerItem(Android17pants, "Android17pants");
		Android17boots = new ItemAndroid17(DBMarmor,0,3).setUnlocalizedName("Android17boots")
				.setTextureName("dbc:Android17boots").setCreativeTab(DBMTCMain.DBMTab);
		GameRegistry.registerItem(Android17boots, "Android17boots");
		
		TimeBreakerMask = new ItemTimeBreakerMask(DBMarmor,0,0).setUnlocalizedName("TimeBreakerMask")
				.setTextureName("dbc:TimeBreakerMask").setCreativeTab(DBMTCMain.DBMTab);
		GameRegistry.registerItem(TimeBreakerMask, "TimeBreakerMask");
		
		
	}
	public static void initBlocks() {
		
	}
}
