package com.doinc.themod.registry;

import com.doinc.themod.registry.Disc;
import com.doinc.themod.Themod;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.registry.Registry;
import net.minecraft.util.Identifier;
import net.minecraft.util.Rarity;
import net.minecraft.block.SmithingTableBlock;
import com.doinc.themod.registry.enchantments.Adaptive;
import com.doinc.themod.registry.enchantments.Bloat;
import com.doinc.themod.registry.enchantments.Striking;

import org.apache.commons.lang3.ObjectUtils.Null;

public class ModItems {

    public static final Item AQUAMARINE = new Item(new FabricItemSettings().group(ItemGroup.MISC).maxCount(64));
    private static Enchantment ADAPTIVE = Registry.register(Registry.ENCHANTMENT, new Identifier("themod", "adaptive"), new Adaptive());
    private static Enchantment BLOAT = Registry.register(Registry.ENCHANTMENT, new Identifier("themod", "bloat"), new Bloat());
    private static Enchantment STRIKING = Registry.register(Registry.ENCHANTMENT, new Identifier("themod", "striking"), new Striking());
    public static void RegisterItems() {
        Registry.register(Registry.ITEM, new Identifier(Themod.MOD_ID, "aquamarine"), AQUAMARINE);
    }
 }
