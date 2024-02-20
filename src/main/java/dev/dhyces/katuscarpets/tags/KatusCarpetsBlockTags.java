package dev.dhyces.katuscarpets.tags;

import dev.dhyces.katuscarpets.KatusCarpets;
import net.minecraft.core.registries.Registries;
import net.minecraft.tags.TagKey;
import net.minecraft.world.level.block.Block;

public class KatusCarpetsBlockTags {
    public static final TagKey<Block> FANCY_WOOL = createTag("fancy_wool");
    public static final TagKey<Block> FANCY_WOOL_CARPETS = createTag("fancy_wool_carpets");

    private static TagKey<Block> createTag(String tag) {
        return TagKey.create(Registries.BLOCK, KatusCarpets.id(tag));
    }
}
