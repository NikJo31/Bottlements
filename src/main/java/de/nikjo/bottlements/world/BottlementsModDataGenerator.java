package de.nikjo.bottlements.world;

import net.fabricmc.fabric.api.datagen.v1.DataGeneratorEntrypoint;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;
import net.minecraft.data.DataGenerator;

public class BottlementsModDataGenerator implements DataGeneratorEntrypoint {

    @Override
    public void onInitializeDataGenerator(FabricDataGenerator fabricDataGenerator) {
        DataGenerator.Pack pack = fabricDataGenerator.createPack();

//        pack.addProvider(ModModelProvider);
    }
}
