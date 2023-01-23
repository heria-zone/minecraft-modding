package net.msymbios.example.entity.client;

import net.minecraft.client.render.RenderLayer;
import net.minecraft.client.render.VertexConsumerProvider;
import net.minecraft.client.render.entity.EntityRendererFactory;
import net.minecraft.util.Identifier;
import net.msymbios.example.TutorialMod;
import net.msymbios.example.entity.custom.ChomperEntity;
import software.bernie.geckolib.renderer.GeoEntityRenderer;
import javax.annotation.Nullable;

public class ChomperRenderer extends GeoEntityRenderer<ChomperEntity> {

    // -- Constructor --
    public ChomperRenderer(EntityRendererFactory.Context renderManager) {
        super(renderManager, new ChomperModel());
        this.shadowRadius = 0.4f;
    } // Constructor ChomperRenderer ()

    // -- Methods --
    @Override
    public Identifier getTextureLocation(ChomperEntity instance) {
        return new Identifier(TutorialMod.MODID, "textures/entity/chomper_texture.png");
    } // getTextureLocation ()

    @Override
    public RenderLayer getRenderType(ChomperEntity animatable, Identifier texture, @Nullable VertexConsumerProvider bufferSource, float partialTick) {
        return super.getRenderType(animatable, texture, bufferSource, partialTick);
    } // getRenderType ()

} // Class ChomperRenderer
