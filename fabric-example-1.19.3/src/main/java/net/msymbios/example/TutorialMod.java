package net.msymbios.example;

import net.fabricmc.api.ModInitializer;
import net.msymbios.example.item.ModItems;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class TutorialMod implements ModInitializer {

	public static final String MODID = "tutorialmod";
	public static final Logger LOGGER = LoggerFactory.getLogger(MODID);

	@Override
	public void onInitialize() {
		ModItems.registerModItems();
	} // onInitialize ()

} // Class TutorialMod