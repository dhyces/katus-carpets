package dev.dhyces.katuscarpets;

import dev.dhyces.katuscarpets.client.data.KatusCarpetsBlockStateProvider;
import dev.dhyces.katuscarpets.client.data.KatusCarpetsItemModelProvider;
import dev.dhyces.katuscarpets.client.data.KatusCarpetsEnUsLanguageProvider;
import dev.dhyces.katuscarpets.data.KatusCarpetsBlockLootTableSubProvider;
import dev.dhyces.katuscarpets.data.KatusCarpetsBlockTagProvider;
import dev.dhyces.katuscarpets.data.KatusCarpetsItemTagProvider;
import dev.dhyces.katuscarpets.data.KatusCarpetsRecipeProvider;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.PackOutput;
import net.minecraft.data.loot.LootTableProvider;
import net.minecraft.world.level.storage.loot.parameters.LootContextParamSets;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.data.event.GatherDataEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

import java.util.List;
import java.util.Set;
import java.util.concurrent.CompletableFuture;

@Mod.EventBusSubscriber(modid = KatusCarpets.MODID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class Datagen {
    @SubscribeEvent
    static void gatherData(GatherDataEvent event) {
        DataGenerator generator = event.getGenerator();
        PackOutput output = generator.getPackOutput();
        CompletableFuture<HolderLookup.Provider> lookupProvider = event.getLookupProvider();
        ExistingFileHelper fileHelper = event.getExistingFileHelper();

        generator.addProvider(event.includeClient(), new KatusCarpetsBlockStateProvider(output, fileHelper));
        generator.addProvider(event.includeClient(), new KatusCarpetsItemModelProvider(output, fileHelper));
        generator.addProvider(event.includeClient(), new KatusCarpetsEnUsLanguageProvider(output));

        generator.addProvider(event.includeServer(), new KatusCarpetsRecipeProvider(output));
        var blockTagProvider = generator.addProvider(event.includeServer(), new KatusCarpetsBlockTagProvider(output, lookupProvider, fileHelper));
        generator.addProvider(event.includeServer(), new KatusCarpetsItemTagProvider(output, lookupProvider, blockTagProvider.contentsGetter(), fileHelper));
        generator.addProvider(event.includeServer(), new LootTableProvider(output, Set.of(), List.of(new LootTableProvider.SubProviderEntry(KatusCarpetsBlockLootTableSubProvider::new, LootContextParamSets.BLOCK))));
    }
}
