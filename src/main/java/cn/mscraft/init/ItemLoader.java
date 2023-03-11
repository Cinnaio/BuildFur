package cn.mscraft.init;

import cn.mscraft.init.BlockLoader;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;


@Mod.EventBusSubscriber
public class ItemLoader {
    @SubscribeEvent
    public static void registerItem(RegistryEvent.Register<Item> event){
        event.getRegistry().register(new ItemBlock(BlockLoader.CONCRETE_WALL_WHITE).setRegistryName("buildfur:concrete_wall_white"));
        event.getRegistry().register(new ItemBlock(BlockLoader.CONCRETE_WALL_WHITE_HALF).setRegistryName("buildfur:concrete_wall_white_half"));
        event.getRegistry().register(new ItemBlock(BlockLoader.CONCRETE_CEILING_COLUMN_WHITE).setRegistryName("buildfur:concrete_ceiling_column_white"));
        event.getRegistry().register(new ItemBlock(BlockLoader.CONCRETE_COLUMN_WHITE).setRegistryName("buildfur:concrete_column_white"));
        event.getRegistry().register(new ItemBlock(BlockLoader.MARBLED_FLOOR_WHITE).setRegistryName("buildfur:marbled_floor_white"));
        event.getRegistry().register(new ItemBlock(BlockLoader.MARBLED_FLOOR_BROWN).setRegistryName("buildfur:marbled_floor_brown"));
        event.getRegistry().register(new ItemBlock(BlockLoader.MARBLED_FLOOR_BROWN_HALF).setRegistryName("buildfur:marbled_floor_brown_half"));

        event.getRegistry().register(new ItemBlock(BlockLoader.WOODEN_DESK_BIRCH).setRegistryName("buildfur:wooden_desk_birch"));
        event.getRegistry().register(new ItemBlock(BlockLoader.WOODEN_DESK_BIRCH_DOWNHALF).setRegistryName("buildfur:wooden_desk_birch_downhalf"));
        event.getRegistry().register(new ItemBlock(BlockLoader.WOODEN_CHAIR_BIRCH).setRegistryName("buildfur:wooden_chair_birch"));
        event.getRegistry().register(new ItemBlock(BlockLoader.BLACKBOARD_GREEN).setRegistryName("buildfur:blackboard_green"));
        event.getRegistry().register(new ItemBlock(BlockLoader.CEILLING_LIGHT).setRegistryName("buildfur:ceilling_light"));

    }
}

