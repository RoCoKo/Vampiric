package com.twojeremys.vampiric.init;

import com.twojeremys.vampiric.blocks.BlockBase;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

import java.util.ArrayList;
import java.util.List;

public class ModBlocks {
    public static final List<Block> BLOCKS = new ArrayList<Block>();

    public static final Block SILVER_BLOCK = new BlockBase("silver_block", Material.IRON);
}
