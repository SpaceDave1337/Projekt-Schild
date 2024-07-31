package spacedave.davesignco;

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.minecraft.block.Block;
import net.minecraft.client.render.RenderLayer;
import spacedave.davesignco.block.DSCBlocks;

public class DaveSignCoClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        registerRenderLayers();
    }

    private void registerRenderLayers(){
        for (Block block : DSCBlocks.cutoutBlocks){
            BlockRenderLayerMap.INSTANCE.putBlock(block, RenderLayer.getCutout());
        }
    }
}
