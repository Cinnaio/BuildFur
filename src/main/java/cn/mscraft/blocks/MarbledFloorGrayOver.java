package cn.mscraft.blocks;

import cn.mscraft.XUST;
import cn.mscraft.init.BlockLoader;
import net.minecraft.block.Block;
import net.minecraft.block.BlockContainer;
import net.minecraft.block.material.Material;
import net.minecraft.block.properties.PropertyDirection;
import net.minecraft.block.state.BlockStateContainer;
import net.minecraft.block.state.IBlockState;
import net.minecraft.client.Minecraft;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.item.ItemStack;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.text.TextComponentString;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;

public class MarbledFloorGrayOver extends Block {

    private static final PropertyDirection FACING = PropertyDirection.create("facing", EnumFacing.Plane.HORIZONTAL);

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

    @Override
    public void onBlockPlacedBy(World worldIn, BlockPos pos, IBlockState state, EntityLivingBase placer, ItemStack stack) {
        worldIn.setBlockState(pos, state.withProperty(FACING, placer.getHorizontalFacing().getOpposite()));

        for (int i = -1; i < 2; i++) {
            for (int j = -1; j < 2; j++) {
                if (i == 0 && j == 0)
                    continue;
                else
                    worldIn.setBlockState(new BlockPos((pos.getX() + i), pos.getY(), pos.getZ() + j), Blocks.BARRIER.getDefaultState(), 3);
            }
        }
    }

    @Override
    public void breakBlock(World worldIn, BlockPos pos, IBlockState state) {
        for (int i = -1; i < 2; i++) {
            for (int j = -1; j < 2; j++) {
                if (i == 0 && j == 0)
                    continue;
                else
                    worldIn.setBlockToAir(new BlockPos((pos.getX() + i), pos.getY(), pos.getZ() + j));
            }
        }
    }

//    @Deprecated
//    public void neighborChanged(IBlockState state, World worldIn, BlockPos pos, Block blockIn, BlockPos fromPos) {
//        Block block = worldIn.getBlockState(fromPos).getBlock();
//        EntityPlayer p = Minecraft.getMinecraft().world.getPlayerEntityByName("Cinnaio");
//
//        if (block == Blocks.BARRIER) {
//            breakBlock(worldIn, pos, state);
//            p.sendMessage(new TextComponentString("yes from is barrier"));
//        }
//        else
//            p.sendMessage(new TextComponentString("no"));
//    }
}
