package dev.dhyces.katuscarpets;

import dev.dhyces.katuscarpets.registry.BlockRegistry;
import dev.dhyces.katuscarpets.registry.ItemRegistry;
import net.minecraft.resources.ResourceLocation;
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

        if (FMLLoader.getDist().isClient()) {
            KatusCarpetsClient.init(modBus);
        }
    }
}
