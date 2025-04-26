package com.zetsuki.dmcmusicdiscs.datagen;

import com.zetsuki.dmcmusicdiscs.DMCMusicDiscs;
import com.zetsuki.dmcmusicdiscs.item.ModItems;
import com.zetsuki.dmcmusicdiscs.loot.AddItemModifier;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.storage.loot.predicates.LootItemCondition;
import net.minecraft.world.level.storage.loot.predicates.LootItemRandomChanceCondition;
import net.minecraftforge.common.data.GlobalLootModifierProvider;
import net.minecraftforge.common.loot.LootTableIdCondition;

import java.util.concurrent.CompletableFuture;

public class ModGlobalLootModifierProvider extends GlobalLootModifierProvider {
    public ModGlobalLootModifierProvider(PackOutput output, CompletableFuture<HolderLookup.Provider> registries) {
        super(output, DMCMusicDiscs.MOD_ID, registries);
    }

    @Override
    protected void start(HolderLookup.Provider registries) {
        createModifier("devil_trigger_from_wither", "entities/wither", 1f, ModItems.DEVIL_TRIGGER_DISC.get());
        createModifier("bury_the_light_from_ender_dragon", "entities/ender_dragon", 1f, ModItems.BURY_THE_LIGHT_DISC.get());
        createModifier("silver_bullet_from_phantom", "entities/phantom", 0.1f, ModItems.SILVER_BULLET_DISC.get());
    }

    private void createModifier(String name, String entityLootTable, float chance, Item item) {
        add(name, new AddItemModifier(new LootItemCondition[]{
                new LootTableIdCondition.Builder(ResourceLocation.withDefaultNamespace(entityLootTable))
                        .and(LootItemRandomChanceCondition.randomChance(chance))
                        .build()
        }, item));
    }
}
