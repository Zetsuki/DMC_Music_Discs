package com.zetsuki.dmcmusicdiscs.item;

import com.zetsuki.dmcmusicdiscs.DMCMusicDiscs;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {

    // List of items we will add, using forge registers
    private final static DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, DMCMusicDiscs.MOD_ID);

    // Item to add
    public static final RegistryObject<Item> CUSTOM_DISC = ITEMS.register("custom_disc",
            () -> new Item(new Item.Properties()
                    .setId(ITEMS.key("custom_disc"))
                    .stacksTo(1)
            )
    );

    // Save all object in ITEMS on the event bus
    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
