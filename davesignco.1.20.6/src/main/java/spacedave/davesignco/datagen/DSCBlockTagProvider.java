package spacedave.davesignco.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.block.Block;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.BlockTags;
import spacedave.davesignco.block.DSCBlocks;

import java.util.concurrent.CompletableFuture;

public class DSCBlockTagProvider extends FabricTagProvider.BlockTagProvider {

    public DSCBlockTagProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
        super(output, registriesFuture);
    }

    @Override
    protected void configure(RegistryWrapper.WrapperLookup wrapperLookup) {
        for (Block block : DSCBlocks.basicBlocks){
            getOrCreateTagBuilder(BlockTags.PICKAXE_MINEABLE).add(block);
            getOrCreateTagBuilder(BlockTags.NEEDS_IRON_TOOL).add(block);
        }
    }
}
