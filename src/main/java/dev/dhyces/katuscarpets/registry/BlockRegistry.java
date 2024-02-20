package dev.dhyces.katuscarpets.registry;

import dev.dhyces.katuscarpets.KatusCarpets;
import net.minecraft.core.registries.Registries;
import net.minecraft.world.item.DyeColor;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.WoolCarpetBlock;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.properties.NoteBlockInstrument;
import net.minecraft.world.level.material.MapColor;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public final class BlockRegistry {
    public static final DeferredRegister<Block> REGISTER = DeferredRegister.create(Registries.BLOCK, KatusCarpets.MODID);

    public static final RegistryObject<Block> WHITE_FANCY_WOOL = registerWoolBlockAndItem("white_fancy_wool", MapColor.SNOW);
    public static final RegistryObject<Block> ORANGE_FANCY_WOOL = registerWoolBlockAndItem("orange_fancy_wool", MapColor.COLOR_ORANGE);
    public static final RegistryObject<Block> MAGENTA_FANCY_WOOL = registerWoolBlockAndItem("magenta_fancy_wool", MapColor.COLOR_MAGENTA);
    public static final RegistryObject<Block> LIGHT_BLUE_FANCY_WOOL = registerWoolBlockAndItem("light_blue_fancy_wool", MapColor.COLOR_LIGHT_BLUE);
    public static final RegistryObject<Block> YELLOW_FANCY_WOOL = registerWoolBlockAndItem("yellow_fancy_wool", MapColor.COLOR_YELLOW);
    public static final RegistryObject<Block> LIME_FANCY_WOOL = registerWoolBlockAndItem("lime_fancy_wool", MapColor.COLOR_LIGHT_GREEN);
    public static final RegistryObject<Block> PINK_FANCY_WOOL = registerWoolBlockAndItem("pink_fancy_wool", MapColor.COLOR_PINK);
    public static final RegistryObject<Block> GRAY_FANCY_WOOL = registerWoolBlockAndItem("gray_fancy_wool", MapColor.COLOR_GRAY);
    public static final RegistryObject<Block> LIGHT_GRAY_FANCY_WOOL = registerWoolBlockAndItem("light_gray_fancy_wool", MapColor.COLOR_LIGHT_GRAY);
    public static final RegistryObject<Block> CYAN_FANCY_WOOL = registerWoolBlockAndItem("cyan_fancy_wool", MapColor.COLOR_CYAN);
    public static final RegistryObject<Block> PURPLE_FANCY_WOOL = registerWoolBlockAndItem("purple_fancy_wool", MapColor.COLOR_PURPLE);
    public static final RegistryObject<Block> BLUE_FANCY_WOOL = registerWoolBlockAndItem("blue_fancy_wool", MapColor.COLOR_BLUE);
    public static final RegistryObject<Block> BROWN_FANCY_WOOL = registerWoolBlockAndItem("brown_fancy_wool", MapColor.COLOR_BROWN);
    public static final RegistryObject<Block> GREEN_FANCY_WOOL = registerWoolBlockAndItem("green_fancy_wool", MapColor.COLOR_GREEN);
    public static final RegistryObject<Block> RED_FANCY_WOOL = registerWoolBlockAndItem("red_fancy_wool", MapColor.COLOR_RED);
    public static final RegistryObject<Block> BLACK_FANCY_WOOL = registerWoolBlockAndItem("black_fancy_wool", MapColor.COLOR_BLACK);

    public static final RegistryObject<Block> WHITE_FANCY_CARPET = registerCarpetBlockAndItem("white_fancy_carpet", DyeColor.WHITE);
    public static final RegistryObject<Block> ORANGE_FANCY_CARPET = registerCarpetBlockAndItem("orange_fancy_carpet", DyeColor.ORANGE);
    public static final RegistryObject<Block> MAGENTA_FANCY_CARPET = registerCarpetBlockAndItem("magenta_fancy_carpet", DyeColor.MAGENTA);
    public static final RegistryObject<Block> LIGHT_BLUE_FANCY_CARPET = registerCarpetBlockAndItem("light_blue_fancy_carpet", DyeColor.LIGHT_BLUE);
    public static final RegistryObject<Block> YELLOW_FANCY_CARPET = registerCarpetBlockAndItem("yellow_fancy_carpet", DyeColor.YELLOW);
    public static final RegistryObject<Block> LIME_FANCY_CARPET = registerCarpetBlockAndItem("lime_fancy_carpet", DyeColor.LIME);
    public static final RegistryObject<Block> PINK_FANCY_CARPET = registerCarpetBlockAndItem("pink_fancy_carpet", DyeColor.PINK);
    public static final RegistryObject<Block> GRAY_FANCY_CARPET = registerCarpetBlockAndItem("gray_fancy_carpet", DyeColor.GRAY);
    public static final RegistryObject<Block> LIGHT_GRAY_FANCY_CARPET = registerCarpetBlockAndItem("light_gray_fancy_carpet", DyeColor.LIGHT_GRAY);
    public static final RegistryObject<Block> CYAN_FANCY_CARPET = registerCarpetBlockAndItem("cyan_fancy_carpet", DyeColor.CYAN);
    public static final RegistryObject<Block> PURPLE_FANCY_CARPET = registerCarpetBlockAndItem("purple_fancy_carpet", DyeColor.PURPLE);
    public static final RegistryObject<Block> BLUE_FANCY_CARPET = registerCarpetBlockAndItem("blue_fancy_carpet", DyeColor.BLUE);
    public static final RegistryObject<Block> BROWN_FANCY_CARPET = registerCarpetBlockAndItem("brown_fancy_carpet", DyeColor.BROWN);
    public static final RegistryObject<Block> GREEN_FANCY_CARPET = registerCarpetBlockAndItem("green_fancy_carpet", DyeColor.GREEN);
    public static final RegistryObject<Block> RED_FANCY_CARPET = registerCarpetBlockAndItem("red_fancy_carpet", DyeColor.RED);
    public static final RegistryObject<Block> BLACK_FANCY_CARPET = registerCarpetBlockAndItem("black_fancy_carpet", DyeColor.BLACK);

    private static RegistryObject<Block> registerWoolBlockAndItem(String id, MapColor color) {
        RegistryObject<Block> block = REGISTER.register(id, () -> new Block(woolProperties(color)));
        ItemRegistry.registerBlockItem(id, block);
        return block;
    }

    private static RegistryObject<Block> registerCarpetBlockAndItem(String id, DyeColor color) {
        return registerCarpetBlockAndItem(id, color, color.getMapColor());
    }

    private static RegistryObject<Block> registerCarpetBlockAndItem(String id, DyeColor dyeColor, MapColor mapColor) {
        RegistryObject<Block> block = REGISTER.register(id, () -> new WoolCarpetBlock(dyeColor, carpetProperties(mapColor)));
        ItemRegistry.registerBlockItem(id, block);
        return block;
    }

    private static BlockBehaviour.Properties woolProperties(MapColor color) {
        return BlockBehaviour.Properties.of().mapColor(color).instrument(NoteBlockInstrument.GUITAR).strength(0.8F).sound(SoundType.WOOL).ignitedByLava();
    }

    private static BlockBehaviour.Properties carpetProperties(MapColor color) {
        return BlockBehaviour.Properties.of().mapColor(color).strength(0.1F).sound(SoundType.WOOL).ignitedByLava();
    }
}
