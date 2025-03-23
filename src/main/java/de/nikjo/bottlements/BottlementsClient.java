package de.nikjo.bottlements;

import de.nikjo.bottlements.entity.ModEntities;
import de.nikjo.bottlements.entity.client.FireElementalModel;
import de.nikjo.bottlements.entity.client.FireElementalRenderer;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.client.rendering.v1.EntityModelLayerRegistry;
import net.fabricmc.fabric.api.client.rendering.v1.EntityRendererRegistry;

public class BottlementsClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        EntityModelLayerRegistry.registerModelLayer(FireElementalModel.FIRE_ELEMENTAL, FireElementalModel::getTexturedModelData);
        EntityRendererRegistry.register(ModEntities.FIRE_ELEMENTAL, FireElementalRenderer::new);
    }
}
