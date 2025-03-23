package de.nikjo.bottlements;

import de.nikjo.bottlements.entity.ModEntities;
import de.nikjo.bottlements.entity.custom.FireElementalEntity;
import de.nikjo.bottlements.item.ModItems;
import net.fabricmc.api.ModInitializer;

import net.fabricmc.fabric.api.object.builder.v1.entity.FabricDefaultAttributeRegistry;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Bottlements implements ModInitializer {
	public static final String MOD_ID = "bottlements";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {

		ModItems.registerModItems();
		ModEntities.registerModEntities();

		FabricDefaultAttributeRegistry.register(ModEntities.FIRE_ELEMENTAL, FireElementalEntity.createAttributes());


	}
}