package spacedave.davesignco.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.data.server.recipe.RecipeExporter;
import net.minecraft.item.ItemConvertible;
import net.minecraft.recipe.book.RecipeCategory;
import net.minecraft.registry.RegistryWrapper;
import spacedave.davesignco.block.DSCBlocks;

import java.util.List;
import java.util.concurrent.CompletableFuture;

public class DSCRecipeProvider extends FabricRecipeProvider {


    public DSCRecipeProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
        super(output, registriesFuture);
    }

    @Override
    public void generate(RecipeExporter exporter) { //to be honest with you, I don't care if nested for loops are unoptimised, datagen will only run on my pc, and it's beefy enough (I'd still be happy if someone else would suggest anything better though)
        for (ItemConvertible itemConvertibleOut : DSCBlocks.classicBlocks) {
            for (ItemConvertible itemConvertibleIn : DSCBlocks.classicBlocks) {
                if (itemConvertibleIn!=itemConvertibleOut){
                    offerStonecuttingRecipe(exporter, RecipeCategory.MISC, itemConvertibleIn, itemConvertibleOut);
                }
            }
        }

        for (ItemConvertible itemConvertibleOut : DSCBlocks.stvoBlocks) {
            for (ItemConvertible itemConvertibleIn : DSCBlocks.stvoBlocks) {
                if (itemConvertibleIn!=itemConvertibleOut){
                    offerStonecuttingRecipe(exporter, RecipeCategory.MISC, itemConvertibleIn, itemConvertibleOut);
                }
            }
        }
    }
}
