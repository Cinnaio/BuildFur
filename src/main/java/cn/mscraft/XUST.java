package cn.mscraft;

import cn.mscraft.init.BlockLoader;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import cn.mscraft.common.CommonProxy;

@Mod(modid = XUST.MODID, name = XUST.NAME, version = XUST.VERSION, acceptedMinecraftVersions = "1.12.2")
public class XUST {
    public static final String MODID = "buildfur";
    public static final String NAME = "BuildFur";
    public static final String VERSION = "1.0.0";

    @Mod.Instance(XUST.MODID)
    public static XUST instance;

    @SidedProxy(clientSide = "cn.mscraft.client.ClientProxy", serverSide = "cn.mscraft.common.CommonProxy")
    public static CommonProxy proxy;

    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event) {
        proxy.preInit(event);
    }
    @Mod.EventHandler
    public void init(FMLInitializationEvent event) {
        proxy.init(event);
    }
    @Mod.EventHandler
    public void postInit(FMLPostInitializationEvent event) {
        proxy.postInit(event);
    }

    // 物品分类

    // 墙体
    public static final CreativeTabs MY_TAB1 = new CreativeTabs("wall") {
        @Override
        public ItemStack getTabIconItem() {
            return new ItemStack(BlockLoader.CONCRETE_WALL_WHITE);
        }
    };

    // 家具
    public static final CreativeTabs MY_TAB2 = new CreativeTabs("furniture") {
        @Override
        public ItemStack getTabIconItem() {
            return new ItemStack(BlockLoader.WOODEN_DESK_BIRCH);
        }
    };
}

