package net.msymbios.example.entity;

import net.fabricmc.fabric.api.object.builder.v1.entity.FabricEntityTypeBuilder;
import net.minecraft.entity.EntityDimensions;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.SpawnGroup;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.msymbios.example.TutorialMod;
import net.msymbios.example.entity.custom.ChomperEntity;

public class ModEntities {

    // -- Variables --
    public static final EntityType<ChomperEntity> CHOMPER = Registry.register(Registries.ENTITY_TYPE, new Identifier(TutorialMod.MODID, "chomper"),
            FabricEntityTypeBuilder.create(SpawnGroup.MONSTER, ChomperEntity::new).dimensions(EntityDimensions.fixed(0.4f, 1.5f)).build());

} // Class ModEntities