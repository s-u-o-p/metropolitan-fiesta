package com.doinc.themod;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.mixin.biome.BuiltinBiomesAccessor;

import com.doinc.themod.registry.ModItems;
import com.doinc.themod.dim.Thefatnothing;
import com.doinc.themod.discs.Songs;
import com.doinc.themod.loot.fishingtable;
import net.minecraft.block.SpongeBlock;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.BuiltinRegistries;
import net.minecraft.util.registry.Registry;
import net.minecraft.util.registry.RegistryKey;
import net.minecraft.world.biome.Biome;
public class Themod implements ModInitializer {
    public static final String MOD_ID = "themod";
    

	@Override
    public void onInitialize() {
        Registry.register(Registry.SOUND_EVENT, Songs.YKHG, Songs.YOUKAIHARTMAN);
        ModItems.RegisterItems();
        fishingtable.addFishTable();
        Registry.register(BuiltinRegistries.CONFIGURED_SURFACE_BUILDER, new Identifier("themod", "the_fat_nothing"), Thefatnothing.OBSIDIAN_SURFACE_BUILDER);
        Registry.register(BuiltinRegistries.BIOME, Thefatnothing.THE_FAT_NOTHING_KEY.getValue(), Thefatnothing.THE_FAT_NOTHING);
        BuiltinBiomesAccessor.getBY_RAW_ID().put(BuiltinRegistries.BIOME.getRawId(Thefatnothing.THE_FAT_NOTHING), Thefatnothing.THE_FAT_NOTHING_KEY);
 //       TrinketSlots.addSlot(SlotGroups.HAND, Slots.RING, new Identifier("trinkets", "textures/item/empty_trinket_slot_ring.png"));

        System.out.println("penisss");
    }
    
}
