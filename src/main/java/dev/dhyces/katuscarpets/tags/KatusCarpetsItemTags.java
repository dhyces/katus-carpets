package dev.dhyces.katuscarpets.tags;

import dev.dhyces.katuscarpets.KatusCarpets;
import net.minecraft.core.registries.Registries;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;

public class KatusCarpetsItemTags {
    public static final TagKey<Item> FANCY_WOOL = createTag("fancy_wool");
    public static final TagKey<Item> FANCY_WOOL_CARPETS = createTag("fancy_wool_carpets");

    private static TagKey<Item> createTag(String tag) {
        return TagKey.create(Registries.ITEM, KatusCarpets.id(tag));
    }
}
