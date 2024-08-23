package spacedave.davesignco.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricBlockLootTableProvider;
import net.minecraft.block.Block;
import net.minecraft.registry.RegistryWrapper;
import spacedave.davesignco.block.DSCBlocks;

import java.util.concurrent.CompletableFuture;

public class DSCLootTableProvider extends FabricBlockLootTableProvider {
    public DSCLootTableProvider(FabricDataOutput dataOutput, CompletableFuture<RegistryWrapper.WrapperLookup> registryLookup) {
        super(dataOutput, registryLookup);
    }

    @Override
    public void generate() {
        for (Block block : DSCBlocks.basicBlocks) {
        addDrop(block);
        }
        for (Block block : DSCBlocks.basicLargeBlocks) {
            addDrop(block);
        }
    }
}
