package de.nikjo.bottlements.entity.client;

import de.nikjo.bottlements.Bottlements;
import de.nikjo.bottlements.entity.custom.FireElementalEntity;
import net.minecraft.client.model.*;
import net.minecraft.client.render.VertexConsumer;
import net.minecraft.client.render.entity.model.EntityModelLayer;
import net.minecraft.client.render.entity.model.SinglePartEntityModel;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.util.Identifier;

public class FireElementalModel<T extends FireElementalEntity> extends SinglePartEntityModel<T> {
    public static final EntityModelLayer FIRE_ELEMENTAL = new EntityModelLayer(Identifier.of(Bottlements.MOD_ID, "fire_elemental"), "main");

    private final ModelPart all;

    public FireElementalModel(ModelPart root) {
        this.all = root.getChild("All");
    }
    public static TexturedModelData getTexturedModelData() {
        ModelData modelData = new ModelData();
        ModelPartData modelPartData = modelData.getRoot();
        ModelPartData All = modelPartData.addChild("All", ModelPartBuilder.create().uv(0, 0).cuboid(-1.5F, -2.0F, -1.5F, 3.0F, 4.0F, 3.0F, new Dilation(0.0F)), ModelTransform.pivot(0.5F, 19.0F, -0.5F));

        ModelPartData Crown = All.addChild("Crown", ModelPartBuilder.create().uv(0, 7).cuboid(-0.5F, 4.5F, -0.5F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F))
                .uv(12, 3).cuboid(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F))
                .uv(9, 0).cuboid(-2.5F, 0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F))
                .uv(0, 9).cuboid(-2.5F, 3.5F, -0.5F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F))
                .uv(7, 8).cuboid(1.5F, 3.5F, -0.5F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F))
                .uv(4, 7).cuboid(1.5F, 0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F)), ModelTransform.pivot(0.0F, -2.5F, 0.0F));

        ModelPartData Top = Crown.addChild("Top", ModelPartBuilder.create().uv(4, 11).cuboid(-0.5F, -0.5F, -2.5F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F))
                .uv(0, 11).cuboid(1.5F, -0.5F, -2.5F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F))
                .uv(10, 11).cuboid(1.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F))
                .uv(10, 7).cuboid(1.5F, -0.5F, 1.5F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F))
                .uv(4, 9).cuboid(-0.5F, -0.5F, 1.5F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F))
                .uv(7, 10).cuboid(-2.5F, -0.5F, 1.5F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F))
                .uv(12, 1).cuboid(-2.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F))
                .uv(10, 9).cuboid(-2.5F, -0.5F, -2.5F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F)), ModelTransform.pivot(0.0F, 0.0F, 0.0F));
        return TexturedModelData.of(modelData, 16, 16);
    }

    @Override
    public void setAngles(FireElementalEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
        this.getPart().traverse().forEach(ModelPart::resetTransform);

        this.updateAnimation(entity.idleAnimationState, FireElementalAnimations.FIRE_ELEMENTAL_IDLE, ageInTicks, 1f);
    }

    @Override
    public void render(MatrixStack matrices, VertexConsumer vertexConsumer, int light, int overlay, int color) {
        all.render(matrices, vertexConsumer, light, overlay, color);
    }

    @Override
    public ModelPart getPart() {
        return all;
    }
}
