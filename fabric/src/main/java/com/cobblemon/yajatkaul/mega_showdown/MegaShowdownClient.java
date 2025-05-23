package com.cobblemon.yajatkaul.mega_showdown;

import com.cobblemon.yajatkaul.mega_showdown.block.ModBlocks;
import com.cobblemon.yajatkaul.mega_showdown.block.custom.entity.ModBlockEntities;
import com.cobblemon.yajatkaul.mega_showdown.block.custom.entity.renderer.PedestalBlockEntityRenderer;
import com.cobblemon.yajatkaul.mega_showdown.megaevo.Controls;
import com.cobblemon.yajatkaul.mega_showdown.trinket.TrinketsRegisteration;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.minecraft.client.render.RenderLayer;
import net.minecraft.client.render.block.entity.BlockEntityRendererFactories;

public class MegaShowdownClient implements ClientModInitializer {

    @Override
    public void onInitializeClient() {
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.GRACIDEA_FLOWER, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.POTTED_GRACIDEA, RenderLayer.getCutout());

        Controls.register();

        TrinketsRegisteration.register();

        BlockEntityRendererFactories.register(ModBlockEntities.PEDESTAL_BE, PedestalBlockEntityRenderer::new);
    }
}
