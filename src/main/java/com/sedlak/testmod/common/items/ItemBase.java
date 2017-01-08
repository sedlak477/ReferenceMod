package com.sedlak.testmod.common.items;

import com.sedlak.testmod.TestMod;
import net.minecraft.item.Item;
import net.minecraft.util.ResourceLocation;


public class ItemBase extends Item {

    public ItemBase(String unlocalizedName){
        super();
        setUnlocalizedName(unlocalizedName);
        setRegistryName(new ResourceLocation(TestMod.MODID, unlocalizedName));
    }
}
