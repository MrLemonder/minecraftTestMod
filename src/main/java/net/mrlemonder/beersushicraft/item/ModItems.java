package net.mrlemonder.beersushicraft.item;

import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.mrlemonder.beersushicraft.BeerSushiCraft;
<<<<<<< HEAD
import net.mrlemonder.beersushicraft.item.custom.MetalDetectorItem;
=======
>>>>>>> 293b42575e0f9528c1cc9f24b2d18401e801215c

public class ModItems
{
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, BeerSushiCraft.MOD_ID);

<<<<<<< HEAD
    //================= ITEM REGISTRY ===================//
    public static final RegistryObject<Item> BEER = ITEMS.register("beer",
            () -> new Item(new Item.Properties().food(ModFoods.BEER)));

    public static final RegistryObject<Item> METAL_DETECTOR = ITEMS.register("metal_detector",
            () -> new MetalDetectorItem(new Item.Properties().durability(100)));

    //================= REG METHODS ===================//
=======
    public static final RegistryObject<Item> BEER = ITEMS.register("beer",
            () -> new Item(new Item.Properties()));

>>>>>>> 293b42575e0f9528c1cc9f24b2d18401e801215c
    public static void register(IEventBus eventBus)
    {
        ITEMS.register(eventBus);
    }
}
