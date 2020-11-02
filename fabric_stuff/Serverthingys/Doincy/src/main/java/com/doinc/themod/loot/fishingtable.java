package com.doinc.themod.loot;

import net.fabricmc.fabric.api.loot.v1.FabricLootPoolBuilder;
import net.fabricmc.fabric.api.loot.v1.event.LootTableLoadingCallback;
import net.minecraft.item.Items;
import net.minecraft.loot.ConstantLootTableRange;
import net.minecraft.loot.LootPool;
import net.minecraft.loot.entry.ItemEntry;
import net.minecraft.util.Identifier;

public class fishingtable {

    private static final Identifier COAL_ORE_LOOT_TABLE_ID = new Identifier("minecraft", "blocks/coal_ore");

    public static void addFishTable() {
        LootTableLoadingCallback.EVENT.register((resourceManager, lootManager, identifier, fabricLootSupplierBuilder, lootTableSetter) -> {
            if (new Identifier("minecraft", "blocks/coal_ore").equals(identifier)) {
                FabricLootPoolBuilder poolBuilder = FabricLootPoolBuilder.builder()
                    .rolls(ConstantLootTableRange.create(1))
                    .withEntry(ItemEntry.builder(Items.EGG).build());
        
                fabricLootSupplierBuilder.withPool(poolBuilder.build());
            }
        });
    }
}
