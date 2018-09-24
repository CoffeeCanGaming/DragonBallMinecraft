package dbm.crashingtimelines.dbmtc.gui;
import org.lwjgl.opengl.GL11;

import cpw.mods.fml.common.eventhandler.EventPriority;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import dbm.crashingtimelines.dbmtc.lib.References;
import dbm.crashingtimelines.dbmtc.player.ExtendedPlayer;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.FontRenderer;
import net.minecraft.client.gui.Gui;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.event.RenderGameOverlayEvent;
import net.minecraftforge.client.event.RenderGameOverlayEvent.ElementType;
import net.minecraft.client.gui.ScaledResolution;

@SideOnly(Side.CLIENT)
public class Kibar extends Gui {
	private Minecraft mc;

	private static final ResourceLocation texture = new ResourceLocation(References.MODID,"textures/gui/KiBar.png");

	public Kibar(Minecraft mc) {
		super();
		this.mc = mc;

	}

	@SubscribeEvent
	public void onRenderExperienceBar(RenderGameOverlayEvent event) {
		

		if (event.isCancelable() || event.type != ElementType.EXPERIENCE) {
			return;
		}

		ExtendedPlayer props = (ExtendedPlayer) this.mc.thePlayer.getExtendedProperties(ExtendedPlayer.Energy);

		if (props == null || props.getMaxEnergy() == 0) {
			return;
		}
		ScaledResolution scale = new ScaledResolution(mc, mc.displayWidth, mc.displayHeight);
			int width = scale.getScaledWidth();
			int height = scale.getScaledHeight();
			
			int W = width - 171;
			int H = height - 125;
			
			this.mc.getTextureManager().bindTexture(texture);
			
			
			GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
			GL11.glDisable(GL11.GL_LIGHTING);
			{
				short w = 0;
				int Energy = (int) (props.getCurrentEnergy() * (float) (w + 1));
				int var1 = 0 - Energy;
				int CurrentEnergy = W - Energy;
				this.drawTexturedModalRect(0, 0, 0, 0, var1, H );
				this.drawTexturedModalRect(0, 0, 0, 16, W , H);
				String s = "Ki " + props.getCurrentEnergy() + "/" + props.getMaxEnergy();
				W += 10;
				this.mc.fontRenderer.drawString(s, W + 1, H, 0);
				this.mc.fontRenderer.drawString(s, W - 1, H, 0);
				this.mc.fontRenderer.drawString(s, W, H + 1, 0);
				this.mc.fontRenderer.drawString(s, W, H - 1, 0);
				this.mc.fontRenderer.drawString(s, W, H, 8453920);
				

		}
	}
}
