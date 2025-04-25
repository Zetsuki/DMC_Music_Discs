package com.zetsuki.dmc_music_discs.sound;

import com.zetsuki.dmc_music_discs.DMCMusicDiscs;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.world.item.JukeboxSong;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

// Sounds of the mods, here songs from Devil May Cry
public class ModSounds {

    // Create register to add custom sounds
    public static final DeferredRegister<SoundEvent> SOUND_EVENTS =
            DeferredRegister.create(ForgeRegistries.SOUND_EVENTS, DMCMusicDiscs.MOD_ID);

    public static final RegistryObject<SoundEvent> SILVER_BULLET = registerSoundEvent("silver_bullet_by_casey_edwards");
    public static final ResourceKey<JukeboxSong> SILVER_BULLET_KEY = ResourceKey.create(Registries.JUKEBOX_SONG,
            ResourceLocation.fromNamespaceAndPath(DMCMusicDiscs.MOD_ID, "silver_bullet_by_casey_edwards"));


    // Add a custom sound to the register
    private static RegistryObject<SoundEvent> registerSoundEvent(String name) {
        return SOUND_EVENTS.register(name, () -> SoundEvent.createVariableRangeEvent(ResourceLocation.fromNamespaceAndPath(DMCMusicDiscs.MOD_ID, name)));
    }

    // Link between DeferedRegister and Forge
    public static void register(IEventBus eventBus) {
        SOUND_EVENTS.register(eventBus);
    }
}
