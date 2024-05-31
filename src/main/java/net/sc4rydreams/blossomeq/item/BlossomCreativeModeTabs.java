package net.sc4rydreams.blossomeq.item;

import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;
import net.sc4rydreams.blossomeq.BlossomEq;
import net.sc4rydreams.blossomeq.block.BlossomBlocks;
import net.sc4rydreams.blossomeq.registry.BlossomTackItems;

import java.awt.*;


public class BlossomCreativeModeTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, BlossomEq.MOD_ID);

    public static final RegistryObject<CreativeModeTab> BLOSSOM_EQ_TAB = CREATIVE_MODE_TABS.register("blossom_eq_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(Blossomitems.CHERRY_BLOSSOM.get()))
                    .title(Component.translatable("creativetab.blossomeq_tab"))
                    .displayItems((pParameters, pOutput)-> {
                        pOutput.accept(Blossomitems.CHERRY_BLOSSOM.get());
                        pOutput.accept(Blossomitems.CHERRY_BLOSSOM_2.get());
                        pOutput.accept(Blossomitems.CHERRY_BLOSSOM_3.get());
                        pOutput.accept(Blossomitems.CHERRY_BLOSSOM_4.get());
                        pOutput.accept(Blossomitems.CHERRY_BLOSSOM_5.get());
                        pOutput.accept(Blossomitems.CHERRY_BLOSSOM_6.get());
                        pOutput.accept(Blossomitems.CHERRY_BLOSSOM_7.get());
                        pOutput.accept(Blossomitems.CHERRY_BLOSSOM_8.get());
                        pOutput.accept(Blossomitems.HALTER_TAB.get());
                        pOutput.accept(Blossomitems.HALTER_FLUFFY_TAB.get());
                        pOutput.accept(Blossomitems.WHIP_1.get());
                        pOutput.accept(Blossomitems.WHIP_2.get());
                        pOutput.accept(Blossomitems.WHIP_DRESSAGE.get());
                        pOutput.accept(Blossomitems.WHIP_LUNGING.get());





                    })
                    .build());



    public static final RegistryObject<CreativeModeTab> BLOSSOM_EQ_TAB_BLOCKS = CREATIVE_MODE_TABS.register("blossomeq_tab_blocks",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(Blossomitems.CHERRY_BLOSSOM_2.get()))
                    .title(Component.translatable("creativetab.blossomeq_tab_blocks"))
                    .displayItems((pParameters, pOutput)-> {

                        pOutput.accept(BlossomBlocks.SAND_AQUA_BLOCK.get());
                        pOutput.accept(BlossomBlocks.SAND_ASH_BLOCK.get());
                        pOutput.accept(BlossomBlocks.SAND_BEACH_BLOCK.get());
                        pOutput.accept(BlossomBlocks.SAND_BISCUIT_BLOCK.get());
                        pOutput.accept(BlossomBlocks.SAND_BLACK_BLOCK.get());
                        pOutput.accept(BlossomBlocks.SAND_BROWN_BLOCK.get());
                        pOutput.accept(BlossomBlocks.SAND_BUFF_BLOCK.get());
                        pOutput.accept(BlossomBlocks.SAND_CACAO_BLOCK.get());
                        pOutput.accept(BlossomBlocks.SAND_CARAMEL_BLOCK.get());
                        pOutput.accept(BlossomBlocks.SAND_CEDAR_BLOCK.get());
                        pOutput.accept(BlossomBlocks.SAND_CHERRY_BLOCK.get());
                        pOutput.accept(BlossomBlocks.SAND_CHESTNUT_BLOCK.get());
                        pOutput.accept(BlossomBlocks.SAND_CLAY_BLOCK.get());
                        pOutput.accept(BlossomBlocks.SAND_COFFEE_BLOCK.get());
                        pOutput.accept(BlossomBlocks.SAND_COPPER_BLOCK.get());
                        pOutput.accept(BlossomBlocks.SAND_CRAY_BLOCK.get());
                        pOutput.accept(BlossomBlocks.SAND_GRAY_BLOCK.get());
                        pOutput.accept(BlossomBlocks.SAND_GRAYGE_BLOCK.get());
                        pOutput.accept(BlossomBlocks.SAND_IVORY_BLOCK.get());
                        pOutput.accept(BlossomBlocks.SAND_LATTE_BLOCK.get());
                        pOutput.accept(BlossomBlocks.SAND_LILAC_BLOCK.get());
                        pOutput.accept(BlossomBlocks.SAND_MOCHA_BLOCK.get());
                        pOutput.accept(BlossomBlocks.SAND_OAT_BLOCK.get());
                        pOutput.accept(BlossomBlocks.SAND_OCEAN_BLOCK.get());
                        pOutput.accept(BlossomBlocks.SAND_ORANGE_BLOCK.get());
                        pOutput.accept(BlossomBlocks.SAND_PALE_BLOCK.get());
                        pOutput.accept(BlossomBlocks.SAND_PEANUT_BLOCK.get());
                        pOutput.accept(BlossomBlocks.SAND_PENNY_BLOCK.get());
                        pOutput.accept(BlossomBlocks.SAND_PINE_BLOCK.get());
                        pOutput.accept(BlossomBlocks.SAND_RUSSEL_BLOCK.get());
                        pOutput.accept(BlossomBlocks.SAND_RUSSET_BLOCK.get());
                        pOutput.accept(BlossomBlocks.SAND_SADDLE_BLOCK.get());
                        pOutput.accept(BlossomBlocks.SAND_SEPIA_BLOCK.get());
                        pOutput.accept(BlossomBlocks.SAND_SUGAR_BLOCK.get());
                        pOutput.accept(BlossomBlocks.SAND_SYRUP_BLOCK.get());
                        pOutput.accept(BlossomBlocks.SAND_TAN_BLOCK.get());
                        pOutput.accept(BlossomBlocks.SAND_TANNY_BLOCK.get());
                        pOutput.accept(BlossomBlocks.SAND_TAUPE_BLOCK.get());
                        pOutput.accept(BlossomBlocks.SAND_TAWNY_BLOCK.get());
                        pOutput.accept(BlossomBlocks.SAND_TERRACOTTA_BLOCK.get());
                        pOutput.accept(BlossomBlocks.SAND_TOFFEE_BLOCK.get());
                        pOutput.accept(BlossomBlocks.SAND_UMBER_BLOCK.get());
                        pOutput.accept(BlossomBlocks.SAND_WALNUT_BLOCK.get());
                        pOutput.accept(BlossomBlocks.SAND_WENGE_BLOCK.get());
                        pOutput.accept(BlossomBlocks.SAND_WOOD_BLOCK.get());
                        pOutput.accept(BlossomBlocks.SANDSTONE_AQUA_BLOCK.get());
                        pOutput.accept(BlossomBlocks.SANDSTONE_ASH_BLOCK.get());
                        pOutput.accept(BlossomBlocks.SANDSTONE_BEACH_BLOCK.get());
                        pOutput.accept(BlossomBlocks.SANDSTONE_BISCUIT_BLOCK.get());
                        pOutput.accept(BlossomBlocks.SANDSTONE_BLACK_BLOCK.get());
                        pOutput.accept(BlossomBlocks.SANDSTONE_BUFF_BLOCK.get());
                        pOutput.accept(BlossomBlocks.SANDSTONE_BROWN_BLOCK.get());
                        pOutput.accept(BlossomBlocks.SANDSTONE_CACAO_BLOCK.get());
                        pOutput.accept(BlossomBlocks.SANDSTONE_CARAMEL_BLOCK.get());
                        pOutput.accept(BlossomBlocks.SANDSTONE_CEDAR_BLOCK.get());
                        pOutput.accept(BlossomBlocks.SANDSTONE_CHERRY_BLOCK.get());
                        pOutput.accept(BlossomBlocks.SANDSTONE_CHESTNUT_BLOCK.get());
                        pOutput.accept(BlossomBlocks.SANDSTONE_CLAY_BLOCK.get());
                        pOutput.accept(BlossomBlocks.SANDSTONE_COFFEE_BLOCK.get());
                        pOutput.accept(BlossomBlocks.SANDSTONE_COPPER_BLOCK.get());
                        pOutput.accept(BlossomBlocks.SANDSTONE_CRAY_BLOCK.get());
                        pOutput.accept(BlossomBlocks.SANDSTONE_GRAY_BLOCK.get());
                        pOutput.accept(BlossomBlocks.SANDSTONE_GRAYGE_BLOCK.get());
                        pOutput.accept(BlossomBlocks.SANDSTONE_IVORY_BLOCK.get());
                        pOutput.accept(BlossomBlocks.SANDSTONE_LATTE_BLOCK.get());
                        pOutput.accept(BlossomBlocks.SANDSTONE_LILAC_BLOCK.get());
                        pOutput.accept(BlossomBlocks.SANDSTONE_MOCHA_BLOCK.get());
                        pOutput.accept(BlossomBlocks.SANDSTONE_OAT_BLOCK.get());
                        pOutput.accept(BlossomBlocks.SANDSTONE_OCEAN_BLOCK.get());
                        pOutput.accept(BlossomBlocks.SANDSTONE_ORANGE_BLOCK.get());
                        pOutput.accept(BlossomBlocks.SANDSTONE_PALE_BLOCK.get());
                        pOutput.accept(BlossomBlocks.SANDSTONE_PEANUT_BLOCK.get());
                        pOutput.accept(BlossomBlocks.SANDSTONE_PENNY_BLOCK.get());
                        pOutput.accept(BlossomBlocks.SANDSTONE_PINE_BLOCK.get());
                        pOutput.accept(BlossomBlocks.SANDSTONE_RUSSEL_BLOCK.get());
                        pOutput.accept(BlossomBlocks.SANDSTONE_RUSSET_BLOCK.get());
                        pOutput.accept(BlossomBlocks.SANDSTONE_SADDLE_BLOCK.get());
                        pOutput.accept(BlossomBlocks.SANDSTONE_SEPIA_BLOCK.get());
                        pOutput.accept(BlossomBlocks.SANDSTONE_SUGAR_BLOCK.get());
                        pOutput.accept(BlossomBlocks.SANDSTONE_SYRUP_BLOCK.get());
                        pOutput.accept(BlossomBlocks.SANDSTONE_TAN_BLOCK.get());
                        pOutput.accept(BlossomBlocks.SANDSTONE_TANNY_BLOCK.get());
                        pOutput.accept(BlossomBlocks.SANDSTONE_TAUPE_BLOCK.get());
                        pOutput.accept(BlossomBlocks.SANDSTONE_TAWNY_BLOCK.get());
                        pOutput.accept(BlossomBlocks.SANDSTONE_TERRACOTTA_BLOCK.get());
                        pOutput.accept(BlossomBlocks.SANDSTONE_TOFFEE_BLOCK.get());
                        pOutput.accept(BlossomBlocks.SANDSTONE_UMBER_BLOCK.get());
                        pOutput.accept(BlossomBlocks.SANDSTONE_WALNUT_BLOCK.get());
                        pOutput.accept(BlossomBlocks.SANDSTONE_WENGE_BLOCK.get());
                        pOutput.accept(BlossomBlocks.SANDSTONE_WOOD_BLOCK.get());
                        

                    })
                    .build());
//
//    public static final RegistryObject<CreativeModeTab> BLOSSOM_EQ_TAB_SADDLEPADS = CREATIVE_MODE_TABS.register("blossomeq_tab_saddlepads",
//            () -> CreativeModeTab.builder().icon(() -> new ItemStack(Blossomitems.CHERRY_BLOSSOM_6.get()))
//                    .title(Component.translatable("creativetab.blossomeq_tab_saddlepads"))
//                    .displayItems((pParameters, pOutput)-> {
//
//
//                    })
//                    .build());
//
//    public static final RegistryObject<CreativeModeTab> BLOSSOM_EQ_TAB_HALTERS = CREATIVE_MODE_TABS.register("blossomeq_tab_halters",
//            () -> CreativeModeTab.builder().icon(() -> new ItemStack(Blossomitems.HALTER_TAB.get()))
//                    .title(Component.translatable("creativetab.blossomeq_tab_halters"))
//                    .displayItems((pParameters, pOutput)-> {
//
//
//                    })
//                    .build());
//
//    public static final RegistryObject<CreativeModeTab> BLOSSOM_EQ_TAB_FLUFFY_HALTERS = CREATIVE_MODE_TABS.register("blossomeq_tab_fluffy_halters",
//            () -> CreativeModeTab.builder().icon(() -> new ItemStack(Blossomitems.HALTER_FLUFFY_TAB.get()))
//                    .title(Component.translatable("creativetab.blossomeq_tab_fluffy_halters"))
//                    .displayItems((pParameters, pOutput)-> {
//
//
//                    })
//                    .build());
//
//    public static final RegistryObject<CreativeModeTab> BLOSSOM_EQ_TAB_PBLANKETS = CREATIVE_MODE_TABS.register("blossomeq_tab_pblankets",
//            () -> CreativeModeTab.builder().icon(() -> new ItemStack(Blossomitems.CHERRY_BLOSSOM_5.get()))
//                    .title(Component.translatable("creativetab.blossomeq_tab_pblankets"))
//                    .displayItems((pParameters, pOutput)-> {
//
//                        pOutput.accept(BlossomTackItems.PASTURE_BLANKET_QUILTED_WHITE.get());
//                        pOutput.accept(BlossomTackItems.PASTURE_BLANKET_QUILTED_BLACK.get());
//                        pOutput.accept(BlossomTackItems.PASTURE_BLANKET_QUILTED_BROWN.get());
//                        pOutput.accept(BlossomTackItems.PASTURE_BLANKET_QUILTED_WHITE.get());
//                        pOutput.accept(BlossomTackItems.PASTURE_BLANKET_QUILTED_WHITE.get());
//                        pOutput.accept(BlossomTackItems.PASTURE_BLANKET_QUILTED_WHITE.get());
//                        pOutput.accept(BlossomTackItems.PASTURE_BLANKET_QUILTED_WHITE.get());
//                        pOutput.accept(BlossomTackItems.PASTURE_BLANKET_QUILTED_WHITE.get());
//                        pOutput.accept(BlossomTackItems.PASTURE_BLANKET_QUILTED_WHITE.get());
//                        pOutput.accept(BlossomTackItems.PASTURE_BLANKET_QUILTED_WHITE.get());
//
//                    })
//                    .build());



    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }
}
//
//        }
//    };
//        public static final CreativeModeTab BLOSSOM_EQ_TAB_BLOCKS = new CreativeModeTab("blossom_eq_tab_blocks") {
//            @Override
//            public ItemStack makeIcon() {
//                return new ItemStack(Blossomitems.CHERRY_BLOSSOM_2.get());
//
//
//            }
//        };
//
//    public static final CreativeModeTab BLOSSOM_EQ_TAB_SADDLEPADS = new CreativeModeTab("blossom_eq_tab_saddlepads") {
//        @Override
//        public ItemStack makeIcon() {
//            return new ItemStack(Blossomitems.CHERRY_BLOSSOM_6.get());
//
//
//        }
//    };
//    public static final CreativeModeTab BLOSSOM_EQ_TAB_PBLANKETS = new CreativeModeTab("blossom_eq_tab_pastureblankets") {
//        @Override
//        public ItemStack makeIcon() {
//            return new ItemStack(Blossomitems.CHERRY_BLOSSOM_5.get());
//
//
//        }
//    };
////    public static final CreativeModeTab BLOSSOM_EQ_TAB_WBLANKETS = new CreativeModeTab("blossom_eq_tab_winterblankets") {
////        @Override
////        public ItemStack makeIcon() {
////            return new ItemStack(Blossomitems.CHERRY_BLOSSOM_4.get());
////
////
////        }
////    };
////    public static final CreativeModeTab BLOSSOM_EQ_TAB_LEGWRAPS = new CreativeModeTab("blossom_eq_tab_legwraps") {
////        @Override
////        public ItemStack makeIcon() {
////            return new ItemStack(Blossomitems.CHERRY_BLOSSOM_3.get());
////
////
////        }
////    };
//     public static final CreativeModeTab BLOSSOM_EQ_TAB_HALTERS = new CreativeModeTab("blossom_eq_tab_halters") {
//       @Override
//      public ItemStack makeIcon() {
//        return new ItemStack(Blossomitems.HALTER_TAB.get());
//
//
//         }
//    };
//
//    public static final CreativeModeTab BLOSSOM_EQ_TAB_FLUFFY_HALTERS = new CreativeModeTab("blossom_eq_tab_fluffy_halters") {
//        @Override
//        public ItemStack makeIcon() {
//            return new ItemStack(Blossomitems.HALTER_FLUFFY_TAB.get());


