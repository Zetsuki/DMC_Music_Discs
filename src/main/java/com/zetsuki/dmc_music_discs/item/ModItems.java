package com.zetsuki.dmc_music_discs.item;

import com.zetsuki.dmc_music_discs.DMCMusicDiscs;
import com.zetsuki.dmc_music_discs.sound.ModSounds;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

// Items of the mod
public class ModItems {

    // Create register to add custom items
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, DMCMusicDiscs.MOD_ID);

    public static final RegistryObject<Item> SILVER_BULLET_MUSIC_DISC = ITEMS.register
            ("silver_bullet_music_disc", () -> new Item(new Item.Properties().useItemDescriptionPrefix().setId(ResourceKey.create(Registries.ITEM, ResourceLocation.parse("dmcmusicdiscs:silver_bullet_music_disc"))).jukeboxPlayable(ModSounds.SILVER_BULLET_KEY).stacksTo(1)));
            //("silver_bullet_music_disc", () -> new Item(new Item.Properties().jukeboxPlayable(ModSounds.SILVER_BULLET_KEY).stacksTo(1)));

    // Link between DeferedRegister and Forge
    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
