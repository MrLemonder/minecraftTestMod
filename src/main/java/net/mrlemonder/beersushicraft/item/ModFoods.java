package net.mrlemonder.beersushicraft.item;

import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.food.FoodProperties;

public class ModFoods
{
    public static final FoodProperties BEER = new FoodProperties.Builder()
            .nutrition(3)
            .saturationMod(.4f)
            .effect(
                    () -> new MobEffectInstance(MobEffects.HUNGER, 60),
            .7f
            ).build();
}
