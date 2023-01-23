package net.msymbios.example;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.object.builder.v1.entity.FabricDefaultAttributeRegistry;
import net.msymbios.example.block.ModBlocks;
import net.msymbios.example.entity.ModEntities;
import net.msymbios.example.entity.custom.ChomperEntity;
import net.msymbios.example.item.ModItems;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import software.bernie.geckolib.GeckoLib;

public class TutorialMod implements ModInitializer {

	public static final String MODID = "tutorialmod";
	public static final Logger LOGGER = LoggerFactory.getLogger(MODID);

	@Override
	public void onInitialize() {
		ModItems.registerModItems();
		ModBlocks.registerModBlocks();

		GeckoLib.initialize();

		FabricDefaultAttributeRegistry.register(ModEntities.CHOMPER, ChomperEntity.setAttributes());

	} // onInitialize ()

} // Class TutorialMod