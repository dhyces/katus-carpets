package dev.dhyces.katuscarpets.client.data;

import dev.dhyces.katuscarpets.KatusCarpets;
import dev.dhyces.katuscarpets.registry.BlockRegistry;
import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.client.model.generators.BlockStateProvider;
import net.minecraftforge.client.model.generators.ConfiguredModel;
import net.minecraftforge.client.model.generators.ModelFile;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.registries.RegistryObject;

public class KatusCarpetsBlockStateProvider extends BlockStateProvider {
    public KatusCarpetsBlockStateProvider(PackOutput output, ExistingFileHelper exFileHelper) {
        super(output, KatusCarpets.MODID, exFileHelper);
    }

    @Override
    protected void registerStatesAndModels() {
        simpleBlock(BlockRegistry.WHITE_FANCY_WOOL.get());
        simpleBlock(BlockRegistry.ORANGE_FANCY_WOOL.get());
        simpleBlock(BlockRegistry.MAGENTA_FANCY_WOOL.get());
        simpleBlock(BlockRegistry.LIGHT_BLUE_FANCY_WOOL.get());
        simpleBlock(BlockRegistry.YELLOW_FANCY_WOOL.get());
        simpleBlock(BlockRegistry.LIME_FANCY_WOOL.get());
        simpleBlock(BlockRegistry.PINK_FANCY_WOOL.get());
        simpleBlock(BlockRegistry.GRAY_FANCY_WOOL.get());
        simpleBlock(BlockRegistry.LIGHT_GRAY_FANCY_WOOL.get());
        simpleBlock(BlockRegistry.CYAN_FANCY_WOOL.get());
        simpleBlock(BlockRegistry.PURPLE_FANCY_WOOL.get());
        simpleBlock(BlockRegistry.BLUE_FANCY_WOOL.get());
        simpleBlock(BlockRegistry.BROWN_FANCY_WOOL.get());
        simpleBlock(BlockRegistry.GREEN_FANCY_WOOL.get());
        simpleBlock(BlockRegistry.RED_FANCY_WOOL.get());
        simpleBlock(BlockRegistry.BLACK_FANCY_WOOL.get());

        fancyCarpet(BlockRegistry.WHITE_FANCY_CARPET, BlockRegistry.WHITE_FANCY_WOOL, "white_fringe");
        fancyCarpet(BlockRegistry.ORANGE_FANCY_CARPET, BlockRegistry.ORANGE_FANCY_WOOL, "orange_fringe");
        fancyCarpet(BlockRegistry.MAGENTA_FANCY_CARPET, BlockRegistry.MAGENTA_FANCY_WOOL, "magenta_fringe");
        fancyCarpet(BlockRegistry.LIGHT_BLUE_FANCY_CARPET, BlockRegistry.LIGHT_BLUE_FANCY_WOOL, "light_blue_fringe");
        fancyCarpet(BlockRegistry.YELLOW_FANCY_CARPET, BlockRegistry.YELLOW_FANCY_WOOL, "yellow_fringe");
        fancyCarpet(BlockRegistry.LIME_FANCY_CARPET, BlockRegistry.LIME_FANCY_WOOL, "lime_fringe");
        fancyCarpet(BlockRegistry.PINK_FANCY_CARPET, BlockRegistry.PINK_FANCY_WOOL, "pink_fringe");
        fancyCarpet(BlockRegistry.GRAY_FANCY_CARPET, BlockRegistry.GRAY_FANCY_WOOL, "gray_fringe");
        fancyCarpet(BlockRegistry.LIGHT_GRAY_FANCY_CARPET, BlockRegistry.LIGHT_GRAY_FANCY_WOOL, "light_gray_fringe");
        fancyCarpet(BlockRegistry.CYAN_FANCY_CARPET, BlockRegistry.CYAN_FANCY_WOOL, "cyan_fringe");
        fancyCarpet(BlockRegistry.PURPLE_FANCY_CARPET, BlockRegistry.PURPLE_FANCY_WOOL, "purple_fringe");
        fancyCarpet(BlockRegistry.BLUE_FANCY_CARPET, BlockRegistry.BLUE_FANCY_WOOL, "pink_fringe");
        fancyCarpet(BlockRegistry.BROWN_FANCY_CARPET, BlockRegistry.BROWN_FANCY_WOOL, "brown_fringe");
        fancyCarpet(BlockRegistry.GREEN_FANCY_CARPET, BlockRegistry.GREEN_FANCY_WOOL, "green_fringe");
        fancyCarpet(BlockRegistry.RED_FANCY_CARPET, BlockRegistry.RED_FANCY_WOOL, "red_fringe");
        fancyCarpet(BlockRegistry.BLACK_FANCY_CARPET, BlockRegistry.BLACK_FANCY_WOOL, "gold_fringe");
    }

    private void fancyCarpet(RegistryObject<Block> block, RegistryObject<Block> woolBlock, String fringe) {
        getVariantBuilder(block.get())
                .partialState()
                .setModels(ConfiguredModel.builder()
                        .modelFile(
                                models().withExistingParent(block.getId().toString(), modLoc("block/fancy_carpet_template"))
                                        .texture("wool", woolBlock.getId().withPrefix("block/"))
                                        .texture("fringe", "block/" + fringe)
                        )
                        .buildLast());
    }
}
