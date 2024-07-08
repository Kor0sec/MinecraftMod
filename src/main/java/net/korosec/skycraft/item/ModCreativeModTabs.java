package net.korosec.skycraft.item;

import net.korosec.skycraft.SkyCraft;
import net.korosec.skycraft.block.ModBlocks;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class ModCreativeModTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, SkyCraft.MODID);

    public static final RegistryObject<CreativeModeTab> SKYCRAFT_TAB = CREATIVE_MODE_TABS.register("skycraft_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.AMBER.get()))
                    .title(Component.translatable("creativetab.skycrafttab"))
                    .displayItems((itemDisplayParameters, output) -> {
                        output.accept(ModItems.AMBER.get());
                        output.accept(ModBlocks.DRYING_TABLE.get());
                    })
                    .build());


    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }
}
