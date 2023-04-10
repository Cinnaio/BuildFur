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
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;

public class ProjectorOldColumn extends Block {

    private static final PropertyDirection FACING = PropertyDirection.create("facing", EnumFacing.Plane.HORIZONTAL);

    public ProjectorOldColumn() {
        super(Material.ROCK);
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

    @Override
    public AxisAlignedBB getBoundingBox(IBlockState state, IBlockAccess source, BlockPos pos) {

        AxisAlignedBB AABB_NS = new AxisAlignedBB(0, 0, 0, 1, 1, 0.5);
        AxisAlignedBB AABB_WE = new AxisAlignedBB(0, 0, 0, 0.5, 1, 1);

        EnumFacing blockFacing = state.getValue(FACING);

        if (blockFacing == EnumFacing.SOUTH || blockFacing == EnumFacing.NORTH) {
            if (blockFacing == EnumFacing.NORTH)
                return AABB_NS.offset(0, 0, 0.5);
            else
                return AABB_NS;
        }
        else {
            if (blockFacing == EnumFacing.EAST)
                return AABB_WE;
            else
                return AABB_WE.offset(0.5, 0, 0);
        }
    }

    @Override
    public void onBlockPlacedBy(World worldIn, BlockPos pos, IBlockState state, EntityLivingBase placer, ItemStack stack) {
        worldIn.setBlockState(pos, state.withProperty(FACING, placer.getHorizontalFacing().getOpposite().getOpposite()));
    }

    public static class LeftOn extends ProjectorOldColumn {
        public LeftOn() {
            setCreativeTab(XUST.MY_TAB2);
            setUnlocalizedName("buildfur.projector_old_column_left_on");
        }
    }

    public static class LeftOff extends ProjectorOldColumn {
        public LeftOff() {
            setCreativeTab(XUST.MY_TAB2);
            setUnlocalizedName("buildfur.projector_old_column_left_off");
        }
    }
    public static class RightOn extends ProjectorOldColumn {
        public RightOn() {
            setCreativeTab(XUST.MY_TAB2);
            setUnlocalizedName("buildfur.projector_old_column_right_on");
        }
    }

    public static class RightOff extends ProjectorOldColumn {
        public RightOff() {
            setCreativeTab(XUST.MY_TAB2);
            setUnlocalizedName("buildfur.projector_old_column_right_off");
        }
    }



}
