package com.sedlak.testmod.common;


import com.github.sedlak477.mrglgaghcore.feature.Feature;
import com.sedlak.testmod.TestMod;
import com.sedlak.testmod.common.blocks.BlockBase;
import com.sedlak.testmod.common.items.ItemBase;
import com.sedlak.testmod.common.items.ItemBlockBase;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.item.Item;

public class Features {

    @Feature
    public static final Item doesNothing = new ItemBase("does_nothing").setCreativeTab(TestMod.defaultTab);

    @Feature
    public static final Block justABlock = new BlockBase("just_a_block", Material.GOURD).setLightLevel(1.0f).setCreativeTab(TestMod.defaultTab);
    //Item in players inventory that gets placed by the player
    @Feature
    public static final Item justABlockItem = new ItemBlockBase(justABlock);

}
