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

    public static final RegistryObject<SoundEvent> SILVER_BULLET = registerSound("silver_bullet_by_casey_edwards");
    public static final RegistryObject<SoundEvent> BURY_THE_LIGHT = registerSound("bury_the_light_by_casey_edwards");
    public static final RegistryObject<SoundEvent> DEVIL_TRIGGER = registerSound("devil_trigger_by_casey_edwards");

    public static final ResourceKey<JukeboxSong> SILVER_BULLET_KEY = createJukeboxSongKey("silver_bullet_by_casey_edwards");
    public static final ResourceKey<JukeboxSong> BURY_THE_LIGHT_KEY = createJukeboxSongKey("bury_the_light_by_casey_edwards");
    public static final ResourceKey<JukeboxSong> DEVIL_TRIGGER_KEY = createJukeboxSongKey("devil_trigger_by_casey_edwards");


    private static RegistryObject<SoundEvent> registerSound(String name) {
        RegistryObject<SoundEvent> sound = SOUND_EVENTS.register(name, () ->
                SoundEvent.createVariableRangeEvent(ResourceLocation.fromNamespaceAndPath(DMCMusicDiscs.MOD_ID, name))
        );
        return sound;
    }

    private static ResourceKey<JukeboxSong> createJukeboxSongKey(String name) {
        ResourceKey<JukeboxSong> key = ResourceKey.create(Registries.JUKEBOX_SONG,
                ResourceLocation.fromNamespaceAndPath(DMCMusicDiscs.MOD_ID, name));
        return key;
    }

    // Save all object in SOUND_EVENTS on the event bus
    public static void register(IEventBus eventBus) {
        SOUND_EVENTS.register(eventBus);
    }
}
