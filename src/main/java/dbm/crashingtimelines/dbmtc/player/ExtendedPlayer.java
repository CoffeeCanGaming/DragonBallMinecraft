//class by CoffeeCanGaming for the server DragonBall:CrashingTimelines
package dbm.crashingtimelines.dbmtc.player;

import net.minecraft.entity.Entity;
//class by CoffeeCanGaming for the server DragonBall:CrashingTimelines
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.world.World;
import net.minecraftforge.common.IExtendedEntityProperties;

public class ExtendedPlayer implements IExtendedEntityProperties{
	public final static String Strength = "str";
	public final static String Dexterity = "dex";
	public final static String WillPower = "will";
	public final static String Constitution = "con";
	public final static String Wisdom = "wis";
	public final static String ZenkaiPoints = "Zp";
	public final static String Experience = "EXP";
	
	
	public final static String Energy = "Energy";
	
	private int currentEnergy = 0;
	private int maxEnergy = 0;
	private int str = 0;
	private int dex = 0;
	private int will = 0;
	private int con = 0;
	private int wis = 0;
	
	private int CurHP = 0;
	private int MaxHP = 0;
	
	private int race = 0;
	
	private int alignment = 0;
	
	
	
	public static EntityPlayer player;
	
	public ExtendedPlayer(EntityPlayer player)
	{
	
		this.player = player;
		this.currentEnergy = 0;
		this.maxEnergy = 100;
		this.race = 0;
		this.CurHP = 10;
		this.MaxHP = 100;
	}
	public static final void register(EntityPlayer player) {
		player.registerExtendedProperties(Energy, new ExtendedPlayer(player));
	}

	public static final ExtendedPlayer get(EntityPlayer player) {
		return (ExtendedPlayer) player.getExtendedProperties(Energy);

	}
	
	@Override
	public void saveNBTData(NBTTagCompound compound) {
		NBTTagCompound properties = new NBTTagCompound();
		properties.setInteger("currentEnergy", this.currentEnergy);
		properties.setInteger("MaxEnergy", this.maxEnergy);
		
		properties.setInteger("Race",this.race);
		
		properties.setInteger("CurrentHP", this.CurHP);
		properties.setInteger("MaxHP", this.MaxHP);
		
		compound.setTag(Energy, properties);
		
	}

	@Override
	public void loadNBTData(NBTTagCompound compound) {
		NBTTagCompound properties = (NBTTagCompound) compound.getTag(Energy);
		this.currentEnergy = properties.getInteger("currentEnergy");
		this.maxEnergy = properties.getInteger("maxEnergy");
		System.out.println("[EnergyProps] Energy from NBT: " + this.currentEnergy + "/" + this.maxEnergy);
		setCurrentEnergy(compound.getInteger("Energy"));
		
	}
	public void setCurrentEnergy(int currentEnergy) {
		if (currentEnergy < 0)
			currentEnergy = 0;
		if (currentEnergy > getMaxEnergy())
			currentEnergy = getMaxEnergy();
		this.currentEnergy = currentEnergy;
	}

	@Override
	public void init(Entity entity, World world) {
		
		
	}
	public void setMaxEnergy(int amount) {
		this.maxEnergy = (amount > 0 ? amount : 0);
		
	}
	public boolean consumeEnergy(int amount) {
		boolean sufficient = amount <= this.currentEnergy;
		this.currentEnergy -= (amount < this.currentEnergy ? amount : this.currentEnergy);
	   	return sufficient;
	}

	public boolean giveEnergy(int amount) {
		boolean sufficient = amount <= this.currentEnergy;
		this.currentEnergy += (amount);
		return sufficient;

	}

	public void replenishEnergy() {
		this.currentEnergy = this.maxEnergy;
	}

	public int getMaxEnergy() {
		return this.maxEnergy;
	}

	public int getCurrentEnergy() {
		int Current = this.currentEnergy;
		return (int) Current;
	}

}
