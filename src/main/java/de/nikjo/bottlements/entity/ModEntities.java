package de.nikjo.bottlements.entity;

import de.nikjo.bottlements.Bottlements;
import de.nikjo.bottlements.entity.custom.FireElementalEntity;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.SpawnGroup;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModEntities {
    public static final EntityType<FireElementalEntity> FIRE_ELEMENTAL = Registry.register(Registries.ENTITY_TYPE,
            Identifier.of(Bottlements.MOD_ID, "fire_elemental"),
            EntityType.Builder.create(FireElementalEntity::new, SpawnGroup.CREATURE)
                    .dimensions(0.5f, 0.5f).build());


    public static void registerModEntities() {
        Bottlements.LOGGER.info("Registering Mod Entities for " + Bottlements.MOD_ID);
    }
}
