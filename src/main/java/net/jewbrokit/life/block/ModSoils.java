package net.jewbrokit.life.block;

import net.jewbrokit.life.LIFE;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModSoils extends ModBlocks {

    public static final DeferredRegister<Block> SOILS =
            DeferredRegister.create(ForgeRegistries.BLOCKS, LIFE.MOD_ID);

    public static final RegistryObject<Block> SILT_SOIL = ModSoils.registerBlock("silt_soil",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.DIRT)));

    public static final RegistryObject<Block> CLAY_SOIL = registerBlock("clay_soil",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.DIRT)));

    public static final RegistryObject<Block> LOAMY_SOIL = registerBlock("loamy_soil",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.COARSE_DIRT)));

    public static final RegistryObject<Block> SANDY_SOIL = registerBlock("sandy_soil",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.ROOTED_DIRT)));

    public static void register(IEventBus eventBus) {
        SOILS.register(eventBus);
    }

    public ModSoils(ModBlocks block, int PhLvl) {



    }

}
