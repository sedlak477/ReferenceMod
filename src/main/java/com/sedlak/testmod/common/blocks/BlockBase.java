package com.sedlak.testmod.common.blocks;


import com.sedlak.testmod.TestMod;
import net.minecraft.block.Block;
import net.minecraft.block.material.MapColor;
import net.minecraft.block.material.Material;
import net.minecraft.util.ResourceLocation;

public class BlockBase extends Block {

    public BlockBase(String unlocalizedName, Material material){
        this(unlocalizedName, material, material.getMaterialMapColor());
    }

    public BlockBase(String unlocalizedName, Material material, MapColor mapColor) {
        super(material, mapColor);
        setUnlocalizedName(unlocalizedName);
        setRegistryName(new ResourceLocation(TestMod.MODID, unlocalizedName));
    }
}
