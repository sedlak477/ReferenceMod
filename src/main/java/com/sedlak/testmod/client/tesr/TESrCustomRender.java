package com.sedlak.testmod.client.tesr;

import com.sedlak.testmod.TestMod;
import com.sedlak.testmod.common.tileentity.TileCustomRender;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.Tessellator;
import net.minecraft.client.renderer.VertexBuffer;
import net.minecraft.client.renderer.tileentity.TileEntitySpecialRenderer;
import net.minecraft.client.renderer.vertex.DefaultVertexFormats;
import net.minecraft.util.ResourceLocation;

public class TESrCustomRender extends TileEntitySpecialRenderer<TileCustomRender> {

    @Override
    public void renderTileEntityAt(TileCustomRender te, double x, double y, double z, float partialTicks, int destroyStage) {
        Minecraft.getMinecraft().renderEngine.bindTexture(new ResourceLocation(TestMod.MODID, "items/does_nothing"));
        GlStateManager.pushMatrix();
        GlStateManager.translate(x, y, z);
        VertexBuffer vb = Tessellator.getInstance().getBuffer();
        vb.begin(7, DefaultVertexFormats.POSITION_TEX);
        vb.pos(0, 0, 0.5).tex(0, 0).endVertex();
        vb.pos(0, 1, 0.5).tex(0, 1).endVertex();
        vb.pos(0.7, 1, 1).tex(1, 0).endVertex();
        vb.pos(0, 0.8, 0).tex(1, 1).endVertex();
        Tessellator.getInstance().draw();
        GlStateManager.popMatrix();
    }
}
