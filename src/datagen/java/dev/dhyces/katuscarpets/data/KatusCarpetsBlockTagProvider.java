package dev.dhyces.katuscarpets.data;

import dev.dhyces.katuscarpets.KatusCarpets;
import dev.dhyces.katuscarpets.registry.BlockRegistry;
import dev.dhyces.katuscarpets.tags.KatusCarpetsBlockTags;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.tags.BlockTags;
import net.minecraftforge.common.data.BlockTagsProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import org.jetbrains.annotations.Nullable;

import java.util.concurrent.CompletableFuture;

public class KatusCarpetsBlockTagProvider extends BlockTagsProvider {
    public KatusCarpetsBlockTagProvider(PackOutput output, CompletableFuture<HolderLookup.Provider> lookupProvider, @Nullable ExistingFileHelper existingFileHelper) {
        super(output, lookupProvider, KatusCarpets.MODID, existingFileHelper);
    }

    @Override
    protected void addTags(HolderLookup.Provider pProvider) {
        tag(KatusCarpetsBlockTags.FANCY_WOOL).add(
                BlockRegistry.WHITE_FANCY_WOOL.get(),
                BlockRegistry.ORANGE_FANCY_WOOL.get(),
                BlockRegistry.MAGENTA_FANCY_WOOL.get(),
                BlockRegistry.LIGHT_BLUE_FANCY_WOOL.get(),
                BlockRegistry.YELLOW_FANCY_WOOL.get(),
                BlockRegistry.LIME_FANCY_WOOL.get(),
                BlockRegistry.PINK_FANCY_WOOL.get(),
                BlockRegistry.GRAY_FANCY_WOOL.get(),
                BlockRegistry.LIGHT_GRAY_FANCY_WOOL.get(),
                BlockRegistry.CYAN_FANCY_WOOL.get(),
                BlockRegistry.PURPLE_FANCY_WOOL.get(),
                BlockRegistry.BLUE_FANCY_WOOL.get(),
                BlockRegistry.BROWN_FANCY_WOOL.get(),
                BlockRegistry.GREEN_FANCY_WOOL.get(),
                BlockRegistry.RED_FANCY_WOOL.get(),
                BlockRegistry.BLACK_FANCY_WOOL.get()
        );
        tag(KatusCarpetsBlockTags.FANCY_WOOL_CARPETS).add(
                BlockRegistry.WHITE_FANCY_CARPET.get(),
                BlockRegistry.ORANGE_FANCY_CARPET.get(),
                BlockRegistry.MAGENTA_FANCY_CARPET.get(),
                BlockRegistry.LIGHT_BLUE_FANCY_CARPET.get(),
                BlockRegistry.YELLOW_FANCY_CARPET.get(),
                BlockRegistry.LIME_FANCY_CARPET.get(),
                BlockRegistry.PINK_FANCY_CARPET.get(),
                BlockRegistry.GRAY_FANCY_CARPET.get(),
                BlockRegistry.LIGHT_GRAY_FANCY_CARPET.get(),
                BlockRegistry.CYAN_FANCY_CARPET.get(),
                BlockRegistry.PURPLE_FANCY_CARPET.get(),
                BlockRegistry.BLUE_FANCY_CARPET.get(),
                BlockRegistry.BROWN_FANCY_CARPET.get(),
                BlockRegistry.GREEN_FANCY_CARPET.get(),
                BlockRegistry.RED_FANCY_CARPET.get(),
                BlockRegistry.BLACK_FANCY_CARPET.get()
        );

        tag(BlockTags.WOOL).addTag(KatusCarpetsBlockTags.FANCY_WOOL);
        tag(BlockTags.WOOL_CARPETS).addTag(KatusCarpetsBlockTags.FANCY_WOOL_CARPETS);
    }
}
