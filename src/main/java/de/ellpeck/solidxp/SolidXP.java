package de.ellpeck.solidxp;

import de.ellpeck.solidxp.solidifier.BlockXPSolidifier;
import de.ellpeck.solidxp.solidifier.TileEntityXPSolidifier;
import de.ellpeck.solidxp.util.GuiHandler;
import net.minecraft.block.Block;
import net.minecraft.tileentity.TileEntity;
import net.minecraftforge.common.config.Configuration;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.network.NetworkRegistry;

@Mod(modid = SolidXP.MOD_ID, name = SolidXP.NAME, version = SolidXP.VERSION)
public class SolidXP{

    public static final String MOD_ID = "sxptmtm";
    public static final String NAME = "Solidified Experience: The Movie: The Mod";
    public static final String VERSION = "@VERSION@";

    public static Block blockXPSolidifier;

    @EventHandler
    public void preInit(FMLPreInitializationEvent event){
        Configuration config = new Configuration(event.getSuggestedConfigurationFile());
        config.load();


        if(config.hasChanged()){
            config.save();
        }

        blockXPSolidifier = new BlockXPSolidifier();
        TileEntity.register(MOD_ID+":xp_solidifier", TileEntityXPSolidifier.class);

        NetworkRegistry.INSTANCE.registerGuiHandler(MOD_ID, new GuiHandler());
    }
}
