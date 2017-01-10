package com.sedlak.testmod.client;


import com.github.sedlak477.mrglgaghcore.feature.FeatureLoader;
import com.sedlak.testmod.TestMod;
import com.sedlak.testmod.client.tesr.TESrCustomRender;
import com.sedlak.testmod.common.CommonProxy;
import com.sedlak.testmod.common.Features;
import com.sedlak.testmod.common.tileentity.TileCustomRender;
import net.minecraftforge.fml.client.registry.ClientRegistry;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ClientProxy extends CommonProxy {

    @Override
    public void preInit(FMLPreInitializationEvent e) {
        super.preInit(e);
        GameRegistry.registerTileEntity(TileCustomRender.class, "custom_render");
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
        ClientRegistry.bindTileEntitySpecialRenderer(TileCustomRender.class, new TESrCustomRender());
    }
}
