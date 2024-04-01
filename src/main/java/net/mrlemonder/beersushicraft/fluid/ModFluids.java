package net.mrlemonder.beersushicraft.fluid;

import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.Fluid;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.mrlemonder.beersushicraft.BeerSushiCraft;
import net.mrlemonder.beersushicraft.item.ModItems;

import java.util.function.Supplier;

public class ModFluids
{
    public static final DeferredRegister<Fluid> FLUIDS =
            DeferredRegister.create(ForgeRegistries.FLUIDS, BeerSushiCraft.MOD_ID);

    //================= REG METHODS ===================//
    public static void register(IEventBus eventBus)
    {
        FLUIDS.register(eventBus);
    }

    private static <T extends Fluid> RegistryObject<T> registerFluid(String name, Supplier<T> fluid)
    {
        RegistryObject<T> toReturn = FLUIDS.register(name, fluid);
        //registerFluidItem(name , toReturn);
        return toReturn;
    }
//    private static <T extends Block> RegistryObject<Item> registerFluidItem(String name, RegistryObject<T> fluid)
//    {
//        return ModItems.ITEMS.register(name, () -> new F(fluid.get(), new Item.Properties()));
//    }

}