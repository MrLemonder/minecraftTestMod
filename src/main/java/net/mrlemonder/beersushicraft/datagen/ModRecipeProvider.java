package net.mrlemonder.beersushicraft.datagen;

import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.*;
import net.minecraft.world.item.crafting.AbstractCookingRecipe;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.crafting.RecipeSerializer;
import net.minecraft.world.item.crafting.ShapelessRecipe;
import net.minecraft.world.level.ItemLike;
import net.minecraftforge.common.crafting.conditions.IConditionBuilder;
import net.mrlemonder.beersushicraft.BeerSushiCraft;
import net.mrlemonder.beersushicraft.block.ModBlocks;
import net.mrlemonder.beersushicraft.item.ModItems;

import java.util.Iterator;
import java.util.List;
import java.util.function.Consumer;

public class ModRecipeProvider extends RecipeProvider implements IConditionBuilder
{
    private static final List<ItemLike> BEER_SMELTABLES = List.of(ModItems.BEER.get(),
            ModBlocks.TEST_ORE.get(), ModBlocks.TEST_ORE_DEEPSLATE.get());

    public ModRecipeProvider(PackOutput pOutput)
    {
        super(pOutput);
    }

    @Override
    protected void buildRecipes(Consumer<FinishedRecipe> consumer)
    {
        oreSmelting(consumer, BEER_SMELTABLES, RecipeCategory.MISC, ModItems.BEER.get(), .25f,200,"beer");
        oreBlasting(consumer, BEER_SMELTABLES, RecipeCategory.MISC, ModItems.BEER.get(), .25f,100,"beer");

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.HOPS_BLOCK.get())
                .pattern("BBB")
                .pattern("BBB")
                .pattern("BBB")
                .define('B', ModItems.BEER.get())
                .unlockedBy(getHasName(ModItems.BEER.get()), has(ModItems.BEER.get()))
                .save(consumer);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.METAL_DETECTOR.get())
                .pattern(" B ")
                .pattern(" B ")
                .pattern("BB ")
                .define('B', ModItems.BEER.get())
                .unlockedBy(getHasName(ModItems.BEER.get()), has(ModItems.BEER.get()))
                .save(consumer);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.BEER.get(), 9)
                .requires(ModBlocks.HOPS_BLOCK.get())
                .unlockedBy(getHasName(ModBlocks.HOPS_BLOCK.get()), has(ModBlocks.HOPS_BLOCK.get()))
                .save(consumer);
    }

    protected static void oreSmelting(Consumer<FinishedRecipe> pFinishedRecipeConsumer, List<ItemLike> pIngredients, RecipeCategory pCategory, ItemLike pResult, float pExperience, int pCookingTIme, String pGroup) {
        oreCooking(pFinishedRecipeConsumer, RecipeSerializer.SMELTING_RECIPE, pIngredients, pCategory, pResult, pExperience, pCookingTIme, pGroup, "_from_smelting");
    }

    protected static void oreBlasting(Consumer<FinishedRecipe> pFinishedRecipeConsumer, List<ItemLike> pIngredients, RecipeCategory pCategory, ItemLike pResult, float pExperience, int pCookingTime, String pGroup) {
        oreCooking(pFinishedRecipeConsumer, RecipeSerializer.BLASTING_RECIPE, pIngredients, pCategory, pResult, pExperience, pCookingTime, pGroup, "_from_blasting");
    }

    protected static void oreCooking(Consumer<FinishedRecipe> pFinishedRecipeConsumer, RecipeSerializer<? extends AbstractCookingRecipe> pCookingSerializer, List<ItemLike> pIngredients, RecipeCategory pCategory, ItemLike pResult, float pExperience, int pCookingTime, String pGroup, String pRecipeName) {
        Iterator var9 = pIngredients.iterator();

        while(var9.hasNext()) {
            ItemLike itemlike = (ItemLike)var9.next();
            SimpleCookingRecipeBuilder.generic(Ingredient.of(new ItemLike[]{itemlike}), pCategory, pResult, pExperience, pCookingTime, pCookingSerializer)
                    .group(pGroup).unlockedBy(getHasName(itemlike), has(itemlike))
                    .save(pFinishedRecipeConsumer, BeerSushiCraft.MOD_ID + ":" +(pResult) + pRecipeName + "_" + getItemName(itemlike));
        }

    }
}
