package net.mrlemonder.beersushicraft.fluid;

import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.LevelReader;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.material.Fluid;
import net.minecraft.world.level.material.FluidState;
import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.shapes.VoxelShape;

public class ModFluid extends Fluid
{
    public ModFluid(String fluidName, ResourceLocation still, ResourceLocation flowing)
    {
        //super(fluidName, still, flowing);
    }

    @Override
    public Item getBucket()
    {
        return null;
    }

    @Override
    protected boolean canBeReplacedWith(FluidState fluidState, BlockGetter blockGetter, BlockPos blockPos, Fluid fluid, Direction direction)
    {
        return false;
    }

    @Override
    protected Vec3 getFlow(BlockGetter blockGetter, BlockPos blockPos, FluidState fluidState)
    {
        return null;
    }

    @Override
    public int getTickDelay(LevelReader levelReader)
    {
        return 0;
    }

    @Override
    protected float getExplosionResistance()
    {
        return 0;
    }

    @Override
    public float getHeight(FluidState fluidState, BlockGetter blockGetter, BlockPos blockPos)
    {
        return 0;
    }

    @Override
    public float getOwnHeight(FluidState fluidState)
    {
        return 0;
    }

    @Override
    protected BlockState createLegacyBlock(FluidState fluidState)
    {
        return null;
    }

    @Override
    public boolean isSource(FluidState fluidState)
    {
        return false;
    }

    @Override
    public int getAmount(FluidState fluidState)
    {
        return 0;
    }

    @Override
    public VoxelShape getShape(FluidState fluidState, BlockGetter blockGetter, BlockPos blockPos)
    {
        return null;
    }
}
