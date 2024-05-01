package net.verzex.notenoughenergy.item;

import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.verzex.notenoughenergy.NotEnoughEnergy;

public class ModItems {

    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, NotEnoughEnergy.MOD_ID);

    public static final RegistryObject<Item> COPPER_WIRES = ITEMS.register("copper_wires",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> AFIS = ITEMS.register("afis",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> MIX_REDSTONE = ITEMS.register("mix_redstone",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> CONDUCTIVE_REDSTONE = ITEMS.register("conductive_redstone",
            () -> new Item(new Item.Properties()));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }

}
