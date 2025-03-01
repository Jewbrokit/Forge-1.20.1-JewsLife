package net.jewbrokit.life.item;

import net.jewbrokit.life.LIFE;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class ModCreativeModeTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVEMODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, LIFE.MOD_ID);

    public static final RegistryObject<CreativeModeTab> LIFE_CROPS = CREATIVEMODE_TABS.register( "lifecrops",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.WHITE_RICE_GRAIN.get()))
                    .title(Component.translatable("creativetab.lifecrops"))
                    .displayItems((pParameters, pOutput) -> {

                        pOutput.accept(ModItems.WHITE_RICE_GRAIN.get());



                    })
                    .build());

    public static final RegistryObject<CreativeModeTab> LIFE_BLOCKS = CREATIVEMODE_TABS.register( "lifeblocks",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.SILT_GRASS_ITEM.get()))
                    .title(Component.translatable("creativetab.lifeblocks"))
                    .displayItems((pParameters, pOutput) -> {

                        pOutput.accept(ModItems.SILT_GRASS_ITEM.get());




                    })
                    .build());

    public static void register(IEventBus eventBus) {
        CREATIVEMODE_TABS.register(eventBus);
    }
}
