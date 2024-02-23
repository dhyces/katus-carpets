package dev.dhyces.katuscarpets;

import dev.dhyces.katuscarpets.registry.BlockRegistry;
import dev.dhyces.katuscarpets.registry.ItemRegistry;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraftforge.event.BuildCreativeModeTabContentsEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.fml.loading.FMLLoader;

@Mod(KatusCarpets.MODID)
public class KatusCarpets {
    public static final String MODID = "katuscarpets";
    public static ResourceLocation id(String id) {
        return new ResourceLocation(MODID, id);
    }

    public KatusCarpets() {
        IEventBus modBus = FMLJavaModLoadingContext.get().getModEventBus();

        BlockRegistry.REGISTER.register(modBus);
        ItemRegistry.REGISTER.register(modBus);

        modBus.addListener(this::addToCreativeTabs);
    }

    private void addToCreativeTabs(BuildCreativeModeTabContentsEvent event) {
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
            event.accept(ItemRegistry.PLANT_POT_WOOL);

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
            event.accept(ItemRegistry.PLANT_POT_CARPET);
        }
    }
}
