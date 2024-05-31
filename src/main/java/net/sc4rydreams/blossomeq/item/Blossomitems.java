package net.sc4rydreams.blossomeq.item;

import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.sc4rydreams.blossomeq.BlossomEq;

public class Blossomitems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, BlossomEq.MOD_ID);

// cherry blossoms
    public static  final RegistryObject<Item> CHERRY_BLOSSOM = ITEMS.register("cherry_blossom",
            () -> new Item(new Item.Properties()));
    public static  final RegistryObject<Item> CHERRY_BLOSSOM_2 = ITEMS.register("cherry_blossom_2",
            () -> new Item(new Item.Properties()));

    public static  final RegistryObject<Item> CHERRY_BLOSSOM_3 = ITEMS.register("cherry_blossom_3",
            () -> new Item(new Item.Properties()));

    public static  final RegistryObject<Item> CHERRY_BLOSSOM_4 = ITEMS.register("cherry_blossom_4",
            () -> new Item(new Item.Properties()));

    public static  final RegistryObject<Item> CHERRY_BLOSSOM_5 = ITEMS.register("cherry_blossom_5",
            () -> new Item(new Item.Properties()));

    public static  final RegistryObject<Item> CHERRY_BLOSSOM_6 = ITEMS.register("cherry_blossom_6",
            () -> new Item(new Item.Properties()));

    public static  final RegistryObject<Item> CHERRY_BLOSSOM_7 = ITEMS.register("cherry_blossom_7",
            () -> new Item(new Item.Properties()));

    public static  final RegistryObject<Item> CHERRY_BLOSSOM_8 = ITEMS.register("cherry_blossom_8",
            () -> new Item(new Item.Properties()));

    public static  final RegistryObject<Item> HALTER_TAB = ITEMS.register("halter_tab",
            () -> new Item(new Item.Properties()));

    public static  final RegistryObject<Item> HALTER_FLUFFY_TAB = ITEMS.register("halter_fluffy_tab",
            () -> new Item(new Item.Properties()));

    // whips
    public static  final RegistryObject<Item> WHIP_DRESSAGE = ITEMS.register("whip_dressage",
            () -> new Item(new Item.Properties().stacksTo(1)));

    public static  final RegistryObject<Item> WHIP_2 = ITEMS.register("whip_2",
            () -> new Item(new Item.Properties().stacksTo(1)));

    public static  final RegistryObject<Item> WHIP_1 = ITEMS.register("whip_1",
            () -> new Item(new Item.Properties().stacksTo(1)));

    public static  final RegistryObject<Item> WHIP_LUNGING = ITEMS.register("whip_lunging",
            () -> new Item(new Item.Properties().stacksTo(1)));



    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);


        }
}
