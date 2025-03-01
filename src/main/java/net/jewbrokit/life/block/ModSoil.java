package net.jewbrokit.life.block;

import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraftforge.registries.RegistryObject;

public class ModSoil extends ModBlock {

    public static final RegistryObject<Block> SILT_GRASS_BLOCK = registerBlock("silt_grass_block",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.GRASS_BLOCK)));

    public ModSoil(ModBlock block, int PhLvl) {



    }

}
