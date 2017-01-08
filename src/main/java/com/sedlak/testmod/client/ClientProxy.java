package com.sedlak.testmod.client;


import com.github.sedlak477.mrglgaghcore.feature.FeatureLoader;
import com.sedlak.testmod.TestMod;
import com.sedlak.testmod.common.CommonProxy;
import com.sedlak.testmod.common.Features;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

public class ClientProxy extends CommonProxy {

    @Override
    public void preInit(FMLPreInitializationEvent e) {
        super.preInit(e);
    }

    @Override
    public void init(FMLInitializationEvent e) {
        super.init(e);
        FeatureLoader.registerItemRenderer(Features.class, TestMod.MODID);
        FeatureLoader.registerBlockRenderer(Features.class, TestMod.MODID);
    }

    @Override
    public void postInit(FMLPostInitializationEvent e) {
        super.postInit(e);
    }
}
