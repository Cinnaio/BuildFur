package cn.mscraft.init;

import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemSlab;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;


@Mod.EventBusSubscriber
public class ItemLoader {
    /*
        物品注册
     */
    @SubscribeEvent
    public static void registerItem(RegistryEvent.Register<Item> event){
        // 半砖
        event.getRegistry().register(new ItemSlab(BlockLoader.MARBLED_FLOOR_GRAY_HALF, BlockLoader.MARBLED_FLOOR_GRAY_HALF, BlockLoader.MARBLED_FLOOR_GRAY_DOUBLE).setRegistryName(BlockLoader.MARBLED_FLOOR_GRAY_HALF.getRegistryName()));

        // 其他
        event.getRegistry().register(new ItemBlock(BlockLoader.CONCRETE_WALL_WHITE).setRegistryName("buildfur:concrete_wall_white"));
        event.getRegistry().register(new ItemBlock(BlockLoader.CONCRETE_WALL_WHITE_HALF).setRegistryName("buildfur:concrete_wall_white_half"));
        event.getRegistry().register(new ItemBlock(BlockLoader.CONCRETE_CEILING_COLUMN_WHITE).setRegistryName("buildfur:concrete_ceiling_column_white"));
        event.getRegistry().register(new ItemBlock(BlockLoader.CONCRETE_COLUMN_WHITE).setRegistryName("buildfur:concrete_column_white"));

        event.getRegistry().register(new ItemBlock(BlockLoader.MARBLED_FLOOR_WHITE).setRegistryName("buildfur:marbled_floor_white"));
        event.getRegistry().register(new ItemBlock(BlockLoader.MARBLED_FLOOR_GRAY_OVER).setRegistryName("buildfur:marbled_floor_gray_over"));
        event.getRegistry().register(new ItemBlock(BlockLoader.MARBLED_FLOOR_TURQUOISE).setRegistryName("buildfur:marbled_floor_turquoise"));
        event.getRegistry().register(new ItemBlock(BlockLoader.MARBLED_FLOOR_RED).setRegistryName("buildfur:marbled_floor_red"));
        event.getRegistry().register(new ItemBlock(BlockLoader.MARBLED_FLOOR_RED_BORDER).setRegistryName("buildfur:marbled_floor_red_border"));

        event.getRegistry().register(new ItemBlock(BlockLoader.WOODEN_DESK_BIRCH).setRegistryName("buildfur:wooden_desk_birch"));
        event.getRegistry().register(new ItemBlock(BlockLoader.WOODEN_DESK_BIRCH_MIDDLE).setRegistryName("buildfur:wooden_desk_birch_middle"));
        event.getRegistry().register(new ItemBlock(BlockLoader.WOODEN_CHAIR_BIRCH).setRegistryName("buildfur:wooden_chair_birch"));
        event.getRegistry().register(new ItemBlock(BlockLoader.WOODEN_CHAIR_BIRCH_DOUBLE).setRegistryName("buildfur:wooden_chair_birch_double"));
        event.getRegistry().register(new ItemBlock(BlockLoader.WOODEN_CHAIR_TEACHBUILD_HEAD).setRegistryName("buildfur:wooden_chair_teachbuild_head"));
        event.getRegistry().register(new ItemBlock(BlockLoader.WOODEN_CHAIR_TEACHBUILD_ON).setRegistryName("buildfur:wooden_chair_teachbuild_on"));
        event.getRegistry().register(new ItemBlock(BlockLoader.WOODEN_CHAIR_TEACHBUILD_OFF).setRegistryName("buildfur:wooden_chair_teachbuild_off"));
        event.getRegistry().register(new ItemBlock(BlockLoader.WOODEN_TEACHING).setRegistryName("buildfur:wooden_teaching"));
        event.getRegistry().register(new ItemBlock(BlockLoader.WOODEN_TEACHFLOOR).setRegistryName("buildfur:wooden_teachfloor"));

        event.getRegistry().register(new ItemBlock(BlockLoader.IRON_TEACHING).setRegistryName("buildfur:iron_teaching"));
        event.getRegistry().register(new ItemBlock(BlockLoader.IRON_HEATING).setRegistryName("buildfur:iron_heating"));

        event.getRegistry().register(new ItemBlock(BlockLoader.SWITCH_LIGHT_ON).setRegistryName("buildfur:switch_light_on"));

        event.getRegistry().register(new ItemBlock(BlockLoader.DOOR_COMMON_WINDOW_UP).setRegistryName("buildfur:door_common_windows_up"));
        event.getRegistry().register(new ItemBlock(BlockLoader.DOOR_COMMON_WINDOW_DOWN).setRegistryName("buildfur:door_common_windows_down"));
        event.getRegistry().register(new ItemBlock(BlockLoader.DOOR_COMMON_WINDOW_DOWN_DOWN).setRegistryName("buildfur:door_common_windows_down_down"));
        event.getRegistry().register(new ItemBlock(BlockLoader.DOOR_COMMON_DOWN_OFF).setRegistryName("buildfur:door_common_down_off"));
//        event.getRegistry().register(new ItemBlock(BlockLoader.DOOR_COMMON_DOWN_ON).setRegistryName("buildfur:door_common_down_on"));
        event.getRegistry().register(new ItemBlock(BlockLoader.DOOR_COMMON_UP_OFF).setRegistryName("buildfur:door_common_up_off"));
//        event.getRegistry().register(new ItemBlock(BlockLoader.DOOR_COMMON_UP_ON).setRegistryName("buildfur:door_common_up_on"));

        event.getRegistry().register(new ItemBlock(BlockLoader.STONE_FLOOR_PEOPLEGO_RED).setRegistryName("buildfur:stone_floor_peoplego_red"));
        event.getRegistry().register(new ItemBlock(BlockLoader.STONE_FLOOR_PEOPLEGO_WHITE).setRegistryName("buildfur:stone_floor_peoplego_white"));
        event.getRegistry().register(new ItemBlock(BlockLoader.STONE_FLOOR_PEOPLEGO_GREEN).setRegistryName("buildfur:stone_floor_peoplego_green"));
        event.getRegistry().register(new ItemBlock(BlockLoader.STONE_FLOOR_CEMENT).setRegistryName("buildfur:stone_floor_cement"));
        event.getRegistry().register(new ItemBlock(BlockLoader.STONE_FLOOR_CEMENT_OVER).setRegistryName("buildfur:stone_floor_cement_over"));
        event.getRegistry().register(new ItemBlock(BlockLoader.STONE_FLOOR_CEMENT_BASEBOARDS).setRegistryName("buildfur:stone_floor_cement_baseboards"));

        event.getRegistry().register(new ItemBlock(BlockLoader.BLACKBOARD_GREEN_LEFT).setRegistryName("buildfur:blackboard_green_left"));
        event.getRegistry().register(new ItemBlock(BlockLoader.BLACKBOARD_GREEN_MIDDLE).setRegistryName("buildfur:blackboard_green_middle"));
        event.getRegistry().register(new ItemBlock(BlockLoader.BLACKBOARD_GREEN_RIGHT).setRegistryName("buildfur:blackboard_green_right"));

        event.getRegistry().register(new ItemBlock(BlockLoader.CEILING_LIGHT).setRegistryName("buildfur:ceiling_light"));
        event.getRegistry().register(new ItemBlock(BlockLoader.CEILING_LIGHT_WALL).setRegistryName("buildfur:ceiling_light_wall"));

        event.getRegistry().register(new ItemBlock(BlockLoader.WINDOWS_COLUMN_DOWN).setRegistryName("buildfur:windows_column_down"));
        event.getRegistry().register(new ItemBlock(BlockLoader.WINDOWS_COLUMN_UP).setRegistryName("buildfur:windows_column_up"));

        event.getRegistry().register(new ItemBlock(BlockLoader.CURTAIN_TEACH).setRegistryName("buildfur:curtain_teach"));
        event.getRegistry().register(new ItemBlock(BlockLoader.CURTAIN_TEACH_CLOTH).setRegistryName("buildfur:curtain_teach_cloth"));

        event.getRegistry().register(new ItemBlock(BlockLoader.PROJECTOR_OLD).setRegistryName("buildfur:projector_old"));
        event.getRegistry().register(new ItemBlock(BlockLoader.PROJECTOR_OLD_COLUMN_LEFT_OFF).setRegistryName("buildfur:projector_old_column_left_off"));
        event.getRegistry().register(new ItemBlock(BlockLoader.PROJECTOR_OLD_COLUMN_RIGHT_OFF).setRegistryName("buildfur:projector_old_column_right_off"));
        event.getRegistry().register(new ItemBlock(BlockLoader.PROJECTOR_OLD_COLUMN_LEFT_ON).setRegistryName("buildfur:projector_old_column_left_on"));
        event.getRegistry().register(new ItemBlock(BlockLoader.PROJECTOR_OLD_COLUMN_RIGHT_ON).setRegistryName("buildfur:projector_old_column_right_on"));
    }
}

