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
        event.getRegistry().register(new ItemBlock(BlockLoader.MARBLED_FLOOR_TURQUOISE).setRegistryName("buildfur:marbled_floor_turquoise"));

        event.getRegistry().register(new ItemBlock(BlockLoader.WOODEN_DESK_BIRCH).setRegistryName("buildfur:wooden_desk_birch"));
        event.getRegistry().register(new ItemBlock(BlockLoader.WOODEN_DESK_BIRCH_MIDDLE).setRegistryName("buildfur:wooden_desk_birch_middle"));
        event.getRegistry().register(new ItemBlock(BlockLoader.WOODEN_CHAIR_BIRCH).setRegistryName("buildfur:wooden_chair_birch"));
        event.getRegistry().register(new ItemBlock(BlockLoader.WOODEN_CHAIR_BIRCH_DOUBLE).setRegistryName("buildfur:wooden_chair_birch_double"));
        event.getRegistry().register(new ItemBlock(BlockLoader.WOODEN_CHAIR_TEACHBUILD_HEAD).setRegistryName("buildfur:wooden_chair_teachbuild_head"));
        event.getRegistry().register(new ItemBlock(BlockLoader.WOODEN_CHAIR_TEACHBUILD_ON).setRegistryName("buildfur:wooden_chair_teachbuild_on"));
        event.getRegistry().register(new ItemBlock(BlockLoader.WOODEN_CHAIR_TEACHBUILD_OFF).setRegistryName("buildfur:wooden_chair_teachbuild_off"));
        event.getRegistry().register(new ItemBlock(BlockLoader.WOODEN_TEACHING).setRegistryName("buildfur:wooden_teaching"));

        event.getRegistry().register(new ItemBlock(BlockLoader.IRON_TEACHING).setRegistryName("buildfur:iron_teaching"));

        event.getRegistry().register(new ItemBlock(BlockLoader.BLACKBOARD_GREEN_LEFT).setRegistryName("buildfur:blackboard_green_left"));
        event.getRegistry().register(new ItemBlock(BlockLoader.BLACKBOARD_GREEN_MIDDLE).setRegistryName("buildfur:blackboard_green_middle"));
        event.getRegistry().register(new ItemBlock(BlockLoader.BLACKBOARD_GREEN_RIGHT).setRegistryName("buildfur:blackboard_green_right"));

        event.getRegistry().register(new ItemBlock(BlockLoader.CEILLING_LIGHT).setRegistryName("buildfur:ceilling_light"));

        event.getRegistry().register(new ItemBlock(BlockLoader.PROJECTOR_OLD).setRegistryName("buildfur:projector_old"));
        event.getRegistry().register(new ItemBlock(BlockLoader.PROJECTOR_OLD_COLUMN_LEFT_OFF).setRegistryName("buildfur:projector_old_column_left_off"));
        event.getRegistry().register(new ItemBlock(BlockLoader.PROJECTOR_OLD_COLUMN_RIGHT_OFF).setRegistryName("buildfur:projector_old_column_right_off"));
        event.getRegistry().register(new ItemBlock(BlockLoader.PROJECTOR_OLD_COLUMN_LEFT_ON).setRegistryName("buildfur:projector_old_column_left_on"));
        event.getRegistry().register(new ItemBlock(BlockLoader.PROJECTOR_OLD_COLUMN_RIGHT_ON).setRegistryName("buildfur:projector_old_column_right_on"));
    }
}

