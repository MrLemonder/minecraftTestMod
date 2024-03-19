package net.mrlemonder.beersushicraft.item;

import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.mrlemonder.beersushicraft.BeerSushiCraft;
import net.mrlemonder.beersushicraft.item.custom.MetalDetectorItem;

public class ModItems
{
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, BeerSushiCraft.MOD_ID);

    //================= ITEM REGISTRY ===================//
    public static final RegistryObject<Item> BEER = ITEMS.register("beer",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> METAL_DETECTOR = ITEMS.register("metal_detector",
            () -> new MetalDetectorItem(new Item.Properties().durability(100)));

    //================= REG METHODS ===================//
    public static void register(IEventBus eventBus)
    {
        ITEMS.register(eventBus);
    }
}
