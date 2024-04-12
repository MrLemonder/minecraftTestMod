package net.mrlemonder.beersushicraft.datagen;

import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.tags.BlockTags;
import net.minecraftforge.common.Tags;
import net.minecraftforge.common.data.BlockTagsProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.registries.ForgeRegistries;
import net.mrlemonder.beersushicraft.BeerSushiCraft;
import net.mrlemonder.beersushicraft.block.ModBlocks;
import net.mrlemonder.beersushicraft.util.ModTags;
import org.jetbrains.annotations.Nullable;

import java.util.concurrent.CompletableFuture;

public class ModBlockTagGenerator extends BlockTagsProvider
{

    public ModBlockTagGenerator(PackOutput output, CompletableFuture<HolderLookup.Provider> lookupProvider, @Nullable ExistingFileHelper existingFileHelper)
    {
        super(output, lookupProvider, BeerSushiCraft.MOD_ID, existingFileHelper);
    }

    @Override
    protected void addTags(HolderLookup.Provider provider)
    {
        this.tag(ModTags.Blocks.METAL_DETECTOR_VALUABLES)
                .add(ModBlocks.TEST_ORE.get())
                .add(ModBlocks.TEST_ORE_DEEPSLATE.get())
                .addTag(Tags.Blocks.ORES);

        this.tag(BlockTags.MINEABLE_WITH_PICKAXE)
                .add(ModBlocks.TEST_ORE.get(),
                        ModBlocks.TEST_ORE_DEEPSLATE.get());

        this.tag(BlockTags.MINEABLE_WITH_HOE)
                .add(ModBlocks.HOPS_BLOCK.get());

        this.tag(BlockTags.NEEDS_IRON_TOOL)
                .add(ModBlocks.TEST_ORE.get());

        this.tag(BlockTags.NEEDS_DIAMOND_TOOL)
                .add(ModBlocks.TEST_ORE_DEEPSLATE.get());

//        this.tag(Tags.Blocks.NEEDS_NETHERITE_TOOL)
//                .add(ModBlocks.TEST_ORE_DEEPSLATE.get());
    }
}
