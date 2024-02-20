package dev.dhyces.katuscarpets.client.data;

import dev.dhyces.katuscarpets.KatusCarpets;
import dev.dhyces.katuscarpets.registry.ItemRegistry;
import net.minecraft.data.PackOutput;
import net.minecraft.world.item.Item;
import net.minecraftforge.client.model.generators.ItemModelProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.registries.RegistryObject;

public class KatusCarpetsItemModelProvider extends ItemModelProvider {
    public KatusCarpetsItemModelProvider(PackOutput output, ExistingFileHelper existingFileHelper) {
        super(output, KatusCarpets.MODID, existingFileHelper);
    }

    @Override
    protected void registerModels() {
        simpleParented(ItemRegistry.WHITE_FANCY_WOOL);
        simpleParented(ItemRegistry.ORANGE_FANCY_WOOL);
        simpleParented(ItemRegistry.MAGENTA_FANCY_WOOL);
        simpleParented(ItemRegistry.LIGHT_BLUE_FANCY_WOOL);
        simpleParented(ItemRegistry.YELLOW_FANCY_WOOL);
        simpleParented(ItemRegistry.LIME_FANCY_WOOL);
        simpleParented(ItemRegistry.PINK_FANCY_WOOL);
        simpleParented(ItemRegistry.GRAY_FANCY_WOOL);
        simpleParented(ItemRegistry.LIGHT_GRAY_FANCY_WOOL);
        simpleParented(ItemRegistry.CYAN_FANCY_WOOL);
        simpleParented(ItemRegistry.PURPLE_FANCY_WOOL);
        simpleParented(ItemRegistry.BLUE_FANCY_WOOL);
        simpleParented(ItemRegistry.BROWN_FANCY_WOOL);
        simpleParented(ItemRegistry.GREEN_FANCY_WOOL);
        simpleParented(ItemRegistry.RED_FANCY_WOOL);
        simpleParented(ItemRegistry.BLACK_FANCY_WOOL);

        simpleParented(ItemRegistry.WHITE_FANCY_CARPET);
        simpleParented(ItemRegistry.ORANGE_FANCY_CARPET);
        simpleParented(ItemRegistry.MAGENTA_FANCY_CARPET);
        simpleParented(ItemRegistry.LIGHT_BLUE_FANCY_CARPET);
        simpleParented(ItemRegistry.YELLOW_FANCY_CARPET);
        simpleParented(ItemRegistry.LIME_FANCY_CARPET);
        simpleParented(ItemRegistry.PINK_FANCY_CARPET);
        simpleParented(ItemRegistry.GRAY_FANCY_CARPET);
        simpleParented(ItemRegistry.LIGHT_GRAY_FANCY_CARPET);
        simpleParented(ItemRegistry.CYAN_FANCY_CARPET);
        simpleParented(ItemRegistry.PURPLE_FANCY_CARPET);
        simpleParented(ItemRegistry.BLUE_FANCY_CARPET);
        simpleParented(ItemRegistry.BROWN_FANCY_CARPET);
        simpleParented(ItemRegistry.GREEN_FANCY_CARPET);
        simpleParented(ItemRegistry.RED_FANCY_CARPET);
        simpleParented(ItemRegistry.BLACK_FANCY_CARPET);
    }

    private void simpleParented(RegistryObject<Item> item) {
        withExistingParent(item.getId().toString(), item.getId().withPrefix("block/"));
    }
}
