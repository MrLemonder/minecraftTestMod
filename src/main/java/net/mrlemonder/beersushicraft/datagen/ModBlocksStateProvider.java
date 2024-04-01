package net.mrlemonder.beersushicraft.datagen;

import net.minecraft.data.PackOutput;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.client.model.generators.BlockStateProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.registries.RegistryObject;
import net.mrlemonder.beersushicraft.BeerSushiCraft;
import net.mrlemonder.beersushicraft.block.ModBlocks;

public class ModBlocksStateProvider extends BlockStateProvider
{
    public ModBlocksStateProvider(PackOutput output, ExistingFileHelper exFileHelper)
    {
        super(output, BeerSushiCraft.MOD_ID, exFileHelper);
    }

    @Override
    protected void registerStatesAndModels()
    {
        blockWithItem(ModBlocks.HOPS_BLOCK);
        blockWithItem(ModBlocks.TEST_ORE);
        blockWithItem(ModBlocks.TEST_ORE_DEEPSLATE);
    }

    private void blockWithItem(RegistryObject<Block> blockRegistryObject)
    {
        simpleBlockWithItem(blockRegistryObject.get(), cubeAll(blockRegistryObject.get()));
    }

}
