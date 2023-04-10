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

public class DoorCommon extends Block {

    private static final PropertyDirection FACING = PropertyDirection.create("facing", EnumFacing.Plane.HORIZONTAL);

    public DoorCommon() {
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
    public void onBlockPlacedBy(World worldIn, BlockPos pos, IBlockState state, EntityLivingBase placer, ItemStack stack) {
        worldIn.setBlockState(pos, state.withProperty(FACING, placer.getHorizontalFacing()));
    }

    public static class DownOff extends DoorCommon {
        public DownOff() {
            setCreativeTab(XUST.MY_TAB2);
            setUnlocalizedName("buildfur.door_common_down_off");
        }
    }

    public static class DownOn extends DoorCommon {
        public DownOn() {
            setCreativeTab(XUST.MY_TAB2);
            setUnlocalizedName("buildfur.door_common_down_on");
        }
    }

    public static class UpOff extends DoorCommon {
        public UpOff() {
            setCreativeTab(XUST.MY_TAB2);
            setUnlocalizedName("buildfur.door_common_up_off");
        }
    }

    public static class UpOn extends DoorCommon {
        public UpOn() {
            setCreativeTab(XUST.MY_TAB2);
            setUnlocalizedName("buildfur.door_common_up_on");
        }
    }
}
