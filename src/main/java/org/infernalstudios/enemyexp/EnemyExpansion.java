package org.infernalstudios.enemyexp;

import com.mojang.logging.LogUtils;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.infernalstudios.enemyexp.entity.ModEntityTypes;
import org.slf4j.Logger;

// The value here should match an entry in the META-INF/mods.toml file
@Mod(EnemyExpansion.MOD_ID)
public class EnemyExpansion
{
    public static final String MOD_ID = "enemyexp";

    private static final Logger LOGGER = LogUtils.getLogger();

    public EnemyExpansion()
    {
        IEventBus eventbus = FMLJavaModLoadingContext.get().getModEventBus();
        ModEntityTypes.register(eventbus);

        // Register ourselves for server and other game events we are interested in
        MinecraftForge.EVENT_BUS.register(this);
    }

    private void setup(final FMLCommonSetupEvent event)
    {

    }
}