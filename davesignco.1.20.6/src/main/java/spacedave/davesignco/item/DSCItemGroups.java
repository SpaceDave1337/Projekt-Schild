package spacedave.davesignco.item;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.block.Block;
import net.minecraft.block.MagmaBlock;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.item.MinecartItem;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import spacedave.davesignco.DaveSignCo;
import spacedave.davesignco.block.DSCBlocks;

public class DSCItemGroups {
    public static final ItemGroup DSC_GROUP = Registry.register(Registries.ITEM_GROUP,
            new Identifier(DaveSignCo.MOD_ID,"davesignco"),
            FabricItemGroup.builder().displayName(Text.translatable("itemgroup.davesignco"))
                    .icon(()-> new ItemStack(DSCBlocks.CLASSIC_ALARM_BLOCK))
                    .entries(((displayContext, entries) -> {
                        for (Block block : DSCBlocks.basicBlocks){
                            entries.add(block);
                        }
                        for (Block block : DSCBlocks.basicLargeBlocks){
                            entries.add(block);
                        }
                    }))
                    .build());
    public static void registerItemGroups(){
        DaveSignCo.LOGGER.info("Registering Item Groups for " + DaveSignCo.MOD_ID);
    }
}
