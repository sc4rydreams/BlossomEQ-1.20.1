package net.sc4rydreams.blossomeq.registry;

import com.alaharranhonor.swem.forge.items.SWEMHorseArmorItem;
import com.alaharranhonor.swem.forge.items.tack.*;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries.Keys;
import net.minecraftforge.registries.RegistryObject;
import net.sc4rydreams.blossomeq.item.BlossomCreativeModeTabs;

import java.util.ArrayList;
import java.util.List;


public class BlossomTackItems {
        public static final DeferredRegister<Item> REGISTRY;

    // ONE OFF TACK ITEMS - This is where we are basically having the game set these aside for us to call later.
    public static final RegistryObject<PastureBlanketItem> PASTURE_BLANKET_QUILTED_WHITE;
    public static final RegistryObject<PastureBlanketItem> PASTURE_BLANKET_QUILTED_BLACK;
    public static final RegistryObject<PastureBlanketItem> PASTURE_BLANKET_QUILTED_BROWN;
    public static final RegistryObject<HalterItem> HALTER_BLOSSOM_BROWN;
    public static final RegistryObject<HalterItem> HALTER_BLOSSOM_BLACK;
    public static final RegistryObject<HalterItem> HALTER_BLOSSOM_WHITE;
    public static final RegistryObject<HalterItem> HALTER_FLUFFY_BLOSSOM_BROWN;
    public static final RegistryObject<HalterItem> HALTER_FLUFFY_BLOSSOM_BLACK;
    public static final RegistryObject<HalterItem> HALTER_FLUFFY_BLOSSOM_WHITE;
    public static final RegistryObject<HalterItem> HALTER_FLUFFY_BLOSSOM_GRAY;
    public static final RegistryObject<HalterItem> HALTER_BLOSSOM_GRAY;
    public static final RegistryObject<BlanketItem> SADDLE_PAD_MUTED_BROWN;

    // TACK FOR LOOPS - These are looping ones

    public static final List<RegistryObject<WesternBreastCollarItem>> ENGLISH_SHEEPSKIN_BLOSSOM;
    public static final List<RegistryObject<PastureBlanketItem>> PASTURE_BLANKETS_NEON;
    public static final List<RegistryObject<AdventureLegWraps>> BLOSSOM_TRANSPORT_BOOTS;
    public static final List<RegistryObject<WesternBreastCollarItem>> WESTERN_SHEEPSKIN_BLOSSOM;
    public static final List<RegistryObject<EnglishSaddleItem>> ENGLISH_SADDLE_BLOSSOM;
    public static final List<RegistryObject<WesternSaddleItem>> WESTERN_SADDLE_BLOSSOM;
    public static final List<RegistryObject<AdventureSaddleItem>> ADVENTURE_SADDLE_BLOSSOM;
    public static final List<RegistryObject<AdventureLegWraps>> PROTECTION_BOOTS_BLOSSOM;
    public static final List<RegistryObject<WesternGirthStrapItem>> WESTERN_GIRTH_BLOSSOM;
    public static final List<RegistryObject<WesternBridleItem>> WESTERN_BRIDLE_BLOSSOM;
    public static final List<RegistryObject<EnglishBridleItem>> ENGLISH_BRIDLE_BLOSSOM;
    public static final List<RegistryObject<WesternBlanketItem>> SADDLE_PAD_NEON;
    public static final List<RegistryObject<HalterItem>> HALTER_BLOSSOM_NEON;
    public static final List<RegistryObject<HalterItem>> HALTER_FLUFFY_BLOSSOM_NEON;
    public static final List<RegistryObject<WesternBreastCollarItem>> BREAST_COLLAR_BLOSSOM;
    public static final List<RegistryObject<HalterItem>> HALTER_BLOSSOM_MUTED;
    public static final List<RegistryObject<HalterItem>> HALTER_FLUFFY_BLOSSOM_MUTED;
    public static final List<RegistryObject<WesternBlanketItem>> SADDLE_PAD_MUTED;

    public BlossomTackItems(){
    }

    //Actually calling the game to register our items
    public static void init(IEventBus eventBus) {  REGISTRY.register(eventBus); }

    static {
        REGISTRY = DeferredRegister.create(Keys.ITEMS, "blossomeq");


        // ONE OFF TACK - We are registering them in a similar fashion to your other items :)

        PASTURE_BLANKET_QUILTED_WHITE = REGISTRY.register("pasture_blanket_quilted_white",
                () -> new PastureBlanketItem(SWEMHorseArmorItem.HorseArmorTier.NONE, 0,
                        "pasture_blanket_quilted_white", new Item.Properties()
                        .stacksTo(16)));

        PASTURE_BLANKET_QUILTED_BLACK = REGISTRY.register("pasture_blanket_quilted_black",
                () -> new PastureBlanketItem(SWEMHorseArmorItem.HorseArmorTier.NONE, 0,
                        "pasture_blanket_quilted_black", new Item.Properties()
                        .stacksTo(16)));

        PASTURE_BLANKET_QUILTED_BROWN = REGISTRY.register("pasture_blanket_quilted_brown",
                () -> new PastureBlanketItem(SWEMHorseArmorItem.HorseArmorTier.NONE, 0,
                        "pasture_blanket_quilted_brown", new Item.Properties()
                        .stacksTo(16)));

        HALTER_BLOSSOM_BROWN = REGISTRY.register("halter_blossom_brown",
                () -> new HalterItem( "halter_blossom_brown", new Item.Properties()
                        .stacksTo(16)));

        HALTER_BLOSSOM_BLACK = REGISTRY.register("halter_blossom_black",
                () -> new HalterItem( "halter_blossom_black", new Item.Properties()
                        .stacksTo(16)));

        HALTER_BLOSSOM_WHITE = REGISTRY.register("halter_blossom_white",
                () -> new HalterItem( "halter_blossom_white", new Item.Properties()
                        .stacksTo(16)));

        HALTER_BLOSSOM_GRAY = REGISTRY.register("halter_blossom_gray",
                () -> new HalterItem( "halter_blossom_gray", new Item.Properties()
                       .stacksTo(16)));



        HALTER_FLUFFY_BLOSSOM_BROWN = REGISTRY.register("halter_fluffy_blossom_brown",
                () -> new HalterItem( "halter_fluffy_blossom_brown", new Item.Properties()
                        .stacksTo(16)));

        HALTER_FLUFFY_BLOSSOM_BLACK = REGISTRY.register("halter_fluffy_blossom_black",
                () -> new HalterItem( "halter_fluffy_blossom_black", new Item.Properties()
                        .stacksTo(16)));

        HALTER_FLUFFY_BLOSSOM_WHITE = REGISTRY.register("halter_fluffy_blossom_white",
                () -> new HalterItem( "halter_fluffy_blossom_white", new Item.Properties()
                        .stacksTo(16)));

        HALTER_FLUFFY_BLOSSOM_GRAY = REGISTRY.register("halter_fluffy_blossom_gray",
                () -> new HalterItem( "halter_fluffy_blossom_gray", new Item.Properties()
                        .stacksTo(16)));



        SADDLE_PAD_MUTED_BROWN = REGISTRY.register("saddle_pad_muted_brown",
                () -> new BlanketItem( "saddle_pad_muted_brown", new Item.Properties()
                        .stacksTo(16)));


// Looping tack items

        BLOSSOM_TRANSPORT_BOOTS = new ArrayList<>(); // 25 transport boots
        for(int var1 = 0; var1 < 25; ++var1) {
            int counter = var1 + 1;
            BLOSSOM_TRANSPORT_BOOTS.add(REGISTRY.register("transport_boots_" + counter,
                    () -> new AdventureLegWraps("transport_boots_" + counter, (new Item.Properties())
                            .stacksTo(16))
            ));
        }
        SADDLE_PAD_NEON = new ArrayList<>(); // SADDLE PADS
        for(int var1 = 0; var1 < 49; ++var1) {
            int counter = var1 + 1;
            SADDLE_PAD_NEON.add(REGISTRY.register("saddle_pad_neon_" + counter,
                    () -> new WesternBlanketItem("saddle_pad_neon_" + counter, (new Item.Properties())
                            .stacksTo(16))
            ));
        }

        SADDLE_PAD_MUTED = new ArrayList<>(); // SADDLE PADS
        for(int var1 = 0; var1 < 49; ++var1) {
            int counter = var1 + 1;
            SADDLE_PAD_MUTED.add(REGISTRY.register("saddle_pad_muted_" + counter,
                    () -> new WesternBlanketItem("saddle_pad_muted_" + counter, (new Item.Properties())
                            .stacksTo(16))
            ));
        }

        BREAST_COLLAR_BLOSSOM = new ArrayList<>(); // SADDLE PADS
        for(int var1 = 0; var1 < 7; ++var1) {
            int counter = var1 + 1;
            BREAST_COLLAR_BLOSSOM.add(REGISTRY.register("breast_collar_blossom_" + counter,
                    () -> new WesternBreastCollarItem("breast_collar_blossom_" + counter, (new Item.Properties())
                            .stacksTo(16))
            ));
        }

        HALTER_BLOSSOM_NEON = new ArrayList<>(); // 25 transport boots
        for(int var1 = 0; var1 < 49; ++var1) {
            int counter = var1 + 1;
               HALTER_BLOSSOM_NEON.add(REGISTRY.register("halter_blossom_" + counter,
                    () -> new HalterItem("halter_blossom_" + counter, (new Item.Properties())
                            .stacksTo(16))
            ));
        }

        HALTER_FLUFFY_BLOSSOM_NEON = new ArrayList<>(); // 25 transport boots
        for(int var1 = 0; var1 < 49; ++var1) {
            int counter = var1 + 1;
            HALTER_FLUFFY_BLOSSOM_NEON.add(REGISTRY.register("halter_fluffy_blossom_" + counter,
                    () -> new HalterItem("halter_fluffy_blossom_" + counter, (new Item.Properties())
                           .stacksTo(16))
            ));
        }

        HALTER_BLOSSOM_MUTED = new ArrayList<>(); // 25 transport boots
        for(int var1 = 0; var1 < 49; ++var1) {
            int counter = var1 + 1;
            HALTER_BLOSSOM_MUTED.add(REGISTRY.register("halter_blossom_muted_" + counter,
                    () -> new HalterItem("halter_blossom_muted_" + counter, (new Item.Properties())
                           .stacksTo(16))
            ));
        }

        HALTER_FLUFFY_BLOSSOM_MUTED = new ArrayList<>(); // 25 transport boots
        for(int var1 = 0; var1 < 49; ++var1) {
            int counter = var1 + 1;
            HALTER_FLUFFY_BLOSSOM_MUTED.add(REGISTRY.register("halter_fluffy_blossom_muted_" + counter,
                    () -> new HalterItem("halter_fluffy_blossom_muted_" + counter, (new Item.Properties())
                          .stacksTo(16))
            ));
        }

        ENGLISH_BRIDLE_BLOSSOM = new ArrayList<>(); // 25 transport boots
        for(int var1 = 0; var1 < 2; ++var1) {
            int counter = var1 + 1;
        ENGLISH_BRIDLE_BLOSSOM.add(REGISTRY.register("english_bridle_blossom_" + counter,
                    () -> new EnglishBridleItem("english_bridle_blossom_" + counter, (new Item.Properties())
                            .stacksTo(16))
            ));
        }

        WESTERN_BRIDLE_BLOSSOM = new ArrayList<>(); // 25 transport boots
        for(int var1 = 0; var1 < 11; ++var1) {
            int counter = var1 + 1;
        WESTERN_BRIDLE_BLOSSOM.add(REGISTRY.register("western_bridle_blossom_" + counter,
                    () -> new WesternBridleItem("western_bridle_blossom_" + counter, (new Item.Properties())
                            .stacksTo(16))
            ));
        }

        WESTERN_GIRTH_BLOSSOM = new ArrayList<>(); // 25 transport boots
        for(int var1 = 0; var1 < 15; ++var1) {
            int counter = var1 + 1;
        WESTERN_GIRTH_BLOSSOM    .add(REGISTRY.register("western_girth_blossom_" + counter,
                    () -> new WesternGirthStrapItem("western_girth_blossom_" + counter, (new Item.Properties())
                            .stacksTo(16))
            ));
        }


        PROTECTION_BOOTS_BLOSSOM = new ArrayList<>(); // 25 transport boots
        for(int var1 = 0; var1 < 8; ++var1) {
            int counter = var1 + 1;
            PROTECTION_BOOTS_BLOSSOM.add(REGISTRY.register("protection_boots_blossom_" + counter,
                    () -> new AdventureLegWraps("protection_boots_blossom_" + counter, (new Item.Properties())
                            .stacksTo(16))
            ));
        }

        WESTERN_SADDLE_BLOSSOM = new ArrayList<>();
        for(int var1 = 0; var1 < 5; ++var1) {
            int counter = var1 + 1;
            WESTERN_SADDLE_BLOSSOM.add(REGISTRY.register("western_saddle_blossom_" + counter,
                    () -> new WesternSaddleItem("western_saddle_blossom_" + counter, (new Item.Properties())
                            .stacksTo(16))
            ));
        }

        ADVENTURE_SADDLE_BLOSSOM = new ArrayList<>();
        for(int var1 = 0; var1 < 4; ++var1) {
            int counter = var1 + 1;
            ADVENTURE_SADDLE_BLOSSOM.add(REGISTRY.register("adventure_saddle_blossom_" + counter,
                    () -> new AdventureSaddleItem("adventure_saddle_blossom_" + counter, (new Item.Properties())
                            .stacksTo(16))
            ));
        }

        ENGLISH_SADDLE_BLOSSOM = new ArrayList<>();
        for(int var1 = 0; var1 < 2; ++var1) {
            int counter = var1 + 1;
            ENGLISH_SADDLE_BLOSSOM.add(REGISTRY.register("english_saddle_blossom_" + counter,
                    () -> new EnglishSaddleItem("english_saddle_blossom_" + counter, (new Item.Properties())
                            .stacksTo(16))
                    ));
        }

        PASTURE_BLANKETS_NEON = new ArrayList<>(); // 49 pasture blankets
        for(int var1 = 0; var1 < 49; ++var1) {
            int counter = var1 + 1;
            PASTURE_BLANKETS_NEON.add(REGISTRY.register("pasture_blanket_neon_" + counter,
                    () -> new PastureBlanketItem(SWEMHorseArmorItem.HorseArmorTier.NONE, 0,
                            "pasture_blanket_neon_" + counter, (new Item.Properties())
                            .stacksTo(16))
            ));
        }

        ENGLISH_SHEEPSKIN_BLOSSOM = new ArrayList<>(); // 5 western sheepskins
        for(int var1 = 0; var1 < 5; ++var1) {
            int counter = var1 + 1;
            ENGLISH_SHEEPSKIN_BLOSSOM.add(REGISTRY.register("english_sheepskin_blossom_" + counter,
                    () -> new WesternBreastCollarItem("english_sheepskin_blossom_" + counter,
                            new Item.Properties()
                                    .stacksTo(16))
            ));
        }

        WESTERN_SHEEPSKIN_BLOSSOM = new ArrayList<>(); // 5 english sheepskins
        for(int var1 = 0; var1 < 5; ++var1) {
            int counter = var1 + 1;
            WESTERN_SHEEPSKIN_BLOSSOM.add(REGISTRY.register("western_sheepskin_blossom_" + counter,
                    () -> new WesternBreastCollarItem("western_sheepskin_blossom_" + counter,
                            new Item.Properties()
                                    .stacksTo(16))
            ));
        }
    }


}
