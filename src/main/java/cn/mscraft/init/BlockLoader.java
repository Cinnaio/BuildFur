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
    public static Block CONCRETE_WALL_WHITE = new concrete_wall_white();
    public static Block CONCRETE_WALL_WHITE_HALF = new concrete_wall_white_half();
    public static Block CONCRETE_CEILING_COLUMN_WHITE = new concrete_ceiling_column_white();
    public static Block CONCRETE_COLUMN_WHITE = new concrete_column_white();
    public static Block MARBLED_FLOOR_WHITE = new marbled_floor_white();
    public static Block MARBLED_FLOOR_BROWN = new marbled_floor_brown();
    public static Block MARBLED_FLOOR_BROWN_HALF = new marbled_floor_brown_half();

    public static Block WOODEN_DESK_BIRCH = new wooden_desk_birch();
    public static Block WOODEN_DESK_BIRCH_DOWNHALF = new wooden_desk_birch_downhalf();
    public static Block WOODEN_CHAIR_BIRCH = new wooden_chair_birch();
    public static Block BLACKBOARD_GREEN = new blackboard_green();
    public static Block CEILLING_LIGHT = new ceilling_light();

    @SubscribeEvent
    public static void registerBlock(RegistryEvent.Register<Block> event){
        event.getRegistry().register(CONCRETE_WALL_WHITE.setRegistryName("buildfur:concrete_wall_white"));
        event.getRegistry().register(CONCRETE_WALL_WHITE_HALF.setRegistryName("buildfur:concrete_wall_white_half"));
        event.getRegistry().register(CONCRETE_CEILING_COLUMN_WHITE.setRegistryName("buildfur:concrete_ceiling_column_white"));
        event.getRegistry().register(CONCRETE_COLUMN_WHITE.setRegistryName("buildfur:concrete_column_white"));
        event.getRegistry().register(MARBLED_FLOOR_WHITE.setRegistryName("buildfur:marbled_floor_white"));
        event.getRegistry().register(MARBLED_FLOOR_BROWN.setRegistryName("buildfur:marbled_floor_brown"));
        event.getRegistry().register(MARBLED_FLOOR_BROWN_HALF.setRegistryName("buildfur:marbled_floor_brown_half"));

        event.getRegistry().register(WOODEN_DESK_BIRCH.setRegistryName("buildfur:wooden_desk_birch"));
        event.getRegistry().register(WOODEN_DESK_BIRCH_DOWNHALF.setRegistryName("buildfur:wooden_desk_birch_downhalf"));
        event.getRegistry().register(WOODEN_CHAIR_BIRCH.setRegistryName("buildfur:wooden_chair_birch"));
        event.getRegistry().register(BLACKBOARD_GREEN.setRegistryName("buildfur:blackboard_green"));
        event.getRegistry().register(CEILLING_LIGHT.setRegistryName("buildfur:ceilling_light"));
    }

    @SubscribeEvent
    public static void registerItemBlockModel(ModelRegistryEvent event){
        ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(CONCRETE_WALL_WHITE),0,new ModelResourceLocation(CONCRETE_WALL_WHITE.getRegistryName(),"inventory"));
        ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(CONCRETE_WALL_WHITE_HALF),0,new ModelResourceLocation(CONCRETE_WALL_WHITE_HALF.getRegistryName(),"inventory"));
        ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(CONCRETE_CEILING_COLUMN_WHITE),0,new ModelResourceLocation(CONCRETE_CEILING_COLUMN_WHITE.getRegistryName(),"inventory"));
        ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(CONCRETE_COLUMN_WHITE),0,new ModelResourceLocation(CONCRETE_COLUMN_WHITE.getRegistryName(),"inventory"));
        ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(MARBLED_FLOOR_WHITE),0,new ModelResourceLocation(MARBLED_FLOOR_WHITE.getRegistryName(),"inventory"));
        ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(MARBLED_FLOOR_BROWN),0,new ModelResourceLocation(MARBLED_FLOOR_BROWN.getRegistryName(),"inventory"));
        ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(MARBLED_FLOOR_BROWN_HALF),0,new ModelResourceLocation(MARBLED_FLOOR_BROWN_HALF.getRegistryName(),"inventory"));

        ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(WOODEN_DESK_BIRCH),0,new ModelResourceLocation(WOODEN_DESK_BIRCH.getRegistryName(),"inventory"));
        ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(WOODEN_DESK_BIRCH_DOWNHALF),0,new ModelResourceLocation(WOODEN_DESK_BIRCH_DOWNHALF.getRegistryName(),"inventory"));
        ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(WOODEN_CHAIR_BIRCH),0,new ModelResourceLocation(WOODEN_CHAIR_BIRCH.getRegistryName(),"inventory"));
        ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(BLACKBOARD_GREEN),0,new ModelResourceLocation(BLACKBOARD_GREEN.getRegistryName(),"inventory"));
        ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(CEILLING_LIGHT),0,new ModelResourceLocation(CEILLING_LIGHT.getRegistryName(),"inventory"));

    }
}
