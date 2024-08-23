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
    public static List<Block> basicLargeBlocks = new ArrayList<>();

    public static List<Block> classicBlocks = new ArrayList<>();
    public static List<Block> stvoBlocks = new ArrayList<>();
    public static List<Block> esoBlocks = new ArrayList<>();

    public static final BasicSignBlock CLASSIC_ALARM_BLOCK = registerBasicSignBlock("classic_alarm_block", new BasicSignBlock(FabricBlockSettings.copyOf(Blocks.IRON_BLOCK).nonOpaque()), true, classicBlocks);
    public static final BasicSignBlock CLASSIC_BIOHAZARD_BLOCK = registerBasicSignBlock("classic_biohazard_block", new BasicSignBlock(FabricBlockSettings.copyOf(Blocks.IRON_BLOCK).nonOpaque()), true, classicBlocks);
    public static final BasicSignBlock CLASSIC_DEATH_BLOCK = registerBasicSignBlock("classic_death_block", new BasicSignBlock(FabricBlockSettings.copyOf(Blocks.IRON_BLOCK).nonOpaque()), true, classicBlocks);
    public static final BasicSignBlock CLASSIC_ELECTRICITY_BLOCK = registerBasicSignBlock("classic_electricity_block", new BasicSignBlock(FabricBlockSettings.copyOf(Blocks.IRON_BLOCK).nonOpaque()), true, classicBlocks);
    public static final BasicSignBlock CLASSIC_IRRITANT_BLOCK = registerBasicSignBlock("classic_irritant_block", new BasicSignBlock(FabricBlockSettings.copyOf(Blocks.IRON_BLOCK).nonOpaque()), true, classicBlocks);
    public static final BasicSignBlock CLASSIC_RADIATION_BLOCK = registerBasicSignBlock("classic_radiation_block", new BasicSignBlock(FabricBlockSettings.copyOf(Blocks.IRON_BLOCK).nonOpaque()), true, classicBlocks);
    public static final BasicSignBlock CLASSIC_ARROW_BACK_BLOCK = registerBasicSignBlock("classic_arrow_back_block", new BasicSignBlock(FabricBlockSettings.copyOf(Blocks.IRON_BLOCK).nonOpaque()), true, classicBlocks);
    public static final BasicSignBlock CLASSIC_ARROW_DOWN_BLOCK = registerBasicSignBlock("classic_arrow_down_block", new BasicSignBlock(FabricBlockSettings.copyOf(Blocks.IRON_BLOCK).nonOpaque()), true, classicBlocks);
    public static final BasicSignBlock CLASSIC_ARROW_LEFT_BLOCK = registerBasicSignBlock("classic_arrow_left_block", new BasicSignBlock(FabricBlockSettings.copyOf(Blocks.IRON_BLOCK).nonOpaque()), true, classicBlocks);
    public static final BasicSignBlock CLASSIC_ARROW_RIGHT_BLOCK = registerBasicSignBlock("classic_arrow_right_block", new BasicSignBlock(FabricBlockSettings.copyOf(Blocks.IRON_BLOCK).nonOpaque()), true, classicBlocks);
    public static final BasicSignBlock CLASSIC_ARROW_UP_BLOCK = registerBasicSignBlock("classic_arrow_up_block", new BasicSignBlock(FabricBlockSettings.copyOf(Blocks.IRON_BLOCK).nonOpaque()), true, classicBlocks);
    public static final BasicSignBlock CLASSIC_EXIT_BLOCK = registerBasicSignBlock("classic_exit_block", new BasicSignBlock(FabricBlockSettings.copyOf(Blocks.IRON_BLOCK).nonOpaque()), true, classicBlocks);
    public static final BasicSignBlock CLASSIC_PANEL_BLOCK = registerBasicSignBlock("classic_panel_block", new BasicSignBlock(FabricBlockSettings.copyOf(Blocks.IRON_BLOCK).nonOpaque()), true, classicBlocks);
    public static final BasicSignBlock CLASSIC_NO_ENTRY_BLOCK = registerBasicSignBlock("classic_no_entry_block", new BasicSignBlock(FabricBlockSettings.copyOf(Blocks.IRON_BLOCK).nonOpaque()), true, classicBlocks);
    public static final BasicSignBlock CLASSIC_ONE_WAY_BLOCK = registerBasicSignBlock("classic_one_way_block", new BasicSignBlock(FabricBlockSettings.copyOf(Blocks.IRON_BLOCK).nonOpaque()), true, classicBlocks);
    public static final BasicSignBlock CLASSIC_DANGER_BLOCK = registerBasicSignBlock("classic_danger_block", new BasicSignBlock(FabricBlockSettings.copyOf(Blocks.IRON_BLOCK).nonOpaque()), true, classicBlocks);
    //STVO blocks from here
    public static final BasicSignBlock STVO_DANGER_BLOCK = registerBasicSignBlock("stvo_danger_block", new BasicSignBlock(FabricBlockSettings.copyOf(Blocks.IRON_BLOCK).nonOpaque()), true, stvoBlocks);
    //ESO blocks from here
    public static final BasicSignBlock ESO_SPEED_LIMIT_ANNOUNCEMENT_ONE_BLOCK = registerBasicSignBlock("eso_speed_limit_announcement_one_block", new BasicSignBlock(FabricBlockSettings.copyOf(Blocks.IRON_BLOCK).nonOpaque()), true, esoBlocks);
    public static final BasicSignBlock ESO_SPEED_LIMIT_ANNOUNCEMENT_TWO_BLOCK = registerBasicSignBlock("eso_speed_limit_announcement_two_block", new BasicSignBlock(FabricBlockSettings.copyOf(Blocks.IRON_BLOCK).nonOpaque()), true, esoBlocks);
    public static final BasicSignBlock ESO_SPEED_LIMIT_ANNOUNCEMENT_THREE_BLOCK = registerBasicSignBlock("eso_speed_limit_announcement_three_block", new BasicSignBlock(FabricBlockSettings.copyOf(Blocks.IRON_BLOCK).nonOpaque()), true, esoBlocks);
    public static final BasicSignBlock ESO_SPEED_LIMIT_ANNOUNCEMENT_FOUR_BLOCK = registerBasicSignBlock("eso_speed_limit_announcement_four_block", new BasicSignBlock(FabricBlockSettings.copyOf(Blocks.IRON_BLOCK).nonOpaque()), true, esoBlocks);
    public static final BasicSignBlock ESO_SPEED_LIMIT_ANNOUNCEMENT_FIVE_BLOCK = registerBasicSignBlock("eso_speed_limit_announcement_five_block", new BasicSignBlock(FabricBlockSettings.copyOf(Blocks.IRON_BLOCK).nonOpaque()), true, esoBlocks);
    public static final BasicSignBlock ESO_SPEED_LIMIT_ANNOUNCEMENT_SIX_BLOCK = registerBasicSignBlock("eso_speed_limit_announcement_six_block", new BasicSignBlock(FabricBlockSettings.copyOf(Blocks.IRON_BLOCK).nonOpaque()), true, esoBlocks);
    public static final BasicSignBlock ESO_SPEED_LIMIT_ANNOUNCEMENT_SEVEN_BLOCK = registerBasicSignBlock("eso_speed_limit_announcement_seven_block", new BasicSignBlock(FabricBlockSettings.copyOf(Blocks.IRON_BLOCK).nonOpaque()), true, esoBlocks);
    public static final BasicSignBlock ESO_SPEED_LIMIT_ANNOUNCEMENT_EIGHT_BLOCK = registerBasicSignBlock("eso_speed_limit_announcement_eight_block", new BasicSignBlock(FabricBlockSettings.copyOf(Blocks.IRON_BLOCK).nonOpaque()), true, esoBlocks);
    public static final BasicSignBlock ESO_SPEED_LIMIT_ANNOUNCEMENT_NINE_BLOCK = registerBasicSignBlock("eso_speed_limit_announcement_nine_block", new BasicSignBlock(FabricBlockSettings.copyOf(Blocks.IRON_BLOCK).nonOpaque()), true, esoBlocks);

    public static final BasicSignBlock ESO_SPEED_LIMIT_ONE_BLOCK = registerBasicSignBlock("eso_speed_limit_one_block", new BasicSignBlock(FabricBlockSettings.copyOf(Blocks.IRON_BLOCK).nonOpaque()), true, esoBlocks);
    public static final BasicSignBlock ESO_SPEED_LIMIT_TWO_BLOCK = registerBasicSignBlock("eso_speed_limit_two_block", new BasicSignBlock(FabricBlockSettings.copyOf(Blocks.IRON_BLOCK).nonOpaque()), true, esoBlocks);
    public static final BasicSignBlock ESO_SPEED_LIMIT_THREE_BLOCK = registerBasicSignBlock("eso_speed_limit_three_block", new BasicSignBlock(FabricBlockSettings.copyOf(Blocks.IRON_BLOCK).nonOpaque()), true, esoBlocks);
    public static final BasicSignBlock ESO_SPEED_LIMIT_FOUR_BLOCK = registerBasicSignBlock("eso_speed_limit_four_block", new BasicSignBlock(FabricBlockSettings.copyOf(Blocks.IRON_BLOCK).nonOpaque()), true, esoBlocks);
    public static final BasicSignBlock ESO_SPEED_LIMIT_FIVE_BLOCK = registerBasicSignBlock("eso_speed_limit_five_block", new BasicSignBlock(FabricBlockSettings.copyOf(Blocks.IRON_BLOCK).nonOpaque()), true, esoBlocks);
    public static final BasicSignBlock ESO_SPEED_LIMIT_SIX_BLOCK = registerBasicSignBlock("eso_speed_limit_six_block", new BasicSignBlock(FabricBlockSettings.copyOf(Blocks.IRON_BLOCK).nonOpaque()), true, esoBlocks);
    public static final BasicSignBlock ESO_SPEED_LIMIT_SEVEN_BLOCK = registerBasicSignBlock("eso_speed_limit_seven_block", new BasicSignBlock(FabricBlockSettings.copyOf(Blocks.IRON_BLOCK).nonOpaque()), true, esoBlocks);
    public static final BasicSignBlock ESO_SPEED_LIMIT_EIGHT_BLOCK = registerBasicSignBlock("eso_speed_limit_eight_block", new BasicSignBlock(FabricBlockSettings.copyOf(Blocks.IRON_BLOCK).nonOpaque()), true, esoBlocks);
    public static final BasicSignBlock ESO_SPEED_LIMIT_NINE_BLOCK = registerBasicSignBlock("eso_speed_limit_nine_block", new BasicSignBlock(FabricBlockSettings.copyOf(Blocks.IRON_BLOCK).nonOpaque()), true, esoBlocks);
    public static final BasicSignBlock ESO_SPEED_LIMIT_END_BLOCK = registerBasicSignBlock("eso_speed_limit_end_block", new BasicSignBlock(FabricBlockSettings.copyOf(Blocks.IRON_BLOCK).nonOpaque()), true, esoBlocks);

    public static final BasicSignBlock ESO_ADVANCE_SIGNAL_BLOCK = registerBasicSignBlock("eso_advance_signal_block", new BasicSignBlock(FabricBlockSettings.copyOf(Blocks.IRON_BLOCK).nonOpaque()), true, esoBlocks); //vorsignal
    public static final BasicSignBlock ESO_WHISTLE_BLOCK = registerBasicSignBlock("eso_whistle_block", new BasicSignBlock(FabricBlockSettings.copyOf(Blocks.IRON_BLOCK).nonOpaque()), true, esoBlocks);
    public static final BasicSignBlock ESO_WHISTLE_EXCLUSION_BLOCK = registerBasicSignBlock("eso_whistle_exclusion_block", new BasicSignBlock(FabricBlockSettings.copyOf(Blocks.IRON_BLOCK).nonOpaque()), true, esoBlocks);

    public static final BasicSignBlock ESO_TRAIN_TAIL_DAY_BLOCK = registerBasicSignBlock("eso_train_tail_day_block", new BasicSignBlock(FabricBlockSettings.copyOf(Blocks.IRON_BLOCK).nonOpaque().emissiveLighting(Blocks::always).luminance(state -> 3)), true, esoBlocks);
    public static final BasicSignBlock ESO_TRAIN_TAIL_NIGHT_BLOCK = registerBasicSignBlock("eso_train_tail_night_block", new BasicSignBlock(FabricBlockSettings.copyOf(Blocks.IRON_BLOCK).nonOpaque().emissiveLighting(Blocks::always).luminance(state -> 3)), true, esoBlocks);

    public static final BasicSignBlock ESO_SIGNAL_MAST_BLACK_BLOCK = registerBasicSignBlock("eso_signal_mast_black_block", new BasicSignBlock(FabricBlockSettings.copyOf(Blocks.IRON_BLOCK).nonOpaque()), true, esoBlocks);
    public static final BasicSignBlock ESO_SIGNAL_MAST_RED_BLOCK = registerBasicSignBlock("eso_signal_mast_red_block", new BasicSignBlock(FabricBlockSettings.copyOf(Blocks.IRON_BLOCK).nonOpaque()), true, esoBlocks);
    public static final BasicSignBlock ESO_SIGNAL_MAST_WHITE_BLOCK = registerBasicSignBlock("eso_signal_mast_white_block", new BasicSignBlock(FabricBlockSettings.copyOf(Blocks.IRON_BLOCK).nonOpaque()), true, esoBlocks);

    public static final BasicLargeSignBlock ESO_SEMAPHORE_BLOCK = registerBasicLargeSignBlock("eso_semaphore_block", new BasicLargeSignBlock(FabricBlockSettings.copyOf(Blocks.IRON_BLOCK).nonOpaque()), true, esoBlocks);

    public static final BasicLargeSignBlock ESO_NEXT_MAIN_SIGNAL_SHOWS_STOP_BOTTOM_BLOCK = registerBasicLargeSignBlock("eso_next_main_signal_shows_stop_bottom_block", new BasicLargeSignBlock(FabricBlockSettings.copyOf(Blocks.IRON_BLOCK).nonOpaque()), true, esoBlocks);
    public static final BasicSignBlock ESO_NEXT_MAIN_SIGNAL_SHOWS_STOP_TOP_BLOCK = registerBasicSignBlock("eso_next_main_signal_shows_stop_top_block", new BasicSignBlock(FabricBlockSettings.copyOf(Blocks.IRON_BLOCK).nonOpaque()), true, esoBlocks);

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

    private static BasicLargeSignBlock registerBasicLargeSignBlock(String name, BasicLargeSignBlock block, boolean cutout, List<Block> type){

        basicLargeBlocks.add(block);
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