package com.doinc.themod.customclass;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.block.FluidBlock;
import net.minecraft.block.FluidDrainable;
import net.minecraft.block.Material;
import net.minecraft.block.SpongeBlock;
import net.minecraft.block.WetSpongeBlock;
import com.google.common.collect.Lists;
import java.util.Queue;
import net.minecraft.block.entity.BlockEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.fluid.FluidState;
import net.minecraft.fluid.Fluids;
import net.minecraft.sound.SoundCategory;
import net.minecraft.sound.SoundEvents;
import net.minecraft.tag.FluidTags;
import net.minecraft.util.Pair;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.world.World;

public class IgneousSponge extends Block {

    public IgneousSponge(Settings settings) {
        super(settings);
    }
    public void onBlockAdded(BlockState state, World world, BlockPos pos, BlockState oldState, boolean notify) {
        if (!oldState.isOf(state.getBlock())) {
           this.update(world, pos);
        }
     }
  
     public void neighborUpdate(BlockState state, World world, BlockPos pos, Block block, BlockPos fromPos, boolean notify) {
        this.update(world, pos);
        super.neighborUpdate(state, world, pos, block, fromPos, notify);
     }
  
     protected void update(World world, BlockPos pos) {
        if (this.absorbWater(world, pos)) {
           world.setBlockState(pos, Blocks.MAGMA_BLOCK.getDefaultState(), 2);
           world.playSound((PlayerEntity)null, pos, SoundEvents.BLOCK_SLIME_BLOCK_PLACE, SoundCategory.BLOCKS, 1.0F, (1.0F + world.getRandom().nextFloat() * 0.2F) * 0.7F);
           world.syncWorldEvent(2001, pos, Block.getRawIdFromState(Blocks.LAVA.getDefaultState()));
        }
  
     }
  
     private boolean absorbWater(World world, BlockPos pos) {
        Queue<Pair<BlockPos, Integer>> queue = Lists.newLinkedList();
        queue.add(new Pair(pos, 0));
        int i = 0;
  
        while(!queue.isEmpty()) {
           Pair<BlockPos, Integer> pair = (Pair)queue.poll();
           BlockPos blockPos = (BlockPos)pair.getLeft();
           int j = (Integer)pair.getRight();
           Direction[] var8 = Direction.values();
           int var9 = var8.length;
  
           for(int var10 = 0; var10 < var9; ++var10) {
              Direction direction = var8[var10];
              BlockPos blockPos2 = blockPos.offset(direction);
              BlockState blockState = world.getBlockState(blockPos2);
              FluidState fluidState = world.getFluidState(blockPos2);
              Material material = blockState.getMaterial();
              if (fluidState.isIn(FluidTags.LAVA)) {
                 if (blockState.getBlock() instanceof FluidDrainable && ((FluidDrainable)blockState.getBlock()).tryDrainFluid(world, blockPos2, blockState) != Fluids.EMPTY) {
                    ++i;
                    if (j < 6) {
                       queue.add(new Pair(blockPos2, j + 1));
                    }
                 } else if (blockState.getBlock() instanceof FluidBlock) {
                    world.setBlockState(blockPos2, Blocks.AIR.getDefaultState(), 3);
                    ++i;
                    if (j < 6) {
                       queue.add(new Pair(blockPos2, j + 1));
                    }
                 } else if (material == Material.UNDERWATER_PLANT || material == Material.REPLACEABLE_UNDERWATER_PLANT) {
                    BlockEntity blockEntity = blockState.getBlock().hasBlockEntity() ? world.getBlockEntity(blockPos2) : null;
                    dropStacks(blockState, world, blockPos2, blockEntity);
                    world.setBlockState(blockPos2, Blocks.AIR.getDefaultState(), 3);
                    ++i;
                    if (j < 6) {
                       queue.add(new Pair(blockPos2, j + 1));
                    }
                 }
              }
           }
  
           if (i > 100) {
              break;
           }
        }
  
        return i > 0;
     }

}