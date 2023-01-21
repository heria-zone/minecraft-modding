package net.msymbios.example.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.msymbios.example.TutorialMod;

public class ModItems {

    // -- Items --
    public static final Item RAW_TANZANITE = registerItem("raw_tanzanite",
            new Item(new FabricItemSettings()), ModItemGroup.TANZANITE);
    public static final Item TANZANITE = registerItem("tanzanite",
            new Item(new FabricItemSettings()), ModItemGroup.TANZANITE);

    // -- Methods --
    private static Item registerItem(String name, Item item, ItemGroup itemGroup) {
        ItemGroupEvents.modifyEntriesEvent(itemGroup).register(entries -> entries.add(item));
        return Registry.register(Registries.ITEM, new Identifier(TutorialMod.MODID, name), item);
    } // registerItem ()

    public static void registerModItems() {
        TutorialMod.LOGGER.debug(TutorialMod.MODID + ": Registering Items");
    } // registerModItems ()

} // Class ModItems
