package spacedave.davesignco;

import net.fabricmc.fabric.api.datagen.v1.DataGeneratorEntrypoint;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;
import spacedave.davesignco.datagen.*;

import java.util.concurrent.CompletableFuture;

public class DaveSignCoDataGenerator implements DataGeneratorEntrypoint {
	@Override
	public void onInitializeDataGenerator(FabricDataGenerator fabricDataGenerator) {
		FabricDataGenerator.Pack pack = fabricDataGenerator.createPack();

		pack.addProvider(DSCBlockTagProvider::new);
		pack.addProvider(DSCItemTagProvider::new);
		pack.addProvider(DSCLootTableProvider::new);
		pack.addProvider(DSCModelProvider::new);
		pack.addProvider(DSCRecipeProvider::new);
	}
}
