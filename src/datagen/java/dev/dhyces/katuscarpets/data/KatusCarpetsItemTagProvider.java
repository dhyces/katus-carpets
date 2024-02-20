package dev.dhyces.katuscarpets.data;

import dev.dhyces.katuscarpets.KatusCarpets;
import dev.dhyces.katuscarpets.tags.KatusCarpetsBlockTags;
import dev.dhyces.katuscarpets.tags.KatusCarpetsItemTags;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.tags.ItemTagsProvider;
import net.minecraft.tags.ItemTags;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.common.data.ExistingFileHelper;
import org.jetbrains.annotations.Nullable;

import java.util.concurrent.CompletableFuture;

public class KatusCarpetsItemTagProvider extends ItemTagsProvider {
    public KatusCarpetsItemTagProvider(PackOutput pOutput, CompletableFuture<HolderLookup.Provider> pLookupProvider, CompletableFuture<TagLookup<Block>> pBlockTags, @Nullable ExistingFileHelper existingFileHelper) {
        super(pOutput, pLookupProvider, pBlockTags, KatusCarpets.MODID, existingFileHelper);
    }

    @Override
    protected void addTags(HolderLookup.Provider pProvider) {
        copy(KatusCarpetsBlockTags.FANCY_WOOL, KatusCarpetsItemTags.FANCY_WOOL);
        copy(KatusCarpetsBlockTags.FANCY_WOOL_CARPETS, KatusCarpetsItemTags.FANCY_WOOL_CARPETS);

        tag(ItemTags.WOOL).addTag(KatusCarpetsItemTags.FANCY_WOOL);
        tag(ItemTags.WOOL_CARPETS).addTag(KatusCarpetsItemTags.FANCY_WOOL_CARPETS);
    }
}
