package dev.dhyces.katuscarpets.data;

import dev.dhyces.katuscarpets.registry.ItemRegistry;
import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.*;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Items;
import net.minecraftforge.common.Tags;
import net.minecraftforge.registries.RegistryObject;

import java.util.function.Consumer;

public class KatusCarpetsRecipeProvider extends RecipeProvider {
    public KatusCarpetsRecipeProvider(PackOutput pOutput) {
        super(pOutput);
    }

    @Override
    protected void buildRecipes(Consumer<FinishedRecipe> pWriter) {
        fancyWool(pWriter, ItemRegistry.WHITE_FANCY_WOOL, Items.WHITE_WOOL);
        fancyWool(pWriter, ItemRegistry.ORANGE_FANCY_WOOL, Items.ORANGE_WOOL);
        fancyWool(pWriter, ItemRegistry.MAGENTA_FANCY_WOOL, Items.MAGENTA_WOOL);
        fancyWool(pWriter, ItemRegistry.LIGHT_BLUE_FANCY_WOOL, Items.LIGHT_BLUE_WOOL);
        fancyWool(pWriter, ItemRegistry.YELLOW_FANCY_WOOL, Items.YELLOW_WOOL);
        fancyWool(pWriter, ItemRegistry.LIME_FANCY_WOOL, Items.LIME_WOOL);
        fancyWool(pWriter, ItemRegistry.PINK_FANCY_WOOL, Items.PINK_WOOL);
        fancyWool(pWriter, ItemRegistry.GRAY_FANCY_WOOL, Items.GRAY_WOOL);
        fancyWool(pWriter, ItemRegistry.LIGHT_GRAY_FANCY_WOOL, Items.LIGHT_GRAY_WOOL);
        fancyWool(pWriter, ItemRegistry.CYAN_FANCY_WOOL, Items.CYAN_WOOL);
        fancyWool(pWriter, ItemRegistry.PURPLE_FANCY_WOOL, Items.PURPLE_WOOL);
        fancyWool(pWriter, ItemRegistry.BLUE_FANCY_WOOL, Items.BLUE_WOOL);
        fancyWool(pWriter, ItemRegistry.BROWN_FANCY_WOOL, Items.BROWN_WOOL);
        fancyWool(pWriter, ItemRegistry.GREEN_FANCY_WOOL, Items.GREEN_WOOL);
        fancyWool(pWriter, ItemRegistry.RED_FANCY_WOOL, Items.RED_WOOL);
        fancyWool(pWriter, ItemRegistry.BLACK_FANCY_WOOL, Items.BLACK_WOOL);

        fancyCarpet(pWriter, ItemRegistry.WHITE_FANCY_CARPET, ItemRegistry.WHITE_FANCY_WOOL, Items.WHITE_WOOL);
        fancyCarpet(pWriter, ItemRegistry.ORANGE_FANCY_CARPET, ItemRegistry.ORANGE_FANCY_WOOL, Items.ORANGE_WOOL);
        fancyCarpet(pWriter, ItemRegistry.MAGENTA_FANCY_CARPET, ItemRegistry.MAGENTA_FANCY_WOOL, Items.MAGENTA_WOOL);
        fancyCarpet(pWriter, ItemRegistry.LIGHT_BLUE_FANCY_CARPET, ItemRegistry.LIGHT_BLUE_FANCY_WOOL, Items.LIGHT_BLUE_WOOL);
        fancyCarpet(pWriter, ItemRegistry.YELLOW_FANCY_CARPET, ItemRegistry.YELLOW_FANCY_WOOL, Items.YELLOW_WOOL);
        fancyCarpet(pWriter, ItemRegistry.LIME_FANCY_CARPET, ItemRegistry.LIME_FANCY_WOOL, Items.LIME_WOOL);
        fancyCarpet(pWriter, ItemRegistry.PINK_FANCY_CARPET, ItemRegistry.PINK_FANCY_WOOL, Items.PINK_WOOL);
        fancyCarpet(pWriter, ItemRegistry.GRAY_FANCY_CARPET, ItemRegistry.GRAY_FANCY_WOOL, Items.GRAY_WOOL);
        fancyCarpet(pWriter, ItemRegistry.LIGHT_GRAY_FANCY_CARPET, ItemRegistry.LIGHT_GRAY_FANCY_WOOL, Items.LIGHT_GRAY_WOOL);
        fancyCarpet(pWriter, ItemRegistry.CYAN_FANCY_CARPET, ItemRegistry.CYAN_FANCY_WOOL, Items.CYAN_WOOL);
        fancyCarpet(pWriter, ItemRegistry.PURPLE_FANCY_CARPET, ItemRegistry.PURPLE_FANCY_WOOL, Items.PURPLE_WOOL);
        fancyCarpet(pWriter, ItemRegistry.BLUE_FANCY_CARPET, ItemRegistry.BLUE_FANCY_WOOL, Items.BLUE_WOOL);
        fancyCarpet(pWriter, ItemRegistry.BROWN_FANCY_CARPET, ItemRegistry.BROWN_FANCY_WOOL, Items.BROWN_WOOL);
        fancyCarpet(pWriter, ItemRegistry.GREEN_FANCY_CARPET, ItemRegistry.GREEN_FANCY_WOOL, Items.GREEN_WOOL);
        fancyCarpet(pWriter, ItemRegistry.RED_FANCY_CARPET, ItemRegistry.RED_FANCY_WOOL, Items.RED_WOOL);
        fancyCarpet(pWriter, ItemRegistry.BLACK_FANCY_CARPET, ItemRegistry.BLACK_FANCY_WOOL, Items.BLACK_WOOL);
    }

    private void fancyWool(Consumer<FinishedRecipe> writer, RegistryObject<Item> result, Item woolBlock) {
        ShapelessRecipeBuilder.shapeless(RecipeCategory.BUILDING_BLOCKS, result.get())
                .requires(woolBlock)
                .requires(Tags.Items.STRING)
                .group("fancy_wool")
                .unlockedBy(getHasName(woolBlock), has(woolBlock))
                .save(writer, result.getId());
    }

    private void fancyCarpet(Consumer<FinishedRecipe> writer, RegistryObject<Item> result, RegistryObject<Item> fancyWool, Item woolBlock) {
        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, result.get(), 3)
                .pattern("WW")
                .define('W', fancyWool.get())
                .group("fancy_carpet")
                .showNotification(false)
                .unlockedBy(getHasName(woolBlock), has(woolBlock))
                .save(writer, result.getId());
    }
}
