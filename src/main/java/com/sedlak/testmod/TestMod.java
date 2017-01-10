package com.sedlak.testmod;

import com.github.sedlak477.mrglgaghcore.feature.FeatureLoader;
import com.sedlak.testmod.common.Features;
import net.minecraft.block.Block;
import net.minecraft.client.renderer.Tessellator;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.gen.feature.WorldGenBush;
import net.minecraft.world.gen.feature.WorldGenFlowers;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.registry.VillagerRegistry;

@Mod(modid = TestMod.MODID, version = TestMod.VERSION, name = TestMod.MODNAME)
@Mod.EventBusSubscriber
public class TestMod {

    public static final String MODID = "testmod";
    public static final String MODNAME = "Test Mod";
    public static final String VERSION = "0.1.1";

    @Mod.Instance
    public static TestMod instance = new TestMod();

    public static CreativeTabs defaultTab = new CreativeTabs("default") {
        @Override
        public ItemStack getTabIconItem() {
            return new ItemStack(Features.doesNothing);
        }
    };

    @SidedProxy(clientSide = "com.sedlak.testmod.client.ClientProxy", serverSide = "com.sedlak.testmod.common.CommonProxy")
    public static IProxy proxy;

    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent e){
        proxy.preInit(e);
    }

    @Mod.EventHandler
    public void init(FMLInitializationEvent e){
        proxy.init(e);
    }

    @Mod.EventHandler
    public void postInit(FMLPostInitializationEvent e){
        proxy.postInit(e);
    }

    @SubscribeEvent
    public static void registerBlocks(RegistryEvent.Register<Block> event){
        FeatureLoader.register(Features.class, event.getRegistry());
    }

    @SubscribeEvent
    public static void registerItems(RegistryEvent.Register<Item> event) {
        FeatureLoader.register(Features.class, event.getRegistry());
    }
}
