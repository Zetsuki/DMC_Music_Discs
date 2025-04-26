package com.zetsuki.dmcmusicdiscs.item;

import com.zetsuki.dmcmusicdiscs.DMCMusicDiscs;
import com.zetsuki.dmcmusicdiscs.sound.ModSounds;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.JukeboxSong;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {

    // List of items we will add, using forge registers
    private final static DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, DMCMusicDiscs.MOD_ID);

    // Items to add
    public static final RegistryObject<Item> SILVER_BULLET_DISC = registerDisc(
            "silver_bullet_disc", ModSounds.SILVER_BULLET_KEY);

    public static final RegistryObject<Item> BURY_THE_LIGHT_DISC = registerDisc(
            "bury_the_light_disc", ModSounds.BURY_THE_LIGHT_KEY);

    public static final RegistryObject<Item> DEVIL_TRIGGER_DISC = registerDisc(
            "devil_trigger_disc", ModSounds.DEVIL_TRIGGER_KEY);

    private static RegistryObject<Item> registerDisc(String name, ResourceKey<JukeboxSong> soundKey) {
        return ITEMS.register(name,
                () -> new Item(new Item.Properties()
                        .setId(ITEMS.key(name))
                        .stacksTo(1)
                        .jukeboxPlayable(soundKey)
                )
        );
    }

    // Save all object in ITEMS on the event bus
    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
