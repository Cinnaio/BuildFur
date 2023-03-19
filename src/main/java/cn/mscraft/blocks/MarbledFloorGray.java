package cn.mscraft.blocks;

import cn.mscraft.XUST;
import cn.mscraft.init.BlockLoader;
import net.minecraft.block.BlockSlab;
import net.minecraft.block.material.Material;
import net.minecraft.block.properties.IProperty;
import net.minecraft.block.properties.PropertyEnum;
import net.minecraft.block.state.BlockStateContainer;
import net.minecraft.block.state.IBlockState;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.IStringSerializable;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

import java.util.Random;

public abstract class MarbledFloorGray extends BlockSlab {

    public static final PropertyEnum<Variant> VARIANT = PropertyEnum.<Variant>create("variant", Variant.class);

    public MarbledFloorGray() {
        super(Material.ROCK);
        setDefaultState(this.blockState.getBaseState().withProperty(VARIANT, Variant.DEFAULT));

        if (!this.isDouble()) {
            this.blockState.getBaseState().withProperty(VARIANT, Variant.DEFAULT);
        }
    }

    @Override
    public String getUnlocalizedName(int meta) {
        return super.getUnlocalizedName();
    }

    @Override
    public IProperty<?> getVariantProperty() {
        return VARIANT;
    }

    @Override
    public Comparable<?> getTypeForItem(ItemStack stack) {
        return Variant.DEFAULT;
    }

    @Override
    public Item getItemDropped(IBlockState state, Random rand, int fortune) {
        return Item.getItemFromBlock(BlockLoader.MARBLED_FLOOR_GRAY_HALF);
    }

    @Override
    public ItemStack getItem(World worldIn, BlockPos pos, IBlockState state) {
        return new ItemStack(BlockLoader.MARBLED_FLOOR_GRAY_HALF);
    }

    @Override
    public final IBlockState getStateFromMeta(final int meta) {
        IBlockState blockstate = this.blockState.getBaseState().withProperty(VARIANT, Variant.DEFAULT);

        if(!this.isDouble()) {
            blockstate = blockstate.withProperty(HALF, ((meta&8)!=0)?EnumBlockHalf.TOP:EnumBlockHalf.BOTTOM);
        }

        return blockstate;
    }

    @Override
    public final int getMetaFromState(final IBlockState state) {
        int meta = 0;

        if(!this.isDouble()&& state.getValue(HALF)==EnumBlockHalf.TOP) {
            meta |= 8;
        }

        return meta;
    }

    @Override
    protected BlockStateContainer createBlockState() {
        if(!this.isDouble()){
            return new BlockStateContainer(this, new IProperty[] {VARIANT, HALF});
        }
        return new BlockStateContainer(this, new IProperty[] {VARIANT});
    }

    public static class Double extends MarbledFloorGray {
        public Double() {
            setUnlocalizedName("buildfur.marbled_floor_gray_double");
        }

        @Override
        public boolean isDouble() {
            return true;
        }
    }

    public static class Half extends MarbledFloorGray {
        public Half() {
            setUnlocalizedName("buildfur.marbled_floor_gray_half");
            setCreativeTab(XUST.MY_TAB1);
        }

        @Override
        public boolean isDouble() {
            return false;
        }
    }

    public static enum Variant implements IStringSerializable {
        DEFAULT;

        @Override
        public String getName() {
            return "default";
        }
    }
}

