package com.zetsuki.dmcmusicdiscs.item;

import com.zetsuki.dmcmusicdiscs.DMCMusicDiscs;
import com.zetsuki.dmcmusicdiscs.sound.ModSounds;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {

    // List of items we will add, using forge registers
    private final static DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, DMCMusicDiscs.MOD_ID);

    // Items to add
    public static final RegistryObject<Item> SILVER_BULLET_DISC = ITEMS.register("silver_bullet_disc",
            () -> new Item(new Item.Properties()
                    .setId(ITEMS.key("silver_bullet_disc"))
                    .stacksTo(1)
                    .jukeboxPlayable(ModSounds.SILVER_BULLET_KEY)
            )
    );

    public static final RegistryObject<Item> BURY_THE_LIGHT_DISC = ITEMS.register("bury_the_light_disc",
            () -> new Item(new Item.Properties()
                    .setId(ITEMS.key("bury_the_light_disc"))
                    .stacksTo(1)
                    .jukeboxPlayable(ModSounds.SILVER_BULLET_BY_CASEY_EDWARDS_KEY)
            )
    );

    public static final RegistryObject<Item> DEVIL_TRIGGER_DISC = ITEMS.register("devil_trigger_disc",
            () -> new Item(new Item.Properties()
                    .setId(ITEMS.key("devil_trigger_disc"))
                    .stacksTo(1)
                    .jukeboxPlayable(ModSounds.DEVIL_TRIGGER_KEY)
            )
    );

    // Save all object in ITEMS on the event bus
    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
