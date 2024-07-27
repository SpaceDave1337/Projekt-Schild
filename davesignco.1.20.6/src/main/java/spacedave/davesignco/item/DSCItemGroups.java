package spacedave.davesignco.item;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
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
                    .icon(()-> new ItemStack(DSCBlocks.TEST_BLOCK))
                    .entries(((displayContext, entries) -> {
                        entries.add(DSCBlocks.TEST_BLOCK);
                        entries.add(DSCBlocks.NO_ENTRY_BLOCK);
                    }))
                    .build());
    public static void registerItemGroups(){
        DaveSignCo.LOGGER.info("Registering Item Groups for " + DaveSignCo.MOD_ID);
    }
}
