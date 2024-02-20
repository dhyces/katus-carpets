package dev.dhyces.katuscarpets.data;

import dev.dhyces.katuscarpets.registry.BlockRegistry;
import net.minecraft.data.loot.BlockLootSubProvider;
import net.minecraft.world.flag.FeatureFlags;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.registries.RegistryObject;

import java.util.Set;

public class KatusCarpetsBlockLootTableSubProvider extends BlockLootSubProvider {
    public KatusCarpetsBlockLootTableSubProvider() {
        super(Set.of(), FeatureFlags.DEFAULT_FLAGS);
    }

    @Override
    protected void generate() {
        dropSelf(BlockRegistry.WHITE_FANCY_WOOL.get());
        dropSelf(BlockRegistry.ORANGE_FANCY_WOOL.get());
        dropSelf(BlockRegistry.MAGENTA_FANCY_WOOL.get());
        dropSelf(BlockRegistry.LIGHT_BLUE_FANCY_WOOL.get());
        dropSelf(BlockRegistry.YELLOW_FANCY_WOOL.get());
        dropSelf(BlockRegistry.LIME_FANCY_WOOL.get());
        dropSelf(BlockRegistry.PINK_FANCY_WOOL.get());
        dropSelf(BlockRegistry.GRAY_FANCY_WOOL.get());
        dropSelf(BlockRegistry.LIGHT_GRAY_FANCY_WOOL.get());
        dropSelf(BlockRegistry.CYAN_FANCY_WOOL.get());
        dropSelf(BlockRegistry.PURPLE_FANCY_WOOL.get());
        dropSelf(BlockRegistry.BLUE_FANCY_WOOL.get());
        dropSelf(BlockRegistry.BROWN_FANCY_WOOL.get());
        dropSelf(BlockRegistry.GREEN_FANCY_WOOL.get());
        dropSelf(BlockRegistry.RED_FANCY_WOOL.get());
        dropSelf(BlockRegistry.BLACK_FANCY_WOOL.get());

        dropSelf(BlockRegistry.WHITE_FANCY_CARPET.get());
        dropSelf(BlockRegistry.ORANGE_FANCY_CARPET.get());
        dropSelf(BlockRegistry.MAGENTA_FANCY_CARPET.get());
        dropSelf(BlockRegistry.LIGHT_BLUE_FANCY_CARPET.get());
        dropSelf(BlockRegistry.YELLOW_FANCY_CARPET.get());
        dropSelf(BlockRegistry.LIME_FANCY_CARPET.get());
        dropSelf(BlockRegistry.PINK_FANCY_CARPET.get());
        dropSelf(BlockRegistry.GRAY_FANCY_CARPET.get());
        dropSelf(BlockRegistry.LIGHT_GRAY_FANCY_CARPET.get());
        dropSelf(BlockRegistry.CYAN_FANCY_CARPET.get());
        dropSelf(BlockRegistry.PURPLE_FANCY_CARPET.get());
        dropSelf(BlockRegistry.BLUE_FANCY_CARPET.get());
        dropSelf(BlockRegistry.BROWN_FANCY_CARPET.get());
        dropSelf(BlockRegistry.GREEN_FANCY_CARPET.get());
        dropSelf(BlockRegistry.RED_FANCY_CARPET.get());
        dropSelf(BlockRegistry.BLACK_FANCY_CARPET.get());
    }

    @Override
    protected Iterable<Block> getKnownBlocks() {
        return BlockRegistry.REGISTER.getEntries().stream().map(RegistryObject::get).toList();
    }
}
