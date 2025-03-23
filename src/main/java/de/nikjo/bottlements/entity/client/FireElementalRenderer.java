package de.nikjo.bottlements.entity.client;


import de.nikjo.bottlements.Bottlements;
import de.nikjo.bottlements.entity.custom.FireElementalEntity;
import net.minecraft.client.render.VertexConsumerProvider;
import net.minecraft.client.render.entity.EntityRendererFactory;
import net.minecraft.client.render.entity.MobEntityRenderer;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.util.Identifier;

public class FireElementalRenderer extends MobEntityRenderer<FireElementalEntity, FireElementalModel<FireElementalEntity>> {

    public FireElementalRenderer(EntityRendererFactory.Context context) {
        super(context, new FireElementalModel<>(context.getPart(FireElementalModel.FIRE_ELEMENTAL)), 0.75f);
    }

    @Override
    public Identifier getTexture(FireElementalEntity entity) {
        return Identifier.of(Bottlements.MOD_ID, "textures/entity/fire_elemental/fire_elemental.png");
    }

    @Override
    public void render(FireElementalEntity livingEntity, float f, float g, MatrixStack matrixStack, VertexConsumerProvider vertexConsumerProvider, int i) {

        if(livingEntity.isBaby()) {
            matrixStack.scale(0.2f, 0.2f, 0.2f);
        }else {
            matrixStack.scale(1f, 1f, 1f);
        }

        super.render(livingEntity, f, g, matrixStack, vertexConsumerProvider, i);
    }
}


