package dev.dhyces.katuscarpets;

import dev.dhyces.katuscarpets.registry.ItemRegistry;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.Items;
import net.minecraftforge.event.BuildCreativeModeTabContentsEvent;
import net.minecraftforge.eventbus.api.IEventBus;

public class KatusCarpetsClient {
    static void init(IEventBus modBus) {
        modBus.addListener(KatusCarpetsClient::addToCreativeTabs);
    }

    private static void addToCreativeTabs(BuildCreativeModeTabContentsEvent event) {
        if (event.getTabKey() == CreativeModeTabs.COLORED_BLOCKS) {
            event.accept(ItemRegistry.WHITE_FANCY_WOOL);
            event.accept(ItemRegistry.LIGHT_GRAY_FANCY_WOOL);
            event.accept(ItemRegistry.GRAY_FANCY_WOOL);
            event.accept(ItemRegistry.BLACK_FANCY_WOOL);
            event.accept(ItemRegistry.BROWN_FANCY_WOOL);
            event.accept(ItemRegistry.RED_FANCY_WOOL);
            event.accept(ItemRegistry.ORANGE_FANCY_WOOL);
            event.accept(ItemRegistry.YELLOW_FANCY_WOOL);
            event.accept(ItemRegistry.LIME_FANCY_WOOL);
            event.accept(ItemRegistry.GREEN_FANCY_WOOL);
            event.accept(ItemRegistry.CYAN_FANCY_WOOL);
            event.accept(ItemRegistry.LIGHT_BLUE_FANCY_WOOL);
            event.accept(ItemRegistry.BLUE_FANCY_WOOL);
            event.accept(ItemRegistry.PURPLE_FANCY_WOOL);
            event.accept(ItemRegistry.MAGENTA_FANCY_WOOL);
            event.accept(ItemRegistry.PINK_FANCY_WOOL);

            event.accept(ItemRegistry.WHITE_FANCY_CARPET);
            event.accept(ItemRegistry.LIGHT_GRAY_FANCY_CARPET);
            event.accept(ItemRegistry.GRAY_FANCY_CARPET);
            event.accept(ItemRegistry.BLACK_FANCY_CARPET);
            event.accept(ItemRegistry.BROWN_FANCY_CARPET);
            event.accept(ItemRegistry.RED_FANCY_CARPET);
            event.accept(ItemRegistry.ORANGE_FANCY_CARPET);
            event.accept(ItemRegistry.YELLOW_FANCY_CARPET);
            event.accept(ItemRegistry.LIME_FANCY_CARPET);
            event.accept(ItemRegistry.GREEN_FANCY_CARPET);
            event.accept(ItemRegistry.CYAN_FANCY_CARPET);
            event.accept(ItemRegistry.LIGHT_BLUE_FANCY_CARPET);
            event.accept(ItemRegistry.BLUE_FANCY_CARPET);
            event.accept(ItemRegistry.PURPLE_FANCY_CARPET);
            event.accept(ItemRegistry.MAGENTA_FANCY_CARPET);
            event.accept(ItemRegistry.PINK_FANCY_CARPET);
        }
    }
}
