package net.ultimatech.bountifulbraces.tab;

import net.minecraft.world.item.CreativeModeTabs;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.event.BuildCreativeModeTabContentsEvent;
import net.ultimatech.bountifulbraces.block.BBBlocks;

public class BBVanillaCreativeTabs {

    private static void addToTabBuildingBlocks(BuildCreativeModeTabContentsEvent event) {

        if (event.getTabKey() == CreativeModeTabs.BUILDING_BLOCKS) {

            event.accept(BBBlocks.DAUB_FRAME_OAK);
            event.accept(BBBlocks.DAUB_BRACE_OAK);
            event.accept(BBBlocks.DAUB_CROSS_BRACE_OAK);
            event.accept(BBBlocks.DAUB_FRAME_SPRUCE);
            event.accept(BBBlocks.DAUB_BRACE_SPRUCE);
            event.accept(BBBlocks.DAUB_CROSS_BRACE_SPRUCE);
            event.accept(BBBlocks.DAUB_FRAME_BIRCH);
            event.accept(BBBlocks.DAUB_BRACE_BIRCH);
            event.accept(BBBlocks.DAUB_CROSS_BRACE_BIRCH);
            event.accept(BBBlocks.DAUB_FRAME_JUNGLE);
            event.accept(BBBlocks.DAUB_BRACE_JUNGLE);
            event.accept(BBBlocks.DAUB_CROSS_BRACE_JUNGLE);
            event.accept(BBBlocks.DAUB_FRAME_ACACIA);
            event.accept(BBBlocks.DAUB_BRACE_ACACIA);
            event.accept(BBBlocks.DAUB_CROSS_BRACE_ACACIA);
            event.accept(BBBlocks.DAUB_FRAME_DARK_OAK);
            event.accept(BBBlocks.DAUB_BRACE_DARK_OAK);
            event.accept(BBBlocks.DAUB_CROSS_BRACE_DARK_OAK);
            event.accept(BBBlocks.DAUB_FRAME_MANGROVE);
            event.accept(BBBlocks.DAUB_BRACE_MANGROVE);
            event.accept(BBBlocks.DAUB_CROSS_BRACE_MANGROVE);
            event.accept(BBBlocks.DAUB_FRAME_CHERRY);
            event.accept(BBBlocks.DAUB_BRACE_CHERRY);
            event.accept(BBBlocks.DAUB_CROSS_BRACE_CHERRY);
            event.accept(BBBlocks.DAUB_FRAME_BAMBOO);
            event.accept(BBBlocks.DAUB_BRACE_BAMBOO);
            event.accept(BBBlocks.DAUB_CROSS_BRACE_BAMBOO);
            event.accept(BBBlocks.DAUB_FRAME_CRIMSON);
            event.accept(BBBlocks.DAUB_BRACE_CRIMSON);
            event.accept(BBBlocks.DAUB_CROSS_BRACE_CRIMSON);
            event.accept(BBBlocks.DAUB_FRAME_WARPED);
            event.accept(BBBlocks.DAUB_BRACE_WARPED);
            event.accept(BBBlocks.DAUB_CROSS_BRACE_WARPED);
            event.accept(BBBlocks.DAUB_FRAME_PALE_OAK);
            event.accept(BBBlocks.DAUB_BRACE_PALE_OAK);
            event.accept(BBBlocks.DAUB_CROSS_BRACE_PALE_OAK);
        }
    }

    private static void addToTabFunctionalBlocks(BuildCreativeModeTabContentsEvent event) {

        if (event.getTabKey() == CreativeModeTabs.FUNCTIONAL_BLOCKS) {

            event.accept(BBBlocks.TIMBER_FRAME_OAK);
            event.accept(BBBlocks.TIMBER_BRACE_OAK);
            event.accept(BBBlocks.TIMBER_CROSS_BRACE_OAK);
            event.accept(BBBlocks.TIMBER_FRAME_SPRUCE);
            event.accept(BBBlocks.TIMBER_BRACE_SPRUCE);
            event.accept(BBBlocks.TIMBER_CROSS_BRACE_SPRUCE);
            event.accept(BBBlocks.TIMBER_FRAME_BIRCH);
            event.accept(BBBlocks.TIMBER_BRACE_BIRCH);
            event.accept(BBBlocks.TIMBER_CROSS_BRACE_BIRCH);
            event.accept(BBBlocks.TIMBER_FRAME_JUNGLE);
            event.accept(BBBlocks.TIMBER_BRACE_JUNGLE);
            event.accept(BBBlocks.TIMBER_CROSS_BRACE_JUNGLE);
            event.accept(BBBlocks.TIMBER_FRAME_ACACIA);
            event.accept(BBBlocks.TIMBER_BRACE_ACACIA);
            event.accept(BBBlocks.TIMBER_CROSS_BRACE_ACACIA);
            event.accept(BBBlocks.TIMBER_FRAME_DARK_OAK);
            event.accept(BBBlocks.TIMBER_BRACE_DARK_OAK);
            event.accept(BBBlocks.TIMBER_CROSS_BRACE_DARK_OAK);
            event.accept(BBBlocks.TIMBER_FRAME_MANGROVE);
            event.accept(BBBlocks.TIMBER_BRACE_MANGROVE);
            event.accept(BBBlocks.TIMBER_CROSS_BRACE_MANGROVE);
            event.accept(BBBlocks.TIMBER_FRAME_CHERRY);
            event.accept(BBBlocks.TIMBER_BRACE_CHERRY);
            event.accept(BBBlocks.TIMBER_CROSS_BRACE_CHERRY);
            event.accept(BBBlocks.TIMBER_FRAME_BAMBOO);
            event.accept(BBBlocks.TIMBER_BRACE_BAMBOO);
            event.accept(BBBlocks.TIMBER_CROSS_BRACE_BAMBOO);
            event.accept(BBBlocks.TIMBER_FRAME_CRIMSON);
            event.accept(BBBlocks.TIMBER_BRACE_CRIMSON);
            event.accept(BBBlocks.TIMBER_CROSS_BRACE_CRIMSON);
            event.accept(BBBlocks.TIMBER_FRAME_WARPED);
            event.accept(BBBlocks.TIMBER_BRACE_WARPED);
            event.accept(BBBlocks.TIMBER_CROSS_BRACE_WARPED);
            event.accept(BBBlocks.TIMBER_FRAME_PALE_OAK);
            event.accept(BBBlocks.TIMBER_BRACE_PALE_OAK);
            event.accept(BBBlocks.TIMBER_CROSS_BRACE_PALE_OAK);
        }
    }

    public static void register(IEventBus modEventBus) {
        modEventBus.addListener(BBVanillaCreativeTabs::addToTabBuildingBlocks);
        modEventBus.addListener(BBVanillaCreativeTabs::addToTabFunctionalBlocks);
    }
}
