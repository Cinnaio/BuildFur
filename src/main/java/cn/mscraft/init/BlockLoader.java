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
    public static MarbledFloorGray MARBLED_FLOOR_GRAY_HALF = new MarbledFloorGray.Half();
    public static MarbledFloorGray MARBLED_FLOOR_GRAY_DOUBLE = new MarbledFloorGray.Double();

    // 其他
    public static Block CONCRETE_WALL_WHITE = new ConcreteWallWhite();
    public static Block CONCRETE_WALL_WHITE_HALF = new ConcreteWallWhiteHalf();
    public static Block CONCRETE_CEILING_COLUMN_WHITE = new ConcreteCeilingColumnWhite();
    public static Block CONCRETE_COLUMN_WHITE = new ConcreteColumnWhite();

    public static Block MARBLED_FLOOR_WHITE = new MarbledFloorWhite();
    public static Block MARBLED_FLOOR_GRAY_OVER = new MarbledFloorGrayOver();
    public static Block MARBLED_FLOOR_TURQUOISE = new MarbledFloorTurquoise();
    public static Block MARBLED_FLOOR_RED = new MarbledFloorRed();
    public static Block MARBLED_FLOOR_RED_BORDER = new MarbledFloorRedBorder();

    public static Block WOODEN_DESK_BIRCH = new WoodenDeskBirch();
    public static Block WOODEN_DESK_BIRCH_MIDDLE = new WoodenDeskBirchMiddle();
    public static Block WOODEN_CHAIR_BIRCH = new WoodenChairBirch();
    public static Block WOODEN_CHAIR_BIRCH_DOUBLE = new WoodenChairBirchDouble();
    public static Block WOODEN_CHAIR_TEACHBUILD_HEAD = new WoodenChairTeachbuildHead();
    public static Block WOODEN_CHAIR_TEACHBUILD_ON = new WoodenChairTeachbuildOn();
    public static Block WOODEN_CHAIR_TEACHBUILD_OFF = new WoodenChairTeachbuildOff();
    public static Block WOODEN_TEACHING = new WoodenTeaching();
    public static Block WOODEN_TEACHFLOOR = new WoodenTeachFloor();

    public static Block IRON_TEACHING = new IronTeaching();
    public static Block IRON_HEATING = new IronHeating();

    public static Block SWITCH_LIGHT_ON = new SwitchLightOn();

    public static Block STONE_FLOOR_PEOPLEGO_RED = new StoneFloorPeopleGo.Red();
    public static Block STONE_FLOOR_PEOPLEGO_WHITE = new StoneFloorPeopleGo.White();
    public static Block STONE_FLOOR_PEOPLEGO_GREEN = new StoneFloorPeopleGo.Green();
    public static Block STONE_FLOOR_CEMNENT = new StoneFloorCement();

    public static Block BLACKBOARD_GREEN_LEFT = new BlackboardGreenLeft();
    public static Block BLACKBOARD_GREEN_MIDDLE = new BlackboardGreenMiddle();
    public static Block BLACKBOARD_GREEN_RIGHT = new BlackboardGreenRight();

    public static Block CEILING_LIGHT = new CeilingLight();
    public static Block CEILING_LIGHT_WALL = new CeilingLightWall();

    public static Block WINDOWS_COLUMN_DOWN = new WindowColumnDown();
    public static Block WINDOWS_COLUMN_UP = new WindowColumnUp();

    public static Block CURTAIN_TEACH = new CurtainTeach();
    public static Block CURTAIN_TEACH_CLOTH = new CurtainTeachCloth();

    public static Block PROJECTOR_OLD = new ProjectorOld();
    public static Block PROJECTOR_OLD_COLUMN_LEFT_OFF = new ProjectorOldColumnLeftOff();
    public static Block PROJECTOR_OLD_COLUMN_RIGHT_OFF = new ProjectorOldColumnRightOff();
    public static Block PROJECTOR_OLD_COLUMN_LEFT_ON = new ProjectorOldColumnLeftOn();
    public static Block PROJECTOR_OLD_COLUMN_RIGHT_ON = new ProjectorOldColumnRightOn();

    /*
        方块注册区
     */
    @SubscribeEvent
    public static void registerBlock(RegistryEvent.Register<Block> event){
        // 半砖
        event.getRegistry().register(MARBLED_FLOOR_GRAY_HALF.setRegistryName("buildfur:marbled_floor_gray_half"));
        event.getRegistry().register(MARBLED_FLOOR_GRAY_DOUBLE.setRegistryName("buildfur:marbled_floor_gray_double"));

        // 其他
        event.getRegistry().register(CONCRETE_WALL_WHITE.setRegistryName("buildfur:concrete_wall_white"));
        event.getRegistry().register(CONCRETE_WALL_WHITE_HALF.setRegistryName("buildfur:concrete_wall_white_half"));
        event.getRegistry().register(CONCRETE_CEILING_COLUMN_WHITE.setRegistryName("buildfur:concrete_ceiling_column_white"));
        event.getRegistry().register(CONCRETE_COLUMN_WHITE.setRegistryName("buildfur:concrete_column_white"));

        event.getRegistry().register(MARBLED_FLOOR_WHITE.setRegistryName("buildfur:marbled_floor_white"));
        event.getRegistry().register(MARBLED_FLOOR_GRAY_OVER.setRegistryName("buildfur:marbled_floor_gray_over"));
        event.getRegistry().register(MARBLED_FLOOR_TURQUOISE.setRegistryName("buildfur:marbled_floor_turquoise"));
        event.getRegistry().register(MARBLED_FLOOR_RED.setRegistryName("buildfur:marbled_floor_red"));
        event.getRegistry().register(MARBLED_FLOOR_RED_BORDER.setRegistryName("buildfur:marbled_floor_red_border"));

        event.getRegistry().register(WOODEN_DESK_BIRCH.setRegistryName("buildfur:wooden_desk_birch"));
        event.getRegistry().register(WOODEN_DESK_BIRCH_MIDDLE.setRegistryName("buildfur:wooden_desk_birch_middle"));
        event.getRegistry().register(WOODEN_CHAIR_BIRCH.setRegistryName("buildfur:wooden_chair_birch"));
        event.getRegistry().register(WOODEN_CHAIR_BIRCH_DOUBLE.setRegistryName("buildfur:wooden_chair_birch_double"));
        event.getRegistry().register(WOODEN_CHAIR_TEACHBUILD_HEAD.setRegistryName("buildfur:wooden_chair_teachbuild_head"));
        event.getRegistry().register(WOODEN_CHAIR_TEACHBUILD_ON.setRegistryName("buildfur:wooden_chair_teachbuild_on"));
        event.getRegistry().register(WOODEN_CHAIR_TEACHBUILD_OFF.setRegistryName("buildfur:wooden_chair_teachbuild_off"));
        event.getRegistry().register(WOODEN_TEACHING.setRegistryName("buildfur:wooden_teaching"));
        event.getRegistry().register(WOODEN_TEACHFLOOR.setRegistryName("buildfur:wooden_teachfloor"));

        event.getRegistry().register(IRON_TEACHING.setRegistryName("buildfur:iron_teaching"));
        event.getRegistry().register(IRON_HEATING.setRegistryName("buildfur:iron_heating"));

        event.getRegistry().register(SWITCH_LIGHT_ON.setRegistryName("buildfur:switch_light_on"));

        event.getRegistry().register(STONE_FLOOR_PEOPLEGO_RED.setRegistryName("buildfur:stone_floor_peoplego_red"));
        event.getRegistry().register(STONE_FLOOR_PEOPLEGO_WHITE.setRegistryName("buildfur:stone_floor_peoplego_white"));
        event.getRegistry().register(STONE_FLOOR_PEOPLEGO_GREEN.setRegistryName("buildfur:stone_floor_peoplego_green"));
        event.getRegistry().register(STONE_FLOOR_CEMNENT.setRegistryName("buildfur:stone_floor_cement"));

        event.getRegistry().register(BLACKBOARD_GREEN_LEFT.setRegistryName("buildfur:blackboard_green_left"));
        event.getRegistry().register(BLACKBOARD_GREEN_MIDDLE.setRegistryName("buildfur:blackboard_green_middle"));
        event.getRegistry().register(BLACKBOARD_GREEN_RIGHT.setRegistryName("buildfur:blackboard_green_right"));

        event.getRegistry().register(CEILING_LIGHT.setRegistryName("buildfur:ceiling_light"));
        event.getRegistry().register(CEILING_LIGHT_WALL.setRegistryName("buildfur:ceiling_light_wall"));

        event.getRegistry().register(WINDOWS_COLUMN_DOWN.setRegistryName("buildfur:windows_column_down"));
        event.getRegistry().register(WINDOWS_COLUMN_UP.setRegistryName("buildfur:windows_column_up"));

        event.getRegistry().register(CURTAIN_TEACH.setRegistryName("buildfur:curtain_teach"));
        event.getRegistry().register(CURTAIN_TEACH_CLOTH.setRegistryName("buildfur:curtain_teach_cloth"));

        event.getRegistry().register(PROJECTOR_OLD.setRegistryName("buildfur:projector_old"));
        event.getRegistry().register(PROJECTOR_OLD_COLUMN_LEFT_OFF.setRegistryName("buildfur:projector_old_column_left_off"));
        event.getRegistry().register(PROJECTOR_OLD_COLUMN_RIGHT_OFF.setRegistryName("buildfur:projector_old_column_right_off"));
        event.getRegistry().register(PROJECTOR_OLD_COLUMN_LEFT_ON.setRegistryName("buildfur:projector_old_column_left_on"));
        event.getRegistry().register(PROJECTOR_OLD_COLUMN_RIGHT_ON.setRegistryName("buildfur:projector_old_column_right_on"));
    }

    /*
        物品模型注册
     */
    @SubscribeEvent
    public static void registerItemBlockModel(ModelRegistryEvent event){
        // 半砖
        ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(MARBLED_FLOOR_GRAY_HALF),0,new ModelResourceLocation(MARBLED_FLOOR_GRAY_HALF.getRegistryName(),"inventory"));

        // 其他
        ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(CONCRETE_WALL_WHITE),0,new ModelResourceLocation(CONCRETE_WALL_WHITE.getRegistryName(),"inventory"));
        ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(CONCRETE_WALL_WHITE_HALF),0,new ModelResourceLocation(CONCRETE_WALL_WHITE_HALF.getRegistryName(),"inventory"));
        ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(CONCRETE_CEILING_COLUMN_WHITE),0,new ModelResourceLocation(CONCRETE_CEILING_COLUMN_WHITE.getRegistryName(),"inventory"));
        ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(CONCRETE_COLUMN_WHITE),0,new ModelResourceLocation(CONCRETE_COLUMN_WHITE.getRegistryName(),"inventory"));

        ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(MARBLED_FLOOR_WHITE),0,new ModelResourceLocation(MARBLED_FLOOR_WHITE.getRegistryName(),"inventory"));
        ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(MARBLED_FLOOR_GRAY_OVER),0,new ModelResourceLocation(MARBLED_FLOOR_GRAY_OVER.getRegistryName(),"inventory"));
        ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(MARBLED_FLOOR_TURQUOISE),0,new ModelResourceLocation(MARBLED_FLOOR_TURQUOISE.getRegistryName(),"inventory"));
        ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(MARBLED_FLOOR_RED),0,new ModelResourceLocation(MARBLED_FLOOR_RED.getRegistryName(),"inventory"));
        ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(MARBLED_FLOOR_RED_BORDER),0,new ModelResourceLocation(MARBLED_FLOOR_RED_BORDER.getRegistryName(),"inventory"));

        ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(WOODEN_DESK_BIRCH),0,new ModelResourceLocation(WOODEN_DESK_BIRCH.getRegistryName(),"inventory"));
        ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(WOODEN_DESK_BIRCH_MIDDLE),0,new ModelResourceLocation(WOODEN_DESK_BIRCH_MIDDLE.getRegistryName(),"inventory"));
        ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(WOODEN_CHAIR_BIRCH),0,new ModelResourceLocation(WOODEN_CHAIR_BIRCH.getRegistryName(),"inventory"));
        ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(WOODEN_CHAIR_BIRCH_DOUBLE),0,new ModelResourceLocation(WOODEN_CHAIR_BIRCH_DOUBLE.getRegistryName(),"inventory"));
        ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(WOODEN_CHAIR_TEACHBUILD_HEAD),0,new ModelResourceLocation(WOODEN_CHAIR_TEACHBUILD_HEAD.getRegistryName(),"inventory"));
        ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(WOODEN_CHAIR_TEACHBUILD_ON),0,new ModelResourceLocation(WOODEN_CHAIR_TEACHBUILD_ON.getRegistryName(),"inventory"));
        ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(WOODEN_CHAIR_TEACHBUILD_OFF),0,new ModelResourceLocation(WOODEN_CHAIR_TEACHBUILD_OFF.getRegistryName(),"inventory"));
        ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(WOODEN_TEACHING),0,new ModelResourceLocation(WOODEN_TEACHING.getRegistryName(),"inventory"));
        ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(WOODEN_TEACHFLOOR),0,new ModelResourceLocation(WOODEN_TEACHFLOOR.getRegistryName(),"inventory"));

        ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(IRON_TEACHING),0,new ModelResourceLocation(IRON_TEACHING.getRegistryName(),"inventory"));
        ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(IRON_HEATING),0,new ModelResourceLocation(IRON_HEATING.getRegistryName(),"inventory"));

        ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(SWITCH_LIGHT_ON),0,new ModelResourceLocation(SWITCH_LIGHT_ON.getRegistryName(),"inventory"));

        ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(STONE_FLOOR_PEOPLEGO_RED),0,new ModelResourceLocation(STONE_FLOOR_PEOPLEGO_RED.getRegistryName(),"inventory"));
        ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(STONE_FLOOR_PEOPLEGO_WHITE),0,new ModelResourceLocation(STONE_FLOOR_PEOPLEGO_WHITE.getRegistryName(),"inventory"));
        ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(STONE_FLOOR_PEOPLEGO_GREEN),0,new ModelResourceLocation(STONE_FLOOR_PEOPLEGO_GREEN.getRegistryName(),"inventory"));
        ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(STONE_FLOOR_CEMNENT),0,new ModelResourceLocation(STONE_FLOOR_CEMNENT.getRegistryName(),"inventory"));

        ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(BLACKBOARD_GREEN_LEFT),0,new ModelResourceLocation(BLACKBOARD_GREEN_LEFT.getRegistryName(),"inventory"));
        ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(BLACKBOARD_GREEN_MIDDLE),0,new ModelResourceLocation(BLACKBOARD_GREEN_MIDDLE.getRegistryName(),"inventory"));
        ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(BLACKBOARD_GREEN_RIGHT),0,new ModelResourceLocation(BLACKBOARD_GREEN_RIGHT.getRegistryName(),"inventory"));

        ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(CEILING_LIGHT),0,new ModelResourceLocation(CEILING_LIGHT.getRegistryName(),"inventory"));
        ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(CEILING_LIGHT_WALL),0,new ModelResourceLocation(CEILING_LIGHT_WALL.getRegistryName(),"inventory"));

        ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(WINDOWS_COLUMN_DOWN),0,new ModelResourceLocation(WINDOWS_COLUMN_DOWN.getRegistryName(),"inventory"));
        ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(WINDOWS_COLUMN_UP),0,new ModelResourceLocation(WINDOWS_COLUMN_UP.getRegistryName(),"inventory"));

        ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(CURTAIN_TEACH),0,new ModelResourceLocation(CURTAIN_TEACH.getRegistryName(),"inventory"));
        ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(CURTAIN_TEACH_CLOTH),0,new ModelResourceLocation(CURTAIN_TEACH_CLOTH.getRegistryName(),"inventory"));

        ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(PROJECTOR_OLD),0,new ModelResourceLocation(PROJECTOR_OLD.getRegistryName(),"inventory"));
        ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(PROJECTOR_OLD_COLUMN_LEFT_OFF),0,new ModelResourceLocation(PROJECTOR_OLD_COLUMN_LEFT_OFF.getRegistryName(),"inventory"));
        ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(PROJECTOR_OLD_COLUMN_RIGHT_OFF),0,new ModelResourceLocation(PROJECTOR_OLD_COLUMN_RIGHT_OFF.getRegistryName(),"inventory"));
        ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(PROJECTOR_OLD_COLUMN_LEFT_ON),0,new ModelResourceLocation(PROJECTOR_OLD_COLUMN_LEFT_ON.getRegistryName(),"inventory"));
        ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(PROJECTOR_OLD_COLUMN_RIGHT_ON),0,new ModelResourceLocation(PROJECTOR_OLD_COLUMN_RIGHT_ON.getRegistryName(),"inventory"));
    }
}
