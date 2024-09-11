package org.gtlcore.gtlcore;

import com.gregtechceu.gtceu.api.addon.GTAddon;
import com.gregtechceu.gtceu.api.addon.IGTAddon;
import com.gregtechceu.gtceu.api.registry.GTRegistries;
import com.gregtechceu.gtceu.api.registry.registrate.GTRegistrate;
import com.lowdragmc.lowdraglib.Platform;
import net.minecraft.data.recipes.FinishedRecipe;
import net.minecraft.resources.ResourceLocation;
import org.gtlcore.gtlcore.api.data.tag.GTLTagPrefix;
import org.gtlcore.gtlcore.api.registries.GTLRegistration;
import org.gtlcore.gtlcore.common.data.*;
import org.gtlcore.gtlcore.common.recipe.condition.GravityCondition;
import org.gtlcore.gtlcore.data.recipe.*;

import java.util.function.Consumer;

@GTAddon
public class GTLGTAddon implements IGTAddon {

    @Override
    public String addonModId() {
        return GTLCore.MOD_ID;
    }

    @Override
    public GTRegistrate getRegistrate() {
        return GTLRegistration.REGISTRATE;
    }

    @Override
    public boolean requiresHighTier() {
        return true;
    }

    @Override
    public void initializeAddon() {
        GTLItems.init();
        GTLBlocks.init();
    }

    @Override
    public void registerSounds() {
        GTLSoundEntries.init();
    }

    @Override
    public void registerCovers() {
        GTLCovers.init();
    }

    @Override
    public void registerElements() {
        GTLElements.init();
    }

    @Override
    public void registerTagPrefixes() {
        GTLTagPrefix.init();
    }

    @Override
    public void registerRecipeConditions() {
        GTRegistries.RECIPE_CONDITIONS.register(GravityCondition.INSTANCE.getType(), GravityCondition.class);
    }

    @Override
    public void addRecipes(Consumer<FinishedRecipe> provider) {
        GCyMRecipes.init(provider);
        FuelRecipes.init(provider);
        MachineRecipe.init(provider);
        Misc.init(provider);
        ElementCopying.init(provider);
    }

    @Override
    public void removeRecipes(Consumer<ResourceLocation> consumer) {
        RemoveRecipe.init(consumer);
    }

    @Override
    public void registerFluidVeins() {
        if (!Platform.isDevEnv()) {
            GTLBedrockFluids.init();
        }
    }
}
