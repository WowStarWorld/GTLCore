package org.gtlcore.gtlcore.mixin.gtm.recipe.change;

import org.gtlcore.gtlcore.data.recipe.processing.PlatGroupMetals;

import com.gregtechceu.gtceu.data.recipe.serialized.chemistry.PlatGroupMetalsRecipes;

import net.minecraft.data.recipes.FinishedRecipe;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

import java.util.function.Consumer;

@Mixin(PlatGroupMetalsRecipes.class)
public class PlatGroupMetalsRecipesMixin {

    @Inject(method = "init", at = @At("HEAD"), remap = false, cancellable = true)
    private static void init(Consumer<FinishedRecipe> provider, CallbackInfo ci) {
        PlatGroupMetals.init(provider);
        ci.cancel();
    }
}
