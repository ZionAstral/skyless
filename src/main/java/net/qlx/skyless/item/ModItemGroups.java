package net.qlx.skyless.item;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import net.qlx.skyless.Skyless;

public class ModItemGroups {
    public static final ItemGroup limitless_sky = Registry.register(
            Registries.ITEM_GROUP,
            Identifier.of(Skyless.MOD_ID, "limitless_sky"),
            FabricItemGroup.builder()
                    .icon(() -> new ItemStack(Items.NETHER_STAR))
                    .displayName(Text.translatable("itemgroup.skyless.limitless_sky"))
                    .entries((displayContext, entries) -> {
                        entries.add(ModItems.AngelFeather);
                        entries.add(ModItems.AngelWings);
                        entries.add(ModItems.HeartOfEvil);
                        entries.add(ModItems.DemonicHeart);
                        entries.add(ModItems.RealityCore);
                    })
                    .build()
    );

    public static void registerItemGroups() {
        Skyless.LOGGER.info("Registering Item Groups for " + Skyless.MOD_ID);
    }
}
