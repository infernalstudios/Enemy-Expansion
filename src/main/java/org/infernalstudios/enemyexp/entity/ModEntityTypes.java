package org.infernalstudios.enemyexp.entity;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.MobCategory;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import org.infernalstudios.enemyexp.EnemyExpansion;
import org.infernalstudios.enemyexp.entity.custom.SluggerEntity;

public class ModEntityTypes {
    public static final DeferredRegister<EntityType<?>> ENTITY_TYPES =
            DeferredRegister.create(ForgeRegistries.ENTITIES, EnemyExpansion.MOD_ID);

    public static final RegistryObject<EntityType<SluggerEntity>> SLUGGER =
            ENTITY_TYPES.register("slugger",
                    () -> EntityType.Builder.of(SluggerEntity::new, MobCategory.MONSTER)
                            .sized(1f, 2f)
                            .build(new ResourceLocation(EnemyExpansion.MOD_ID, "slugger").toString()));

    public static void register(IEventBus eventbus) {
        ENTITY_TYPES.register(eventbus);
    }
}
