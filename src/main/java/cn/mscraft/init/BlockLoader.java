package cn.mscraft.init;

import cn.mscraft.blocks.*;
import net.minecraft.block.Block;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

@Mod.EventBusSubscriber
public class BlockLoader {
    // 半砖
    public static marbled_floor_brown MARBLED_FLOOR_BROWN_HALF = new marbled_floor_brown.Half();
    public static marbled_floor_brown MARBLED_FLOOR_BROWN_DOUBLE = new marbled_floor_brown.Double();

    // 其他
    public static Block CONCRETE_WALL_WHITE = new concrete_wall_white();
    public static Block CONCRETE_WALL_WHITE_HALF = new concrete_wall_white_half();
    public static Block CONCRETE_CEILING_COLUMN_WHITE = new concrete_ceiling_column_white();
    public static Block CONCRETE_COLUMN_WHITE = new concrete_column_white();

    public static Block MARBLED_FLOOR_WHITE = new marbled_floor_turquoise();
//    public static Block MARBLED_FLOOR_TURQUOISE = new marbled_floor_turquoise();

    public static Block WOODEN_DESK_BIRCH = new wooden_desk_birch();
    public static Block WOODEN_DESK_BIRCH_MIDDLE = new wooden_desk_birch_middle();
    public static Block WOODEN_CHAIR_BIRCH = new wooden_chair_birch();
    public static Block WOODEN_CHAIR_BIRCH_DOUBLE = new wooden_chair_birch_double();
    public static Block WOODEN_CHAIR_TEACHBUILD_HEAD = new wooden_chair_teachbuild_head();
    public static Block WOODEN_CHAIR_TEACHBUILD_ON = new wooden_chair_teachbuild_on();
    public static Block WOODEN_CHAIR_TEACHBUILD_OFF = new wooden_chair_teachbuild_off();
    public static Block WOODEN_TEACHING = new wooden_teaching();

    public static Block IRON_TEACHING = new iron_teaching();

    public static Block BLACKBOARD_GREEN_LEFT = new blackboard_green_left();
    public static Block BLACKBOARD_GREEN_MIDDLE = new blackboard_green_middle();
    public static Block BLACKBOARD_GREEN_RIGHT = new blackboard_green_right();

    public static Block CEILING_LIGHT = new ceiling_light();
    public static Block CEILING_LIGHT_WALL = new ceiling_light_wall();

    public static Block PROJECTOR_OLD = new projector_old();
    public static Block PROJECTOR_OLD_COLUMN_LEFT_OFF = new projector_old_column_left_off();
    public static Block PROJECTOR_OLD_COLUMN_RIGHT_OFF = new projector_old_column_right_off();
    public static Block PROJECTOR_OLD_COLUMN_LEFT_ON = new projector_old_column_left_on();
    public static Block PROJECTOR_OLD_COLUMN_RIGHT_ON = new projector_old_column_right_on();


    @SubscribeEvent
    public static void registerBlock(RegistryEvent.Register<Block> event){
        // 半砖
        event.getRegistry().register(MARBLED_FLOOR_BROWN_HALF.setRegistryName("buildfur:marbled_floor_brown_half"));
        event.getRegistry().register(MARBLED_FLOOR_BROWN_DOUBLE.setRegistryName("buildfur:marbled_floor_brown_double"));

        // 其他
        event.getRegistry().register(CONCRETE_WALL_WHITE.setRegistryName("buildfur:concrete_wall_white"));
        event.getRegistry().register(CONCRETE_WALL_WHITE_HALF.setRegistryName("buildfur:concrete_wall_white_half"));
        event.getRegistry().register(CONCRETE_CEILING_COLUMN_WHITE.setRegistryName("buildfur:concrete_ceiling_column_white"));
        event.getRegistry().register(CONCRETE_COLUMN_WHITE.setRegistryName("buildfur:concrete_column_white"));

        event.getRegistry().register(MARBLED_FLOOR_WHITE.setRegistryName("buildfur:marbled_floor_turquoise"));
//        event.getRegistry().register(MARBLED_FLOOR_TURQUOISE.setRegistryName("buildfur:marbled_floor_turquoise"));

        event.getRegistry().register(WOODEN_DESK_BIRCH.setRegistryName("buildfur:wooden_desk_birch"));
        event.getRegistry().register(WOODEN_DESK_BIRCH_MIDDLE.setRegistryName("buildfur:wooden_desk_birch_middle"));
        event.getRegistry().register(WOODEN_CHAIR_BIRCH.setRegistryName("buildfur:wooden_chair_birch"));
        event.getRegistry().register(WOODEN_CHAIR_BIRCH_DOUBLE.setRegistryName("buildfur:wooden_chair_birch_double"));
        event.getRegistry().register(WOODEN_CHAIR_TEACHBUILD_HEAD.setRegistryName("buildfur:wooden_chair_teachbuild_head"));
        event.getRegistry().register(WOODEN_CHAIR_TEACHBUILD_ON.setRegistryName("buildfur:wooden_chair_teachbuild_on"));
        event.getRegistry().register(WOODEN_CHAIR_TEACHBUILD_OFF.setRegistryName("buildfur:wooden_chair_teachbuild_off"));
        event.getRegistry().register(WOODEN_TEACHING.setRegistryName("buildfur:wooden_teaching"));

        event.getRegistry().register(IRON_TEACHING.setRegistryName("buildfur:iron_teaching"));

        event.getRegistry().register(BLACKBOARD_GREEN_LEFT.setRegistryName("buildfur:blackboard_green_left"));
        event.getRegistry().register(BLACKBOARD_GREEN_MIDDLE.setRegistryName("buildfur:blackboard_green_middle"));
        event.getRegistry().register(BLACKBOARD_GREEN_RIGHT.setRegistryName("buildfur:blackboard_green_right"));

        event.getRegistry().register(CEILING_LIGHT.setRegistryName("buildfur:ceiling_light"));
        event.getRegistry().register(CEILING_LIGHT_WALL.setRegistryName("buildfur:ceiling_light_wall"));

        event.getRegistry().register(PROJECTOR_OLD.setRegistryName("buildfur:projector_old"));
        event.getRegistry().register(PROJECTOR_OLD_COLUMN_LEFT_OFF.setRegistryName("buildfur:projector_old_column_left_off"));
        event.getRegistry().register(PROJECTOR_OLD_COLUMN_RIGHT_OFF.setRegistryName("buildfur:projector_old_column_right_off"));
        event.getRegistry().register(PROJECTOR_OLD_COLUMN_LEFT_ON.setRegistryName("buildfur:projector_old_column_left_on"));
        event.getRegistry().register(PROJECTOR_OLD_COLUMN_RIGHT_ON.setRegistryName("buildfur:projector_old_column_right_on"));

        // 方块实体
//        GameRegistry.registerTileEntity(marbled_floor_turquoise_TileEntity.class, new ResourceLocation("buildfur", "marbled_floor_turquoise"));
    }

    @SubscribeEvent
    public static void registerItemBlockModel(ModelRegistryEvent event){
        // 半砖
        ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(MARBLED_FLOOR_BROWN_HALF),0,new ModelResourceLocation(MARBLED_FLOOR_BROWN_HALF.getRegistryName(),"inventory"));

        // 其他
        ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(CONCRETE_WALL_WHITE),0,new ModelResourceLocation(CONCRETE_WALL_WHITE.getRegistryName(),"inventory"));
        ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(CONCRETE_WALL_WHITE_HALF),0,new ModelResourceLocation(CONCRETE_WALL_WHITE_HALF.getRegistryName(),"inventory"));
        ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(CONCRETE_CEILING_COLUMN_WHITE),0,new ModelResourceLocation(CONCRETE_CEILING_COLUMN_WHITE.getRegistryName(),"inventory"));
        ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(CONCRETE_COLUMN_WHITE),0,new ModelResourceLocation(CONCRETE_COLUMN_WHITE.getRegistryName(),"inventory"));

        ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(MARBLED_FLOOR_WHITE),0,new ModelResourceLocation(MARBLED_FLOOR_WHITE.getRegistryName(),"inventory"));
//        ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(MARBLED_FLOOR_TURQUOISE),0,new ModelResourceLocation(MARBLED_FLOOR_TURQUOISE.getRegistryName(),"inventory"));

        ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(WOODEN_DESK_BIRCH),0,new ModelResourceLocation(WOODEN_DESK_BIRCH.getRegistryName(),"inventory"));
        ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(WOODEN_DESK_BIRCH_MIDDLE),0,new ModelResourceLocation(WOODEN_DESK_BIRCH_MIDDLE.getRegistryName(),"inventory"));
        ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(WOODEN_CHAIR_BIRCH),0,new ModelResourceLocation(WOODEN_CHAIR_BIRCH.getRegistryName(),"inventory"));
        ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(WOODEN_CHAIR_BIRCH_DOUBLE),0,new ModelResourceLocation(WOODEN_CHAIR_BIRCH_DOUBLE.getRegistryName(),"inventory"));
        ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(WOODEN_CHAIR_TEACHBUILD_HEAD),0,new ModelResourceLocation(WOODEN_CHAIR_TEACHBUILD_HEAD.getRegistryName(),"inventory"));
        ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(WOODEN_CHAIR_TEACHBUILD_ON),0,new ModelResourceLocation(WOODEN_CHAIR_TEACHBUILD_ON.getRegistryName(),"inventory"));
        ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(WOODEN_CHAIR_TEACHBUILD_OFF),0,new ModelResourceLocation(WOODEN_CHAIR_TEACHBUILD_OFF.getRegistryName(),"inventory"));
        ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(WOODEN_TEACHING),0,new ModelResourceLocation(WOODEN_TEACHING.getRegistryName(),"inventory"));

        ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(IRON_TEACHING),0,new ModelResourceLocation(IRON_TEACHING.getRegistryName(),"inventory"));

        ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(BLACKBOARD_GREEN_LEFT),0,new ModelResourceLocation(BLACKBOARD_GREEN_LEFT.getRegistryName(),"inventory"));
        ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(BLACKBOARD_GREEN_MIDDLE),0,new ModelResourceLocation(BLACKBOARD_GREEN_MIDDLE.getRegistryName(),"inventory"));
        ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(BLACKBOARD_GREEN_RIGHT),0,new ModelResourceLocation(BLACKBOARD_GREEN_RIGHT.getRegistryName(),"inventory"));

        ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(CEILING_LIGHT),0,new ModelResourceLocation(CEILING_LIGHT.getRegistryName(),"inventory"));
        ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(CEILING_LIGHT_WALL),0,new ModelResourceLocation(CEILING_LIGHT_WALL.getRegistryName(),"inventory"));

        ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(PROJECTOR_OLD),0,new ModelResourceLocation(PROJECTOR_OLD.getRegistryName(),"inventory"));
        ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(PROJECTOR_OLD_COLUMN_LEFT_OFF),0,new ModelResourceLocation(PROJECTOR_OLD_COLUMN_LEFT_OFF.getRegistryName(),"inventory"));
        ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(PROJECTOR_OLD_COLUMN_RIGHT_OFF),0,new ModelResourceLocation(PROJECTOR_OLD_COLUMN_RIGHT_OFF.getRegistryName(),"inventory"));
        ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(PROJECTOR_OLD_COLUMN_LEFT_ON),0,new ModelResourceLocation(PROJECTOR_OLD_COLUMN_LEFT_ON.getRegistryName(),"inventory"));
        ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(PROJECTOR_OLD_COLUMN_RIGHT_ON),0,new ModelResourceLocation(PROJECTOR_OLD_COLUMN_RIGHT_ON.getRegistryName(),"inventory"));

    }
}
