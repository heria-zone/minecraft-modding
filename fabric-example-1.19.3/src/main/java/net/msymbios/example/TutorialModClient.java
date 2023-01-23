package net.msymbios.example;

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.client.rendering.v1.EntityRendererRegistry;
import net.msymbios.example.entity.ModEntities;
import net.msymbios.example.entity.client.ChomperRenderer;

public class TutorialModClient implements ClientModInitializer {

    @Override
    public void onInitializeClient() {
        EntityRendererRegistry.register(ModEntities.CHOMPER, ChomperRenderer::new);
    } // onInitializeClient

} // Class ExampleModClient