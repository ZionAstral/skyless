package net.qlx.skyless.item;

import net.minecraft.item.Item;
import net.minecraft.item.Items;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.qlx.skyless.Skyless;

public class ModItems {
    public static final Item RealityCore = registerItem("reality_core", new Item(new Item.Settings()));

    public static final Item AngelFeather = registerItem("angel_feather", new Item(new Item.Settings()));
    public static final Item AngelWings = registerItem("angel_wings", new Item(new Item.Settings()));

    public static final Item HeartOfEvil = registerItem("heart_of_evil", new Item(new Item.Settings()));
    public static final Item DemonicHeart = registerItem("demonic_heart", new Item(new Item.Settings()));

    private static Item registerItem(String name, Item item) {
            return Registry.register(Registries.ITEM, Identifier.of(Skyless.MOD_ID, name), item);
    }

    public static void registerModItems() {
        Skyless.LOGGER.info("Registering Mod Items for " + Skyless.MOD_ID);
    }
}
