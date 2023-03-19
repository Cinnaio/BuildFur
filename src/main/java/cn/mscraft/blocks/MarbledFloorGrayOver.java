package cn.mscraft.blocks;

import cn.mscraft.XUST;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.properties.PropertyDirection;
import net.minecraft.block.state.BlockStateContainer;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.item.ItemStack;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

import javax.annotation.Nullable;
import java.util.List;

public class MarbledFloorGrayOver extends Block {

    private static final PropertyDirection FACING = PropertyDirection.create("facing", EnumFacing.Plane.HORIZONTAL);

    protected static final AxisAlignedBB AABB_CENTER = new AxisAlignedBB(0, 0, 0, 1, 1, 1);
    protected static final AxisAlignedBB AABB_CENTER_WEST = new AxisAlignedBB(0, 0, 0, -0.5, 1, 1);
    protected static final AxisAlignedBB AABB_CENTER_EAST = new AxisAlignedBB(0, 0, 0, 0.5, 1, 1);
    protected static final AxisAlignedBB AABB_CENTER_NORTH = new AxisAlignedBB(0, 0, 0, 1, 1, -0.5);
    protected static final AxisAlignedBB AABB_CENTER_SOUTH = new AxisAlignedBB(0, 0, 0, 1, 1, 0.5);
    protected static final AxisAlignedBB AABB_CENTER_A = new AxisAlignedBB(0, 0, 0, -0.5, 1, -0.5);
    protected static final AxisAlignedBB AABB_CENTER_B = new AxisAlignedBB(0, 0, 0, 0.5, 1, -0.5);
    protected static final AxisAlignedBB AABB_CENTER_C = new AxisAlignedBB(0, 0, 0, -0.5, 1, 0.5);
    protected static final AxisAlignedBB AABB_CENTER_D = new AxisAlignedBB(0, 0, 0, 0.5, 1, 0.5);

    public MarbledFloorGrayOver() {
        super(Material.ROCK);
        setCreativeTab(XUST.MY_TAB1);
        setUnlocalizedName("buildfur.marbled_floor_gray_over");
        setDefaultState(this.blockState.getBaseState().withProperty(FACING, EnumFacing.NORTH));
    }

    @Override
    public boolean isOpaqueCube(IBlockState state) {
        return false;
    }

    @Override
    public boolean isFullCube(IBlockState state) {
        return false;
    }

    @Override
    protected BlockStateContainer createBlockState() {
        return new BlockStateContainer(this, FACING);
    }

    @Override
    public IBlockState getStateFromMeta(int meta) {
        EnumFacing facing = EnumFacing.getHorizontal(meta & 0b0011);
        return this.getDefaultState().withProperty(FACING, facing);
    }

    @Override
    public int getMetaFromState(IBlockState state) {
        int facing = state.getValue(FACING).getHorizontalIndex();
        return facing;
    }

    @Deprecated
    public void addCollisionBoxToList(IBlockState state, World worldIn, BlockPos pos, AxisAlignedBB entityBox, List<AxisAlignedBB> collidingBoxes, @Nullable Entity entityIn, boolean isActualState) {
        addCollisionBoxToList(pos, entityBox, collidingBoxes, AABB_CENTER);
        addCollisionBoxToList(pos, entityBox, collidingBoxes, AABB_CENTER_EAST);
        addCollisionBoxToList(pos, entityBox, collidingBoxes, AABB_CENTER_WEST);
        addCollisionBoxToList(pos, entityBox, collidingBoxes, AABB_CENTER_NORTH);
        addCollisionBoxToList(pos, entityBox, collidingBoxes, AABB_CENTER_SOUTH);
        addCollisionBoxToList(pos, entityBox, collidingBoxes, AABB_CENTER_A);
        addCollisionBoxToList(pos, entityBox, collidingBoxes, AABB_CENTER_B);
        addCollisionBoxToList(pos, entityBox, collidingBoxes, AABB_CENTER_C);
        addCollisionBoxToList(pos, entityBox, collidingBoxes, AABB_CENTER_D);
    }

    @Override
    public void onBlockPlacedBy(World worldIn, BlockPos pos, IBlockState state, EntityLivingBase placer, ItemStack stack) {
        worldIn.setBlockState(pos, state.withProperty(FACING, placer.getHorizontalFacing().getOpposite()));
    }
}
