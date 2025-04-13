package net.ultimatech.bountifulbraces.block;

import net.mehvahdjukaar.supplementaries.common.block.blocks.FlippedBlock;
import net.mehvahdjukaar.supplementaries.common.block.blocks.FrameBlock;
import net.mehvahdjukaar.supplementaries.common.block.blocks.FrameBraceBlock;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.DyeColor;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredBlock;
import net.neoforged.neoforge.registries.DeferredRegister;
import net.ultimatech.bountifulbraces.BountifulBraces;
import net.ultimatech.bountifulbraces.item.BBItems;

import java.util.function.Supplier;

import static net.mehvahdjukaar.supplementaries.reg.ModRegistry.TIMBER_FRAME;

public class BBBlocks {

    public static final DeferredRegister.Blocks BLOCKS = DeferredRegister.createBlocks(BountifulBraces.MOD_ID);

    public static final DeferredBlock<Block> DAUB_FRAME_OAK = registerBlock("daub_frame_oak", () ->
            new Block(BlockBehaviour.Properties.of().sound(SoundType.PACKED_MUD).mapColor(DyeColor.WHITE).strength(1.5F, 3.0F)));

    public static final DeferredBlock<Block> DAUB_CROSS_BRACE_OAK = registerBlock("daub_cross_brace_oak", () ->
            new Block(BlockBehaviour.Properties.of().sound(SoundType.PACKED_MUD).mapColor(DyeColor.WHITE).strength(1.5F, 3.0F)));

    public static final DeferredBlock<Block> DAUB_BRACE_OAK = registerBlock("daub_brace_oak", () ->
            new FlippedBlock(BlockBehaviour.Properties.of().sound(SoundType.PACKED_MUD).mapColor(DyeColor.WHITE).strength(1.5F, 3.0F)));

    public static final DeferredBlock<Block> DAUB_FRAME_SPRUCE = registerBlock("daub_frame_spruce", () ->
            new Block(BlockBehaviour.Properties.of().sound(SoundType.PACKED_MUD).mapColor(DyeColor.WHITE).strength(1.5F, 3.0F)));

    public static final DeferredBlock<Block> DAUB_CROSS_BRACE_SPRUCE = registerBlock("daub_cross_brace_spruce", () ->
            new Block(BlockBehaviour.Properties.of().sound(SoundType.PACKED_MUD).mapColor(DyeColor.WHITE).strength(1.5F, 3.0F)));

    public static final DeferredBlock<Block> DAUB_BRACE_SPRUCE = registerBlock("daub_brace_spruce", () ->
            new FlippedBlock(BlockBehaviour.Properties.of().sound(SoundType.PACKED_MUD).mapColor(DyeColor.WHITE).strength(1.5F, 3.0F)));

    public static final DeferredBlock<Block> DAUB_FRAME_BIRCH = registerBlock("daub_frame_birch", () ->
            new Block(BlockBehaviour.Properties.of().sound(SoundType.PACKED_MUD).mapColor(DyeColor.WHITE).strength(1.5F, 3.0F)));

    public static final DeferredBlock<Block> DAUB_CROSS_BRACE_BIRCH = registerBlock("daub_cross_brace_birch", () ->
            new Block(BlockBehaviour.Properties.of().sound(SoundType.PACKED_MUD).mapColor(DyeColor.WHITE).strength(1.5F, 3.0F)));

    public static final DeferredBlock<Block> DAUB_BRACE_BIRCH = registerBlock("daub_brace_birch", () ->
            new FlippedBlock(BlockBehaviour.Properties.of().sound(SoundType.PACKED_MUD).mapColor(DyeColor.WHITE).strength(1.5F, 3.0F)));

    public static final DeferredBlock<Block> DAUB_FRAME_JUNGLE = registerBlock("daub_frame_jungle", () ->
            new Block(BlockBehaviour.Properties.of().sound(SoundType.PACKED_MUD).mapColor(DyeColor.WHITE).strength(1.5F, 3.0F)));

    public static final DeferredBlock<Block> DAUB_CROSS_BRACE_JUNGLE = registerBlock("daub_cross_brace_jungle", () ->
            new Block(BlockBehaviour.Properties.of().sound(SoundType.PACKED_MUD).mapColor(DyeColor.WHITE).strength(1.5F, 3.0F)));

    public static final DeferredBlock<Block> DAUB_BRACE_JUNGLE = registerBlock("daub_brace_jungle", () ->
            new FlippedBlock(BlockBehaviour.Properties.of().sound(SoundType.PACKED_MUD).mapColor(DyeColor.WHITE).strength(1.5F, 3.0F)));

    public static final DeferredBlock<Block> DAUB_FRAME_ACACIA = registerBlock("daub_frame_acacia", () ->
            new Block(BlockBehaviour.Properties.of().sound(SoundType.PACKED_MUD).mapColor(DyeColor.WHITE).strength(1.5F, 3.0F)));

    public static final DeferredBlock<Block> DAUB_CROSS_BRACE_ACACIA = registerBlock("daub_cross_brace_acacia", () ->
            new Block(BlockBehaviour.Properties.of().sound(SoundType.PACKED_MUD).mapColor(DyeColor.WHITE).strength(1.5F, 3.0F)));

    public static final DeferredBlock<Block> DAUB_BRACE_ACACIA = registerBlock("daub_brace_acacia", () ->
            new FlippedBlock(BlockBehaviour.Properties.of().sound(SoundType.PACKED_MUD).mapColor(DyeColor.WHITE).strength(1.5F, 3.0F)));

    public static final DeferredBlock<Block> DAUB_FRAME_DARK_OAK = registerBlock("daub_frame_dark_oak", () ->
            new Block(BlockBehaviour.Properties.of().sound(SoundType.PACKED_MUD).mapColor(DyeColor.WHITE).strength(1.5F, 3.0F)));

    public static final DeferredBlock<Block> DAUB_CROSS_BRACE_DARK_OAK = registerBlock("daub_cross_brace_dark_oak", () ->
            new Block(BlockBehaviour.Properties.of().sound(SoundType.PACKED_MUD).mapColor(DyeColor.WHITE).strength(1.5F, 3.0F)));

    public static final DeferredBlock<Block> DAUB_BRACE_DARK_OAK = registerBlock("daub_brace_dark_oak", () ->
            new FlippedBlock(BlockBehaviour.Properties.of().sound(SoundType.PACKED_MUD).mapColor(DyeColor.WHITE).strength(1.5F, 3.0F)));

    public static final DeferredBlock<Block> DAUB_FRAME_MANGROVE = registerBlock("daub_frame_mangrove", () ->
            new Block(BlockBehaviour.Properties.of().sound(SoundType.PACKED_MUD).mapColor(DyeColor.WHITE).strength(1.5F, 3.0F)));

    public static final DeferredBlock<Block> DAUB_CROSS_BRACE_MANGROVE = registerBlock("daub_cross_brace_mangrove", () ->
            new Block(BlockBehaviour.Properties.of().sound(SoundType.PACKED_MUD).mapColor(DyeColor.WHITE).strength(1.5F, 3.0F)));

    public static final DeferredBlock<Block> DAUB_BRACE_MANGROVE = registerBlock("daub_brace_mangrove", () ->
            new FlippedBlock(BlockBehaviour.Properties.of().sound(SoundType.PACKED_MUD).mapColor(DyeColor.WHITE).strength(1.5F, 3.0F)));

    public static final DeferredBlock<Block> DAUB_FRAME_CHERRY = registerBlock("daub_frame_cherry", () ->
            new Block(BlockBehaviour.Properties.of().sound(SoundType.PACKED_MUD).mapColor(DyeColor.WHITE).strength(1.5F, 3.0F)));

    public static final DeferredBlock<Block> DAUB_CROSS_BRACE_CHERRY = registerBlock("daub_cross_brace_cherry", () ->
            new Block(BlockBehaviour.Properties.of().sound(SoundType.PACKED_MUD).mapColor(DyeColor.WHITE).strength(1.5F, 3.0F)));

    public static final DeferredBlock<Block> DAUB_BRACE_CHERRY = registerBlock("daub_brace_cherry", () ->
            new FlippedBlock(BlockBehaviour.Properties.of().sound(SoundType.PACKED_MUD).mapColor(DyeColor.WHITE).strength(1.5F, 3.0F)));

    public static final DeferredBlock<Block> DAUB_FRAME_BAMBOO = registerBlock("daub_frame_bamboo", () ->
            new Block(BlockBehaviour.Properties.of().sound(SoundType.PACKED_MUD).mapColor(DyeColor.WHITE).strength(1.5F, 3.0F)));

    public static final DeferredBlock<Block> DAUB_CROSS_BRACE_BAMBOO = registerBlock("daub_cross_brace_bamboo", () ->
            new Block(BlockBehaviour.Properties.of().sound(SoundType.PACKED_MUD).mapColor(DyeColor.WHITE).strength(1.5F, 3.0F)));

    public static final DeferredBlock<Block> DAUB_BRACE_BAMBOO = registerBlock("daub_brace_bamboo", () ->
            new FlippedBlock(BlockBehaviour.Properties.of().sound(SoundType.PACKED_MUD).mapColor(DyeColor.WHITE).strength(1.5F, 3.0F)));

    public static final DeferredBlock<Block> DAUB_FRAME_CRIMSON = registerBlock("daub_frame_crimson", () ->
            new Block(BlockBehaviour.Properties.of().sound(SoundType.PACKED_MUD).mapColor(DyeColor.WHITE).strength(1.5F, 3.0F)));

    public static final DeferredBlock<Block> DAUB_CROSS_BRACE_CRIMSON = registerBlock("daub_cross_brace_crimson", () ->
            new Block(BlockBehaviour.Properties.of().sound(SoundType.PACKED_MUD).mapColor(DyeColor.WHITE).strength(1.5F, 3.0F)));

    public static final DeferredBlock<Block> DAUB_BRACE_CRIMSON = registerBlock("daub_brace_crimson", () ->
            new FlippedBlock(BlockBehaviour.Properties.of().sound(SoundType.PACKED_MUD).mapColor(DyeColor.WHITE).strength(1.5F, 3.0F)));

    public static final DeferredBlock<Block> DAUB_FRAME_WARPED = registerBlock("daub_frame_warped", () ->
            new Block(BlockBehaviour.Properties.of().sound(SoundType.PACKED_MUD).mapColor(DyeColor.WHITE).strength(1.5F, 3.0F)));

    public static final DeferredBlock<Block> DAUB_CROSS_BRACE_WARPED = registerBlock("daub_cross_brace_warped", () ->
            new Block(BlockBehaviour.Properties.of().sound(SoundType.PACKED_MUD).mapColor(DyeColor.WHITE).strength(1.5F, 3.0F)));

    public static final DeferredBlock<Block> DAUB_BRACE_WARPED = registerBlock("daub_brace_warped", () ->
            new FlippedBlock(BlockBehaviour.Properties.of().sound(SoundType.PACKED_MUD).mapColor(DyeColor.WHITE).strength(1.5F, 3.0F)));

    public static final DeferredBlock<Block> DAUB_FRAME_PALE_OAK = registerBlock("daub_frame_pale_oak", () ->
            new Block(BlockBehaviour.Properties.of().sound(SoundType.PACKED_MUD).mapColor(DyeColor.WHITE).strength(1.5F, 3.0F)));

    public static final DeferredBlock<Block> DAUB_CROSS_BRACE_PALE_OAK = registerBlock("daub_cross_brace_pale_oak", () ->
            new Block(BlockBehaviour.Properties.of().sound(SoundType.PACKED_MUD).mapColor(DyeColor.WHITE).strength(1.5F, 3.0F)));

    public static final DeferredBlock<Block> DAUB_BRACE_PALE_OAK = registerBlock("daub_brace_pale_oak", () ->
            new FlippedBlock(BlockBehaviour.Properties.of().sound(SoundType.PACKED_MUD).mapColor(DyeColor.WHITE).strength(1.5F, 3.0F)));

    public static final DeferredBlock<Block> TIMBER_FRAME_OAK = registerBlock("timber_frame_oak", () ->
            new FrameBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_PLANKS).strength(0.1F, 0.0F).noCollission().instabreak().sound(SoundType.SCAFFOLDING)));

    public static final DeferredBlock<Block> TIMBER_CROSS_BRACE_OAK = registerBlock("timber_cross_brace_oak", () ->
            new FrameBlock(BlockBehaviour.Properties.ofFullCopy(TIMBER_FRAME.get())));

    public static final DeferredBlock<Block> TIMBER_BRACE_OAK = registerBlock("timber_brace_oak", () ->
            new FrameBraceBlock(BlockBehaviour.Properties.ofFullCopy(TIMBER_FRAME.get())));

    public static final DeferredBlock<Block> TIMBER_FRAME_SPRUCE = registerBlock("timber_frame_spruce", () ->
            new FrameBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_PLANKS).strength(0.1F, 0.0F).noCollission().instabreak().sound(SoundType.SCAFFOLDING)));

    public static final DeferredBlock<Block> TIMBER_CROSS_BRACE_SPRUCE = registerBlock("timber_cross_brace_spruce", () ->
            new FrameBlock(BlockBehaviour.Properties.ofFullCopy(TIMBER_FRAME.get())));

    public static final DeferredBlock<Block> TIMBER_BRACE_SPRUCE = registerBlock("timber_brace_spruce", () ->
            new FrameBraceBlock(BlockBehaviour.Properties.ofFullCopy(TIMBER_FRAME.get())));

    public static final DeferredBlock<Block> TIMBER_FRAME_BIRCH = registerBlock("timber_frame_birch", () ->
            new FrameBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_PLANKS).strength(0.1F, 0.0F).noCollission().instabreak().sound(SoundType.SCAFFOLDING)));

    public static final DeferredBlock<Block> TIMBER_CROSS_BRACE_BIRCH = registerBlock("timber_cross_brace_birch", () ->
            new FrameBlock(BlockBehaviour.Properties.ofFullCopy(TIMBER_FRAME.get())));

    public static final DeferredBlock<Block> TIMBER_BRACE_BIRCH = registerBlock("timber_brace_birch", () ->
            new FrameBraceBlock(BlockBehaviour.Properties.ofFullCopy(TIMBER_FRAME.get())));

    public static final DeferredBlock<Block> TIMBER_FRAME_JUNGLE = registerBlock("timber_frame_jungle", () ->
            new FrameBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_PLANKS).strength(0.1F, 0.0F).noCollission().instabreak().sound(SoundType.SCAFFOLDING)));

    public static final DeferredBlock<Block> TIMBER_CROSS_BRACE_JUNGLE = registerBlock("timber_cross_brace_jungle", () ->
            new FrameBlock(BlockBehaviour.Properties.ofFullCopy(TIMBER_FRAME.get())));

    public static final DeferredBlock<Block> TIMBER_BRACE_JUNGLE = registerBlock("timber_brace_jungle", () ->
            new FrameBraceBlock(BlockBehaviour.Properties.ofFullCopy(TIMBER_FRAME.get())));

    public static final DeferredBlock<Block> TIMBER_FRAME_ACACIA = registerBlock("timber_frame_acacia", () ->
            new FrameBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_PLANKS).strength(0.1F, 0.0F).noCollission().instabreak().sound(SoundType.SCAFFOLDING)));

    public static final DeferredBlock<Block> TIMBER_CROSS_BRACE_ACACIA = registerBlock("timber_cross_brace_acacia", () ->
            new FrameBlock(BlockBehaviour.Properties.ofFullCopy(TIMBER_FRAME.get())));

    public static final DeferredBlock<Block> TIMBER_BRACE_ACACIA = registerBlock("timber_brace_acacia", () ->
            new FrameBraceBlock(BlockBehaviour.Properties.ofFullCopy(TIMBER_FRAME.get())));

    public static final DeferredBlock<Block> TIMBER_FRAME_DARK_OAK = registerBlock("timber_frame_dark_oak", () ->
            new FrameBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_PLANKS).strength(0.1F, 0.0F).noCollission().instabreak().sound(SoundType.SCAFFOLDING)));

    public static final DeferredBlock<Block> TIMBER_CROSS_BRACE_DARK_OAK = registerBlock("timber_cross_brace_dark_oak", () ->
            new FrameBlock(BlockBehaviour.Properties.ofFullCopy(TIMBER_FRAME.get())));

    public static final DeferredBlock<Block> TIMBER_BRACE_DARK_OAK = registerBlock("timber_brace_dark_oak", () ->
            new FrameBraceBlock(BlockBehaviour.Properties.ofFullCopy(TIMBER_FRAME.get())));

    public static final DeferredBlock<Block> TIMBER_FRAME_MANGROVE = registerBlock("timber_frame_mangrove", () ->
            new FrameBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_PLANKS).strength(0.1F, 0.0F).noCollission().instabreak().sound(SoundType.SCAFFOLDING)));

    public static final DeferredBlock<Block> TIMBER_CROSS_BRACE_MANGROVE = registerBlock("timber_cross_brace_mangrove", () ->
            new FrameBlock(BlockBehaviour.Properties.ofFullCopy(TIMBER_FRAME.get())));

    public static final DeferredBlock<Block> TIMBER_BRACE_MANGROVE = registerBlock("timber_brace_mangrove", () ->
            new FrameBraceBlock(BlockBehaviour.Properties.ofFullCopy(TIMBER_FRAME.get())));

    public static final DeferredBlock<Block> TIMBER_FRAME_CHERRY = registerBlock("timber_frame_cherry", () ->
            new FrameBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_PLANKS).strength(0.1F, 0.0F).noCollission().instabreak().sound(SoundType.SCAFFOLDING)));

    public static final DeferredBlock<Block> TIMBER_CROSS_BRACE_CHERRY = registerBlock("timber_cross_brace_cherry", () ->
            new FrameBlock(BlockBehaviour.Properties.ofFullCopy(TIMBER_FRAME.get())));

    public static final DeferredBlock<Block> TIMBER_BRACE_CHERRY = registerBlock("timber_brace_cherry", () ->
            new FrameBraceBlock(BlockBehaviour.Properties.ofFullCopy(TIMBER_FRAME.get())));

    public static final DeferredBlock<Block> TIMBER_FRAME_BAMBOO = registerBlock("timber_frame_bamboo", () ->
            new FrameBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_PLANKS).strength(0.1F, 0.0F).noCollission().instabreak().sound(SoundType.SCAFFOLDING)));

    public static final DeferredBlock<Block> TIMBER_CROSS_BRACE_BAMBOO = registerBlock("timber_cross_brace_bamboo", () ->
            new FrameBlock(BlockBehaviour.Properties.ofFullCopy(TIMBER_FRAME.get())));

    public static final DeferredBlock<Block> TIMBER_BRACE_BAMBOO = registerBlock("timber_brace_bamboo", () ->
            new FrameBraceBlock(BlockBehaviour.Properties.ofFullCopy(TIMBER_FRAME.get())));

    public static final DeferredBlock<Block> TIMBER_FRAME_CRIMSON = registerBlock("timber_frame_crimson", () ->
            new FrameBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_PLANKS).strength(0.1F, 0.0F).noCollission().instabreak().sound(SoundType.SCAFFOLDING)));

    public static final DeferredBlock<Block> TIMBER_CROSS_BRACE_CRIMSON = registerBlock("timber_cross_brace_crimson", () ->
            new FrameBlock(BlockBehaviour.Properties.ofFullCopy(TIMBER_FRAME.get())));

    public static final DeferredBlock<Block> TIMBER_BRACE_CRIMSON = registerBlock("timber_brace_crimson", () ->
            new FrameBraceBlock(BlockBehaviour.Properties.ofFullCopy(TIMBER_FRAME.get())));

    public static final DeferredBlock<Block> TIMBER_FRAME_WARPED = registerBlock("timber_frame_warped", () ->
            new FrameBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_PLANKS).strength(0.1F, 0.0F).noCollission().instabreak().sound(SoundType.SCAFFOLDING)));

    public static final DeferredBlock<Block> TIMBER_CROSS_BRACE_WARPED = registerBlock("timber_cross_brace_warped", () ->
            new FrameBlock(BlockBehaviour.Properties.ofFullCopy(TIMBER_FRAME.get())));

    public static final DeferredBlock<Block> TIMBER_BRACE_WARPED = registerBlock("timber_brace_warped", () ->
            new FrameBraceBlock(BlockBehaviour.Properties.ofFullCopy(TIMBER_FRAME.get())));

    public static final DeferredBlock<Block> TIMBER_FRAME_PALE_OAK = registerBlock("timber_frame_pale_oak", () ->
            new FrameBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_PLANKS).strength(0.1F, 0.0F).noCollission().instabreak().sound(SoundType.SCAFFOLDING)));

    public static final DeferredBlock<Block> TIMBER_CROSS_BRACE_PALE_OAK = registerBlock("timber_cross_brace_pale_oak", () ->
            new FrameBlock(BlockBehaviour.Properties.ofFullCopy(TIMBER_FRAME.get())));

    public static final DeferredBlock<Block> TIMBER_BRACE_PALE_OAK = registerBlock("timber_brace_pale_oak", () ->
            new FrameBraceBlock(BlockBehaviour.Properties.ofFullCopy(TIMBER_FRAME.get())));


    // --- REGISTRATION ---

    private static <T extends Block> DeferredBlock<T> registerBlock(String name, Supplier<T> block) {
        DeferredBlock<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn);
        return toReturn;
    }

    private static <T extends Block> void registerBlockItem(String name, DeferredBlock<T> block) {
        BBItems.ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties()));
    }

    public static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);
    }
}
