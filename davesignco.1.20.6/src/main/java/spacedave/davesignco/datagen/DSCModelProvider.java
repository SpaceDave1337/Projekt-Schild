package spacedave.davesignco.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.minecraft.block.Block;
import net.minecraft.data.client.*;
import net.minecraft.state.property.Properties;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.Direction;
import spacedave.davesignco.DaveSignCo;
import spacedave.davesignco.block.DSCBlocks;

import java.util.Optional;

public class DSCModelProvider extends FabricModelProvider {
    public DSCModelProvider(FabricDataOutput output) {
        super(output);
    }
    private static final Model BASIC_ALIGN_SIGN_MODEL = new Model(
            Optional.of(Identifier.of(DaveSignCo.MOD_ID, "base/basic_sign")),
            Optional.empty(),
            TextureKey.ALL, TextureKey.PARTICLE
    );
    private static final Model BASIC_LARGE_ALIGN_SIGN_MODEL = new Model(
            Optional.of(Identifier.of(DaveSignCo.MOD_ID, "base/basic_large_sign")),
            Optional.empty(),
            TextureKey.ALL, TextureKey.PARTICLE
    );


    @Override
    public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {
        for (Block block : DSCBlocks.basicBlocks){
            registerCustomBlockWithTexturesBasic(blockStateModelGenerator, block);
        }
        for (Block block : DSCBlocks.basicLargeBlocks){
            registerCustomBlockWithTexturesBasicLarge(blockStateModelGenerator, block);
        }
    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {
    }

    private void generateBlockModels(){

    }

    public void registerBasicSign(BlockStateModelGenerator blockStateModelGenerator, Block block){
    }

    private void registerCustomBlockWithTexturesBasic(BlockStateModelGenerator blockStateModelGenerator, Block block) {      //shout out to https://github.com/O7410

        blockStateModelGenerator.registerParentedItemModel(block, ModelIds.getBlockModelId(block));

        blockStateModelGenerator.blockStateCollector.accept(VariantsBlockStateSupplier.create(block, BlockStateVariant.create().put(VariantSettings.MODEL, ModelIds.getBlockModelId(block)))
                .coordinate(BlockStateModelGenerator.createNorthDefaultHorizontalRotationStates()));
        BASIC_ALIGN_SIGN_MODEL.upload(block, new TextureMap()
                        .put(TextureKey.ALL, ModelIds.getBlockModelId(block))
                        .put(TextureKey.PARTICLE, ModelIds.getBlockModelId(block)),
                blockStateModelGenerator.modelCollector);
    }
    private void registerCustomBlockWithTexturesBasicLarge(BlockStateModelGenerator blockStateModelGenerator, Block block) {      //shout out to https://github.com/O7410

        blockStateModelGenerator.registerParentedItemModel(block, ModelIds.getBlockModelId(block));

        blockStateModelGenerator.blockStateCollector.accept(VariantsBlockStateSupplier.create(block, BlockStateVariant.create().put(VariantSettings.MODEL, ModelIds.getBlockModelId(block)))
                .coordinate(BlockStateModelGenerator.createNorthDefaultHorizontalRotationStates()));
        BASIC_LARGE_ALIGN_SIGN_MODEL.upload(block, new TextureMap()
                        .put(TextureKey.ALL, ModelIds.getBlockModelId(block))
                        .put(TextureKey.PARTICLE, ModelIds.getBlockModelId(block)),
                blockStateModelGenerator.modelCollector);
    }
}

