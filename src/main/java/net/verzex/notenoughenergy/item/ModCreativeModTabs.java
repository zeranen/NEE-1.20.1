package net.verzex.notenoughenergy.item;

import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;
import net.verzex.notenoughenergy.NotEnoughEnergy;
import net.verzex.notenoughenergy.block.ModBlocks;

public class ModCreativeModTabs {
    public  static  final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, NotEnoughEnergy.MOD_ID);

    public static final RegistryObject<CreativeModeTab> NEE_TAB = CREATIVE_MODE_TABS.register("nee_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.CONDUCTIVE_REDSTONE.get()))
                    .title(Component.translatable("creativetab.nee_tab"))
                    .displayItems(((itemDisplayParameters, output) -> {
                        output.accept(ModItems.MIX_REDSTONE.get());
                        output.accept(ModItems.CONDUCTIVE_REDSTONE.get());
                        output.accept(ModItems.AFIS.get());
                        output.accept(ModItems.COPPER_WIRES.get());



                        output.accept(ModBlocks.AFIS_ORE_BLOCK.get());







                    }))
                    .build());

    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }


}
