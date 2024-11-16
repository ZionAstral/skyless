package net.qlx.skyless.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.data.server.recipe.RecipeExporter;
import net.minecraft.data.server.recipe.ShapedRecipeJsonBuilder;
import net.minecraft.item.Items;
import net.minecraft.recipe.book.RecipeCategory;
import net.minecraft.registry.RegistryWrapper;
import net.qlx.skyless.item.ModItems;

import java.util.concurrent.CompletableFuture;

public class ModRecipeProvider extends FabricRecipeProvider {
    public ModRecipeProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
        super(output, registriesFuture);
    }

    @Override
    public void generate(RecipeExporter recipeExporter) {
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.RealityCore)
                .pattern("121")
                .pattern("232")
                .pattern("121")
                .input('1', Items.NETHERITE_BLOCK)
                .input('2', Items.WITHER_SKELETON_SKULL)
                .input('3', Items.NETHER_STAR)
                .criterion(hasItem(Items.NETHER_STAR), conditionsFromItem(Items.NETHER_STAR))
                .offerTo(recipeExporter, "reality_core_crafting");

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.AngelFeather)
                .pattern("121")
                .pattern("364")
                .pattern("151")
                .input('1', Items.FEATHER)
                .input('2', Items.LEATHER_HELMET)
                .input('3', Items.LEATHER_CHESTPLATE)
                .input('4', Items.LEATHER_LEGGINGS)
                .input('5', Items.LEATHER_BOOTS)
                .input('6', ModItems.RealityCore)
                .criterion(hasItem(ModItems.RealityCore), conditionsFromItem(ModItems.RealityCore))
                .offerTo(recipeExporter, "angel_feather_crafting");

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.AngelWings)
                .pattern("121")
                .pattern("232")
                .pattern("121")
                .input('1', Items.FEATHER)
                .input('2', ModItems.AngelFeather)
                .input('3', ModItems.RealityCore)
                .criterion(hasItem(ModItems.AngelFeather), conditionsFromItem(ModItems.AngelFeather))
                .offerTo(recipeExporter, "angel_wings_crafting");

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.HeartOfEvil)
                .pattern("121")
                .pattern("232")
                .pattern("121")
                .input('1', Items.NETHERRACK)
                .input('2', Items.NETHERITE_INGOT)
                .input('3', ModItems.RealityCore)
                .criterion(hasItem(ModItems.RealityCore), conditionsFromItem(ModItems.RealityCore))
                .offerTo(recipeExporter, "heart_of_evil_crafting");

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.DemonicHeart)
                .pattern("152")
                .pattern("565")
                .pattern("354")
                .input('1', Items.DRAGON_HEAD)
                .input('2', Items.PIGLIN_HEAD)
                .input('3', Items.WITHER_SKELETON_SKULL)
                .input('4', Items.ZOMBIE_HEAD)
                .input('5', ModItems.HeartOfEvil)
                .input('6', ModItems.RealityCore)
                .criterion(hasItem(ModItems.HeartOfEvil), conditionsFromItem(ModItems.HeartOfEvil))
                .offerTo(recipeExporter, "demonic_heart_crafting");
    }
}
