package spacedave.davesignco.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.item.ItemConvertible;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.TagKey;
import net.minecraft.util.Identifier;
import org.jetbrains.annotations.Nullable;
import spacedave.davesignco.DaveSignCo;
import spacedave.davesignco.Util.DSCTags;
import spacedave.davesignco.block.DSCBlocks;

import java.util.concurrent.CompletableFuture;

public class DSCItemTagProvider  extends FabricTagProvider.ItemTagProvider {

    private static final TagKey<Item> CLASSIC_BLOCKS = TagKey.of(RegistryKeys.ITEM, new Identifier(DaveSignCo.MOD_ID, "classic_blocks"));

    public DSCItemTagProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> completableFuture) {
        super(output, completableFuture);
    }


    @Override
    protected void configure(RegistryWrapper.WrapperLookup wrapperLookup) {
        for (Block block : DSCBlocks.classicBlocks) {
            getOrCreateTagBuilder(CLASSIC_BLOCKS).add(block.asItem());
        }
    }
}
