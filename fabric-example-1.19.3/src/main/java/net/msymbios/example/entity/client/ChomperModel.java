package net.msymbios.example.entity.client;

import net.minecraft.util.Identifier;
import net.msymbios.example.TutorialMod;
import net.msymbios.example.entity.custom.ChomperEntity;
import software.bernie.geckolib.model.GeoModel;

public class ChomperModel extends GeoModel<ChomperEntity> {

    // -- Methods --
    @Override
    public Identifier getModelResource(ChomperEntity animatable) {
        return new Identifier(TutorialMod.MODID, "geo/chomper.geo.json");
    } // getModelResource ()

    @Override
    public Identifier getTextureResource(ChomperEntity animatable) {
        return new Identifier(TutorialMod.MODID, "textures/entity/chomper_texture.png");
    } // getTextureResource ()

    @Override
    public Identifier getAnimationResource(ChomperEntity animatable) {
        return new Identifier(TutorialMod.MODID, "animations/chomper.animation.json");
    } // getAnimationResource ()

} // Class ChomperModel
