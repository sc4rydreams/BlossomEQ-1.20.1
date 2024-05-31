package net.sc4rydreams.blossomeq;

import com.google.common.eventbus.EventBus;
import com.mojang.logging.LogUtils;
import net.minecraft.client.Minecraft;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.BuildCreativeModeTabContentsEvent;
import net.minecraftforge.event.server.ServerStartingEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.sc4rydreams.blossomeq.block.BlossomBlocks;
import net.sc4rydreams.blossomeq.item.BlossomCreativeModeTabs;
import net.sc4rydreams.blossomeq.item.Blossomitems;
import org.slf4j.Logger;

@Mod(BlossomEq.MOD_ID)
public class BlossomEq
{
    public static final String MOD_ID = "blossomeq";
    private static final Logger LOGGER = LogUtils.getLogger();


    public BlossomEq() {
        IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();


        BlossomCreativeModeTabs.register(modEventBus);
        Blossomitems.register(modEventBus);
        BlossomBlocks.register(modEventBus);
        modEventBus.addListener(this::commonSetup);

        MinecraftForge.EVENT_BUS.register(this);
        modEventBus.addListener(this::addCreative);
    }

    private void commonSetup(final FMLCommonSetupEvent event) {

    }

    // Add the example block item to the building blocks tab
    private void addCreative(BuildCreativeModeTabContentsEvent event) {

    }

    @SubscribeEvent
    public void onServerStarting(ServerStartingEvent event) {

    }
    @Mod.EventBusSubscriber(modid = MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
    public static class ClientModEvents {
        @SubscribeEvent
        public static void onClientSetup(FMLClientSetupEvent event) {
            LOGGER.info("HELLO FROM BLOSSOM CLIENT SETUP");
            LOGGER.info("MINECRAFT NAME >> {}", Minecraft.getInstance().getUser().getName());
        }
    }
}
