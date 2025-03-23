package de.nikjo.bottlements.item;

import de.nikjo.bottlements.Bottlements;
import de.nikjo.bottlements.entity.ModEntities;
import de.nikjo.bottlements.item.custom.SunBottleItem;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.item.SpawnEggItem;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {
    public static final Item SUN_BOTTLE = registerItem("sun_bottle", new SunBottleItem(new Item.Settings()));

    public static final Item FIRE_ELEMENTAL_SPAWN_EGG = registerItem("fire_elemental_spawn_egg", new SpawnEggItem(ModEntities.FIRE_ELEMENTAL, 0x2521113, 0x252323, new Item.Settings()));

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, Identifier.of(Bottlements.MOD_ID, name), item);
    }

    public static void registerModItems() {
        Bottlements.LOGGER.info("Registering Mod Items for " + Bottlements.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.FOOD_AND_DRINK).register(entries -> {
            entries.add(SUN_BOTTLE);
        });

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.SPAWN_EGGS).register(entries -> {
            entries.add(FIRE_ELEMENTAL_SPAWN_EGG);
        });
    }

}
