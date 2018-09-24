package dbm.crashingtimelines.dbmtc.gui;

import dbm.crashingtimelines.dbmtc.lib.References;
import dbm.crashingtimelines.dbmtc.player.ExtendedPlayer;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.GuiButton;
import net.minecraft.client.gui.GuiScreen;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.ResourceLocation;

public class CharacterSheetGui  extends GuiScreen{
	
	ExtendedPlayer props = ExtendedPlayer.get(ExtendedPlayer.player);
	
	int guiWidth = 320;
	int guiHeight = 128;
	
	GuiButton Strength;
	
	
	
	@Override
	public void drawScreen(int x, int y, float ticks) {
		int guiX = (width -guiWidth) ;
		int guiY = (height - guiHeight);
		mc.renderEngine.bindTexture(new ResourceLocation(References.MODID,"textures/gui/guiconcept.png"));
		drawTexturedModalRect(guiX, guiY, 0, 0, guiWidth, guiHeight);
		super.drawScreen(x, y, ticks);
		//fontRendererObj.drawString("Zakar!", guiX + 32, guiY + 40, 0xFFFFFF);
	}
	@Override
	public void initGui() {
		int guiX = (width -guiWidth) ;
		int guiY = (height - guiHeight);
		buttonList.clear();
		buttonList.add(Strength = new GuiButton(0,guiX + 32,guiY + 25,70,20, "Strength"));
		super.initGui();
		
	}
	@Override
	protected void actionPerformed(GuiButton Zakar) {
		
			
			
		
		
		EntityPlayer player = Minecraft.getMinecraft().thePlayer;
		super.actionPerformed(Zakar);
		
		
		
		
			
	
	}
		

	
	
	@Override
	public boolean doesGuiPauseGame() {
		return false;
	}
}