package com.zetsuki.dmcmusicdiscs.sound;

import com.nimbusds.jose.util.Resource;
import com.zetsuki.dmcmusicdiscs.DMCMusicDiscs;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.world.item.JukeboxSong;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModSounds {

    // List of sounds we will add, using forge registers
    public static final DeferredRegister<SoundEvent> SOUND_EVENTS =
            DeferredRegister.create(ForgeRegistries.SOUND_EVENTS, DMCMusicDiscs.MOD_ID);

    // Sound to add
    public static final RegistryObject<SoundEvent> CUSTOM_SOUND = SOUND_EVENTS.register("custom_sound",
            () -> SoundEvent.createVariableRangeEvent(ResourceLocation
                    .fromNamespaceAndPath(DMCMusicDiscs.MOD_ID, "custom_sound")
            )
    );

    // Resource key
    public static final ResourceKey<JukeboxSong> CUSTOM_SOUND_KEY = ResourceKey.create(Registries.JUKEBOX_SONG,
            ResourceLocation.fromNamespaceAndPath(DMCMusicDiscs.MOD_ID, "custom_sound"));

    // Save all object in SOUND_EVENTS on the event bus
    public static void register(IEventBus eventBus) {
        SOUND_EVENTS.register(eventBus);
    }
}
