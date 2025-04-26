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
        add("devil_trigger_from_wither", new AddItemModifier(new LootItemCondition[] {
                new LootTableIdCondition.Builder(ResourceLocation.withDefaultNamespace("entities/wither"))
                        .and(LootItemRandomChanceCondition.randomChance(1f)).build() },
                ModItems.DEVIL_TRIGGER_DISC.get()));
        add("bury_the_light_from_ender_dragon", new AddItemModifier(new LootItemCondition[] {
                new LootTableIdCondition.Builder(ResourceLocation.withDefaultNamespace("entities/ender_dragon"))
                        .and(LootItemRandomChanceCondition.randomChance(1f)).build() },
                ModItems.BURY_THE_LIGHT_DISC.get()));
        add("silver_bullet_from_phantom", new AddItemModifier(new LootItemCondition[] {
                new LootTableIdCondition.Builder(ResourceLocation.withDefaultNamespace("entities/phantom"))
                        .and(LootItemRandomChanceCondition.randomChance(0.1f)).build() },
                ModItems.SILVER_BULLET_DISC.get()));
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
