package com.zetsuki.dmcmusicdiscs.sound;

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

    // Sounds to add
    public static final RegistryObject<SoundEvent> SILVER_BULLET_BY_CASEY_EDWARDS = SOUND_EVENTS.register("silver_bullet_by_casey_edwards",
            () -> SoundEvent.createVariableRangeEvent(ResourceLocation
                    .fromNamespaceAndPath(DMCMusicDiscs.MOD_ID, "silver_bullet_by_casey_edwards")
            )
    );

    public static final RegistryObject<SoundEvent> BURY_THE_LIGHT_BY_CASEY_EDWARDS = SOUND_EVENTS.register("bury_the_light_by_casey_edwards",
            () -> SoundEvent.createVariableRangeEvent(ResourceLocation
                    .fromNamespaceAndPath(DMCMusicDiscs.MOD_ID, "bury_the_light_by_casey_edwards")
            )
    );

    public static final RegistryObject<SoundEvent> DEVIL_TRIGGER_BY_CASEY_EDWARDS = SOUND_EVENTS.register("devil_trigger_by_casey_edwards",
            () -> SoundEvent.createVariableRangeEvent(ResourceLocation
                    .fromNamespaceAndPath(DMCMusicDiscs.MOD_ID, "devil_trigger_by_casey_edwards")
            )
    );

    // Resource key
    public static final ResourceKey<JukeboxSong> SILVER_BULLET_KEY = ResourceKey.create(Registries.JUKEBOX_SONG,
            ResourceLocation.fromNamespaceAndPath(DMCMusicDiscs.MOD_ID, "silver_bullet_by_casey_edwards"));

    public static final ResourceKey<JukeboxSong> SILVER_BULLET_BY_CASEY_EDWARDS_KEY = ResourceKey.create(Registries.JUKEBOX_SONG,
            ResourceLocation.fromNamespaceAndPath(DMCMusicDiscs.MOD_ID, "bury_the_light_by_casey_edwards"));

    public static final ResourceKey<JukeboxSong> DEVIL_TRIGGER_KEY = ResourceKey.create(Registries.JUKEBOX_SONG,
            ResourceLocation.fromNamespaceAndPath(DMCMusicDiscs.MOD_ID, "devil_trigger_by_casey_edwards"));

    // Save all object in SOUND_EVENTS on the event bus
    public static void register(IEventBus eventBus) {
        SOUND_EVENTS.register(eventBus);
    }
}
