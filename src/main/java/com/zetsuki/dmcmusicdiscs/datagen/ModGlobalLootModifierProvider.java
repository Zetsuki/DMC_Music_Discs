package com.zetsuki.dmcmusicdiscs.datagen;

import com.zetsuki.dmcmusicdiscs.DMCMusicDiscs;
import com.zetsuki.dmcmusicdiscs.item.ModItems;
import com.zetsuki.dmcmusicdiscs.loot.AddItemModifier;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
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
        add("disc_from_creeper", new AddItemModifier(new LootItemCondition[] {
                new LootTableIdCondition.Builder(ResourceLocation.withDefaultNamespace("entities/creeper"))
                        .and(LootItemRandomChanceCondition.randomChance(0.5f)).build() },
                ModItems.DEVIL_TRIGGER_DISC.get()));
        /*
        this.add("kohlrabi_seeds_from_short_grass",
                new AddItemModifier(new LootItemCondition[] {
                        LootItemBlockStatePropertyCondition.hasBlockStateProperties(Blocks.SHORT_GRASS).build(),
                        LootItemRandomChanceCondition.randomChance(0.25f).build() }, ModItems.KOHLRABI_SEEDS.get()));
        this.add("kohlrabi_seeds_to_tall_grass",
                new AddItemModifier(new LootItemCondition[] {
                        LootItemBlockStatePropertyCondition.hasBlockStateProperties(Blocks.TALL_GRASS).build(),
                        LootItemRandomChanceCondition.randomChance(0.25f).build() }, ModItems.KOHLRABI_SEEDS.get()));

        this.add("chisel_from_jungle_temple",
                new AddItemModifier(new LootItemCondition[] {
                        new LootTableIdCondition.Builder(ResourceLocation.withDefaultNamespace("chests/jungle_temple")).build()
                }, ModItems.CHISEL.get()));

        add("kohlrabi_from_creeper", new AddItemModifier(new LootItemCondition[] {
                new LootTableIdCondition.Builder(ResourceLocation.withDefaultNamespace("entities/creeper"))
                        .and(LootItemRandomChanceCondition.randomChance(0.5f)).build() }, // modified by the creeper's own loot table
                ModItems.KOHLRABI.get()));*/

    }
}
