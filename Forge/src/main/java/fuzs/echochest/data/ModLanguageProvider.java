package fuzs.echochest.data;

import fuzs.echochest.init.ModRegistry;
import net.minecraft.data.DataGenerator;
import net.minecraftforge.common.data.LanguageProvider;

public class ModLanguageProvider extends LanguageProvider {

    public ModLanguageProvider(DataGenerator dataGenerator, String modId) {
        super(dataGenerator, modId, "en_us");
    }

    @Override
    protected void addTranslations() {
        this.add(ModRegistry.ECHO_CHEST_BLOCK.get(), "Echo Chest");
        this.add("container.echo_chest", "Echo Chest");
        this.add("block.echochest.echo_chest.description", "Collects items and experience from mobs dropped nearby in a radius of 8 blocks.");
    }
}
