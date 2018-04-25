package de.ellpeck.solidxp.solidifier;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.Container;
import net.minecraft.util.math.BlockPos;

public class ContainerXPSolidifier extends Container{

    private final TileEntityXPSolidifier tile;

    public ContainerXPSolidifier(EntityPlayer player, TileEntityXPSolidifier tile){
        this.tile = tile;
    }

    @Override
    public boolean canInteractWith(EntityPlayer player){
        BlockPos pos = this.tile.getPos();
        return player.getDistanceSq(pos.getX()+0.5D, pos.getY()+0.5D, pos.getZ()+0.5D) <= 64.0D;
    }
}
