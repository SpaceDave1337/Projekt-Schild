package spacedave.davesignco.block;

import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import spacedave.davesignco.DaveSignCo;

import java.util.ArrayList;
import java.util.List;

public class DSCBlocks {

    public static List<Block> cutoutBlocks = new ArrayList<>();
    public static List<Block> basicBlocks = new ArrayList<>();
    public static List<Block> classicBlocks = new ArrayList<>();
    public static List<Block> stvoBlocks = new ArrayList<>();

    public static final BasicSignBlock CLASSIC_ALARM_BLOCK = registerBasicSignBlock("classic_alarm_block", new BasicSignBlock(FabricBlockSettings.copyOf(Blocks.IRON_BLOCK).noCollision().nonOpaque().collidable(false)), true, classicBlocks);
    public static final BasicSignBlock CLASSIC_ARROW_BACK_BLOCK = registerBasicSignBlock("classic_arrow_back_block", new BasicSignBlock(FabricBlockSettings.copyOf(Blocks.IRON_BLOCK).noCollision().nonOpaque().collidable(false)), true, classicBlocks);
    public static final BasicSignBlock CLASSIC_ARROW_DOWN_BLOCK = registerBasicSignBlock("classic_arrow_down_block", new BasicSignBlock(FabricBlockSettings.copyOf(Blocks.IRON_BLOCK).noCollision().nonOpaque().collidable(false)), true, classicBlocks);
    public static final BasicSignBlock CLASSIC_ARROW_LEFT_BLOCK = registerBasicSignBlock("classic_arrow_left_block", new BasicSignBlock(FabricBlockSettings.copyOf(Blocks.IRON_BLOCK).noCollision().nonOpaque().collidable(false)), true, classicBlocks);
    public static final BasicSignBlock CLASSIC_ARROW_RIGHT_BLOCK = registerBasicSignBlock("classic_arrow_right_block", new BasicSignBlock(FabricBlockSettings.copyOf(Blocks.IRON_BLOCK).noCollision().nonOpaque().collidable(false)), true, classicBlocks);
    public static final BasicSignBlock CLASSIC_ARROW_UP_BLOCK = registerBasicSignBlock("classic_arrow_up_block", new BasicSignBlock(FabricBlockSettings.copyOf(Blocks.IRON_BLOCK).noCollision().nonOpaque().collidable(false)), true, classicBlocks);
    public static final BasicSignBlock CLASSIC_BIOHAZARD_BLOCK = registerBasicSignBlock("classic_biohazard_block", new BasicSignBlock(FabricBlockSettings.copyOf(Blocks.IRON_BLOCK).noCollision().nonOpaque().collidable(false)), true, classicBlocks);
    public static final BasicSignBlock CLASSIC_DANGER_BLOCK = registerBasicSignBlock("classic_danger_block", new BasicSignBlock(FabricBlockSettings.copyOf(Blocks.IRON_BLOCK).noCollision().nonOpaque().collidable(false)), true, classicBlocks);
    public static final BasicSignBlock CLASSIC_DEATH_BLOCK = registerBasicSignBlock("classic_death_block", new BasicSignBlock(FabricBlockSettings.copyOf(Blocks.IRON_BLOCK).noCollision().nonOpaque().collidable(false)), true, classicBlocks);
    public static final BasicSignBlock CLASSIC_ELECTRICITY_BLOCK = registerBasicSignBlock("classic_electricity_block", new BasicSignBlock(FabricBlockSettings.copyOf(Blocks.IRON_BLOCK).noCollision().nonOpaque().collidable(false)), true, classicBlocks);
    public static final BasicSignBlock CLASSIC_EXIT_BLOCK = registerBasicSignBlock("classic_exit_block", new BasicSignBlock(FabricBlockSettings.copyOf(Blocks.IRON_BLOCK).noCollision().nonOpaque().collidable(false)), true, classicBlocks);
    public static final BasicSignBlock CLASSIC_IRRITANT_BLOCK = registerBasicSignBlock("classic_irritant_block", new BasicSignBlock(FabricBlockSettings.copyOf(Blocks.IRON_BLOCK).noCollision().nonOpaque().collidable(false)), true, classicBlocks);
    public static final BasicSignBlock CLASSIC_NO_ENTRY_BLOCK = registerBasicSignBlock("classic_no_entry_block", new BasicSignBlock(FabricBlockSettings.copyOf(Blocks.IRON_BLOCK).noCollision().nonOpaque().collidable(false)), true, classicBlocks);
    public static final BasicSignBlock CLASSIC_ONE_WAY_BLOCK = registerBasicSignBlock("classic_one_way_block", new BasicSignBlock(FabricBlockSettings.copyOf(Blocks.IRON_BLOCK).noCollision().nonOpaque().collidable(false)), true, classicBlocks);
    public static final BasicSignBlock CLASSIC_PANEL_BLOCK = registerBasicSignBlock("classic_panel_block", new BasicSignBlock(FabricBlockSettings.copyOf(Blocks.IRON_BLOCK).noCollision().nonOpaque().collidable(false)), true, classicBlocks);
    public static final BasicSignBlock CLASSIC_RADIATION_BLOCK = registerBasicSignBlock("classic_radiation_block", new BasicSignBlock(FabricBlockSettings.copyOf(Blocks.IRON_BLOCK).noCollision().nonOpaque().collidable(false)), true, classicBlocks);
    public static final BasicSignBlock STVO_DANGER_BLOCK = registerBasicSignBlock("stvo_danger_block", new BasicSignBlock(FabricBlockSettings.copyOf(Blocks.IRON_BLOCK).noCollision().nonOpaque().collidable(false)), true, stvoBlocks);

    private static Block registerBlock(String name, Block block, boolean cutout, List<Block> type){

        basicBlocks.add(block);
        registerBlockItem(name,block);
        if (cutout) cutoutBlocks.add(block);

        return Registry.register(Registries.BLOCK,new Identifier(DaveSignCo.MOD_ID, name), block);
    }

    private static BasicSignBlock registerBasicSignBlock(String name, BasicSignBlock block){

        basicBlocks.add(block);
        registerBlockItem(name, block);
        cutoutBlocks.add(block);

        return Registry.register(Registries.BLOCK,new Identifier(DaveSignCo.MOD_ID, name), block);
    }

    private static BasicSignBlock registerBasicSignBlock(String name, BasicSignBlock block, boolean cutout, List<Block> type){

        basicBlocks.add(block);
        registerBlockItem(name, block);
        if (cutout) cutoutBlocks.add(block);
        if (type != null) type.add(block);

        return Registry.register(Registries.BLOCK,new Identifier(DaveSignCo.MOD_ID, name), block);
    }


    private static Item registerBlockItem(String name, Block block){
        return Registry.register(Registries.ITEM, new Identifier(DaveSignCo.MOD_ID,name),new BlockItem(block,new Item.Settings()));
    }
    public static void registerDSCBlocks(){
        DaveSignCo.LOGGER.info("Registering Blocks for " + DaveSignCo.MOD_ID);
    }
}