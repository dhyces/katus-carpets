package dev.dhyces.katuscarpets.registry;

import dev.dhyces.katuscarpets.KatusCarpets;
import net.minecraft.core.registries.Registries;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

import java.util.function.Supplier;

public final class ItemRegistry {
    public static final DeferredRegister<Item> REGISTER = DeferredRegister.create(Registries.ITEM, KatusCarpets.MODID);

    public static final RegistryObject<Item> WHITE_FANCY_WOOL = holderFor("white_fancy_wool");
    public static final RegistryObject<Item> ORANGE_FANCY_WOOL = holderFor("orange_fancy_wool");
    public static final RegistryObject<Item> MAGENTA_FANCY_WOOL = holderFor("magenta_fancy_wool");
    public static final RegistryObject<Item> LIGHT_BLUE_FANCY_WOOL = holderFor("light_blue_fancy_wool");
    public static final RegistryObject<Item> YELLOW_FANCY_WOOL = holderFor("yellow_fancy_wool");
    public static final RegistryObject<Item> LIME_FANCY_WOOL = holderFor("lime_fancy_wool");
    public static final RegistryObject<Item> PINK_FANCY_WOOL = holderFor("pink_fancy_wool");
    public static final RegistryObject<Item> GRAY_FANCY_WOOL = holderFor("gray_fancy_wool");
    public static final RegistryObject<Item> LIGHT_GRAY_FANCY_WOOL = holderFor("light_gray_fancy_wool");
    public static final RegistryObject<Item> CYAN_FANCY_WOOL = holderFor("cyan_fancy_wool");
    public static final RegistryObject<Item> PURPLE_FANCY_WOOL = holderFor("purple_fancy_wool");
    public static final RegistryObject<Item> BLUE_FANCY_WOOL = holderFor("blue_fancy_wool");
    public static final RegistryObject<Item> BROWN_FANCY_WOOL = holderFor("brown_fancy_wool");
    public static final RegistryObject<Item> GREEN_FANCY_WOOL = holderFor("green_fancy_wool");
    public static final RegistryObject<Item> RED_FANCY_WOOL = holderFor("red_fancy_wool");
    public static final RegistryObject<Item> BLACK_FANCY_WOOL = holderFor("black_fancy_wool");
    public static final RegistryObject<Item> PLANT_POT_WOOL = holderFor("plant_pot_wool");

    public static final RegistryObject<Item> WHITE_FANCY_CARPET = holderFor("white_fancy_carpet");
    public static final RegistryObject<Item> ORANGE_FANCY_CARPET = holderFor("orange_fancy_carpet");
    public static final RegistryObject<Item> MAGENTA_FANCY_CARPET = holderFor("magenta_fancy_carpet");
    public static final RegistryObject<Item> LIGHT_BLUE_FANCY_CARPET = holderFor("light_blue_fancy_carpet");
    public static final RegistryObject<Item> YELLOW_FANCY_CARPET = holderFor("yellow_fancy_carpet");
    public static final RegistryObject<Item> LIME_FANCY_CARPET = holderFor("lime_fancy_carpet");
    public static final RegistryObject<Item> PINK_FANCY_CARPET = holderFor("pink_fancy_carpet");
    public static final RegistryObject<Item> GRAY_FANCY_CARPET = holderFor("gray_fancy_carpet");
    public static final RegistryObject<Item> LIGHT_GRAY_FANCY_CARPET = holderFor("light_gray_fancy_carpet");
    public static final RegistryObject<Item> CYAN_FANCY_CARPET = holderFor("cyan_fancy_carpet");
    public static final RegistryObject<Item> PURPLE_FANCY_CARPET = holderFor("purple_fancy_carpet");
    public static final RegistryObject<Item> BLUE_FANCY_CARPET = holderFor("blue_fancy_carpet");
    public static final RegistryObject<Item> BROWN_FANCY_CARPET = holderFor("brown_fancy_carpet");
    public static final RegistryObject<Item> GREEN_FANCY_CARPET = holderFor("green_fancy_carpet");
    public static final RegistryObject<Item> RED_FANCY_CARPET = holderFor("red_fancy_carpet");
    public static final RegistryObject<Item> BLACK_FANCY_CARPET = holderFor("black_fancy_carpet");
    public static final RegistryObject<Item> PLANT_POT_CARPET = holderFor("plant_pot_carpet");

    private static RegistryObject<Item> holderFor(String id) {
        return RegistryObject.create(KatusCarpets.id(id), Registries.ITEM, KatusCarpets.MODID);
    }

    static RegistryObject<Item> registerBlockItem(String id, Supplier<Block> blockSupplier) {
        return REGISTER.register(id, () -> new BlockItem(blockSupplier.get(), new Item.Properties()));
    }
}
