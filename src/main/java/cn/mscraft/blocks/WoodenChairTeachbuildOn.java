package cn.mscraft.blocks;

import cn.mscraft.XUST;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.properties.PropertyDirection;
import net.minecraft.block.state.BlockStateContainer;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.item.ItemStack;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class WoodenChairTeachbuildOn extends Block {

    private static final PropertyDirection FACING = PropertyDirection.create("facing", EnumFacing.Plane.HORIZONTAL);

    public WoodenChairTeachbuildOn() {
        super(Material.ROCK);
        setCreativeTab(XUST.MY_TAB2);
        setUnlocalizedName("buildfur.wooden_chair_teachbuild_on");
        setLightLevel(0.5F);
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

//    @Override
//    public AxisAlignedBB getBoundingBox(IBlockState state, IBlockAccess source, BlockPos pos) {
//        int blockFacing = state.getValue(FACING).getHorizontalIndex();
//
//        if (blockFacing == 2 || blockFacing == 0) {
//            AxisAlignedBB AABB = new AxisAlignedBB(0, 0, 0.2, 1, 1, 0.8);
//            return AABB.offset(0, 0, -1);
//        }
//        else {
//            AxisAlignedBB AABB = new AxisAlignedBB(0.2, 0, 0, 0.8, 1, 1);
//            return AABB.offset(1, 0, 0);
//        }
//    }

    @Override
    public void onBlockPlacedBy(World worldIn, BlockPos pos, IBlockState state, EntityLivingBase placer, ItemStack stack) {
        worldIn.setBlockState(pos, state.withProperty(FACING, placer.getHorizontalFacing().getOpposite()));
    }
}
