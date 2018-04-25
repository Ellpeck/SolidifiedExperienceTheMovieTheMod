package de.ellpeck.solidxp.solidifier;

import net.minecraft.client.gui.inventory.GuiContainer;
import net.minecraft.entity.player.EntityPlayer;

public class GuiXPSolidifier extends GuiContainer{

    private final TileEntityXPSolidifier tile;

    public GuiXPSolidifier(EntityPlayer player, TileEntityXPSolidifier tile){
        super(new ContainerXPSolidifier(player, tile));
        this.tile = tile;
    }

    @Override
    protected void drawGuiContainerBackgroundLayer(float partialTicks, int mouseX, int mouseY){

    }

    @Override
    public void drawScreen(int mouseX, int mouseY, float partialTicks){
        this.drawDefaultBackground();
        super.drawScreen(mouseX, mouseY, partialTicks);
        this.renderHoveredToolTip(mouseX, mouseY);
    }
}
