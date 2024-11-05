package org.gtlcore.gtlcore.common.data;

import org.gtlcore.gtlcore.data.recipe.*;
import org.gtlcore.gtlcore.data.recipe.chemistry.EBFRecipe;
import org.gtlcore.gtlcore.data.recipe.chemistry.MixerRecipes;
import org.gtlcore.gtlcore.data.recipe.processing.*;

import net.minecraft.data.recipes.FinishedRecipe;

import java.util.HashSet;
import java.util.function.Consumer;

public class GTLRecipes {

    public static final HashSet<String> DISASSEMBLY_RECORD = new HashSet<>();

    public static void recipeAddition(Consumer<FinishedRecipe> provider) {
        GTMTRecipe.init(provider);
        Fuel.init(provider);
        NaquadahProcess.init(provider);
        PlatGroupMetals.init(provider);
        GCyMRecipes.init(provider);
        ComponentRecipes.init(provider);
        MachineRecipe.init(provider);
        MiscRecipe.init(provider);
        ElementCopying.init(provider);
        StoneDustProcess.init(provider);
        Lanthanidetreatment.init(provider);
        MagicFormula.init(provider);
        CircuitRecipes.init(provider);
        MixerRecipes.init(provider);
        RadiationHatchRecipes.init(provider);
        RecipeOverwrite.init(provider);
        EBFRecipe.init(provider);
    }
}
