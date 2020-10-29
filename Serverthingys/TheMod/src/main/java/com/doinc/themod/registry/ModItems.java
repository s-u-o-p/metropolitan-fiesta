package com.doinc.themod.registry;

import com.doinc.themod.Themod;

import com.doinc.themod.customclass.IgneousSponge;
import com.doinc.themod.discs.Songs;
import com.doinc.themod.discs.Tdisc;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.MusicDiscItem;
import net.minecraft.util.registry.Registry;
import net.minecraft.util.Identifier;
import net.minecraft.util.Rarity;
import net.minecraft.block.Block;
import net.minecraft.block.Material;
import net.minecraft.block.SmithingTableBlock;
import com.doinc.themod.registry.enchantments.Adaptive;
import com.doinc.themod.registry.enchantments.Bloat;
import com.doinc.themod.registry.enchantments.Striking;

import org.apache.commons.lang3.ObjectUtils.Null;

public class ModItems {
    
    public static final Item YOUKAIDISC = new Tdisc(15, Songs.YOUKAIHARTMAN, new Item.Settings().maxCount(1).group(ItemGroup.MISC).rarity(Rarity.RARE).maxCount(1));
    public static final Item AQUAMARINE = new Item(new FabricItemSettings().group(ItemGroup.MISC).maxCount(64));
    public static final Block IGNEOUS_SPONGE = new IgneousSponge(FabricBlockSettings.of(Material.SPONGE).hardness(5F));
    private static Enchantment ADAPTIVE = Registry.register(Registry.ENCHANTMENT, new Identifier("themod", "adaptive"), new Adaptive());
    private static Enchantment BLOAT = Registry.register(Registry.ENCHANTMENT, new Identifier("themod", "bloat"), new Bloat());
    private static Enchantment STRIKING = Registry.register(Registry.ENCHANTMENT, new Identifier("themod", "striking"), new Striking());
    public static void RegisterItems() {
        Registry.register(Registry.ITEM, new Identifier(Themod.MOD_ID, "aquamarine"), AQUAMARINE);
        Registry.register(Registry.ITEM, new Identifier(Themod.MOD_ID, "disc69"), YOUKAIDISC);
        Registry.register(Registry.BLOCK, new Identifier("themod", "igneous_sponge"), IGNEOUS_SPONGE);
        Registry.register(Registry.ITEM, new Identifier("themod", "igneous_sponge"), new BlockItem(IGNEOUS_SPONGE, new Item.Settings().group(ItemGroup.MISC)));
    }
 }
