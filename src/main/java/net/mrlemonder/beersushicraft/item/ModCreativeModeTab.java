package net.mrlemonder.beersushicraft.item;

import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;
import net.mrlemonder.beersushicraft.BeerSushiCraft;
import net.mrlemonder.beersushicraft.block.ModBlocks;

public class ModCreativeModeTab {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, BeerSushiCraft.MOD_ID);

    public static final RegistryObject<CreativeModeTab> BEER_SUSHI_TAB = CREATIVE_MODE_TABS.register("beer_sushi_tab",
            () -> CreativeModeTab.builder()
                    .icon(() -> new ItemStack(ModItems.BEER.get()))
                    .title(Component.translatable("creativetab.beer_sushi_tab"))
                    .displayItems((itemDisplayParameters, output) ->
                    {
                        output.accept(ModItems.BEER.get());
                        output.accept(ModBlocks.HOPS_BLOCK.get());
                    })
                    .build());

    public static void register(IEventBus eventBus)
    {
        CREATIVE_MODE_TABS.register(eventBus);
    }
}
