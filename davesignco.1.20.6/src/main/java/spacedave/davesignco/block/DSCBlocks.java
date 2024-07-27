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

    public static final List<Block> CUTOUT_BLOCKS = new ArrayList<>();


    public static final BasicSignBlock TEST_BLOCK = registerBasicSignBlock("test_block",
            new BasicSignBlock(FabricBlockSettings.copyOf(Blocks.IRON_BLOCK)
                    .noCollision()
                    .nonOpaque()
                    .collidable(false)));
    public static final BasicSignBlock NO_ENTRY_BLOCK = registerBasicSignBlock("no_entry_block",
            new BasicSignBlock(FabricBlockSettings.copyOf(Blocks.IRON_BLOCK)
                    .noCollision()
                    .nonOpaque()
                    .collidable(false)));

    private static Block registerBlock(String name, Block block){
        registerBlockItem(name,block);
        return Registry.register(Registries.BLOCK,new Identifier(DaveSignCo.MOD_ID, name), block);
    }

    private static BasicSignBlock registerBasicSignBlock(String name, BasicSignBlock block){
        registerBlockItem(name, block);
        return Registry.register(Registries.BLOCK,new Identifier(DaveSignCo.MOD_ID, name), block);
    }

    private static Item registerBlockItem(String name, Block block){
        return Registry.register(Registries.ITEM, new Identifier(DaveSignCo.MOD_ID,name),new BlockItem(block,new Item.Settings()));
    }
    public static void registerDSCBlocks(){
        DaveSignCo.LOGGER.info("Registering Blocks for " + DaveSignCo.MOD_ID);

        //Add all cutout blocks to list
        CUTOUT_BLOCKS.add(TEST_BLOCK);
        CUTOUT_BLOCKS.add(NO_ENTRY_BLOCK);
    }
}
/*
If you're reading this, HI!
First off, I'd like to thank all of my supporters of Dave's Building Extended which made this mod possible.
Secondly, IThundxr and pinkmachine are extremely disrespectful and unprofessional, I'd still recommend their mod though, works pretty well with this one tbh
Lastly, if you find any issues in my code, which is poor at best, please tell me them on my GitHub!
-SpaceDave1337
 */