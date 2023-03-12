package cn.mscraft.blocks;

import cn.mscraft.XUST;
import cn.mscraft.entities.marbled_floor_turquoise_TileEntity;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.properties.PropertyDirection;
import net.minecraft.block.state.BlockStateContainer;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

import javax.annotation.Nullable;
import java.util.List;

public class marbled_floor_turquoise extends Block {

    public marbled_floor_turquoise() {
        super(Material.ROCK);
        setCreativeTab(XUST.MY_TAB1);
        setUnlocalizedName("buildfur.marbled_floor_turquoise");
    }

    @Override
    public boolean hasTileEntity(IBlockState state) {
        return true;
    }

    @Nullable
    @Override
    public TileEntity createTileEntity(World world, IBlockState state) {
        return new marbled_floor_turquoise_TileEntity();
    }
}
