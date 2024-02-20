package dev.dhyces.katuscarpets.client.data;

import dev.dhyces.katuscarpets.KatusCarpets;
import dev.dhyces.katuscarpets.registry.BlockRegistry;
import net.minecraft.data.PackOutput;
import net.minecraftforge.common.data.LanguageProvider;

public class KatusCarpetsEnUsLanguageProvider extends LanguageProvider {
    public KatusCarpetsEnUsLanguageProvider(PackOutput output) {
        super(output, KatusCarpets.MODID, "en_us");
    }

    @Override
    protected void addTranslations() {
        addBlock(BlockRegistry.WHITE_FANCY_WOOL, "White Fancy Wool");
        addBlock(BlockRegistry.ORANGE_FANCY_WOOL, "Orange Fancy Wool");
        addBlock(BlockRegistry.MAGENTA_FANCY_WOOL, "Magenta Fancy Wool");
        addBlock(BlockRegistry.LIGHT_BLUE_FANCY_WOOL, "Light Blue Fancy Wool");
        addBlock(BlockRegistry.YELLOW_FANCY_WOOL, "Yellow Fancy Wool");
        addBlock(BlockRegistry.LIME_FANCY_WOOL, "Lime Fancy Wool");
        addBlock(BlockRegistry.PINK_FANCY_WOOL, "Pink Fancy Wool");
        addBlock(BlockRegistry.GRAY_FANCY_WOOL, "Gray Fancy Wool");
        addBlock(BlockRegistry.LIGHT_GRAY_FANCY_WOOL, "Light Gray Fancy Wool");
        addBlock(BlockRegistry.CYAN_FANCY_WOOL, "Cyan Fancy Wool");
        addBlock(BlockRegistry.PURPLE_FANCY_WOOL, "Purple Fancy Wool");
        addBlock(BlockRegistry.BLUE_FANCY_WOOL, "Blue Fancy Wool");
        addBlock(BlockRegistry.BROWN_FANCY_WOOL, "Brown Fancy Wool");
        addBlock(BlockRegistry.GREEN_FANCY_WOOL, "Green Fancy Wool");
        addBlock(BlockRegistry.RED_FANCY_WOOL, "Red Fancy Wool");
        addBlock(BlockRegistry.BLACK_FANCY_WOOL, "Black Fancy Wool");

        addBlock(BlockRegistry.WHITE_FANCY_CARPET, "White Fancy Carpet");
        addBlock(BlockRegistry.ORANGE_FANCY_CARPET, "Orange Fancy Carpet");
        addBlock(BlockRegistry.MAGENTA_FANCY_CARPET, "Magenta Fancy Carpet");
        addBlock(BlockRegistry.LIGHT_BLUE_FANCY_CARPET, "Light Blue Fancy Carpet");
        addBlock(BlockRegistry.YELLOW_FANCY_CARPET, "Yellow Fancy Carpet");
        addBlock(BlockRegistry.LIME_FANCY_CARPET, "Lime Fancy Carpet");
        addBlock(BlockRegistry.PINK_FANCY_CARPET, "Pink Fancy Carpet");
        addBlock(BlockRegistry.GRAY_FANCY_CARPET, "Gray Fancy Carpet");
        addBlock(BlockRegistry.LIGHT_GRAY_FANCY_CARPET, "Light Gray Fancy Carpet");
        addBlock(BlockRegistry.CYAN_FANCY_CARPET, "Cyan Fancy Carpet");
        addBlock(BlockRegistry.PURPLE_FANCY_CARPET, "Purple Fancy Carpet");
        addBlock(BlockRegistry.BLUE_FANCY_CARPET, "Blue Fancy Carpet");
        addBlock(BlockRegistry.BROWN_FANCY_CARPET, "Brown Fancy Carpet");
        addBlock(BlockRegistry.GREEN_FANCY_CARPET, "Green Fancy Carpet");
        addBlock(BlockRegistry.RED_FANCY_CARPET, "Red Fancy Carpet");
        addBlock(BlockRegistry.BLACK_FANCY_CARPET, "Black Fancy Carpet");
    }
}
