package net.msymbios.example.item;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;
import net.msymbios.example.TutorialMod;

public class ModItemGroup {

    // -- ItemGroups --
    public static final ItemGroup TANZANITE = FabricItemGroup.builder(
            new Identifier(TutorialMod.MODID, "tanzanite"))
            .icon(() -> new ItemStack(ModItems.TANZANITE))
            .entries((enabledFeatures, entries, operatorEnabled) -> {
                entries.add(ModItems.TANZANITE);
            }).build();

} // Class ModItemGroup
