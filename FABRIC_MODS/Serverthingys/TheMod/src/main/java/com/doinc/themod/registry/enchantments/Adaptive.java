package com.doinc.themod.registry.enchantments;

import org.lwjgl.opengl.GREMEDYFrameTerminator;

import net.minecraft.enchantment.DamageEnchantment;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.enchantment.EnchantmentTarget;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityGroup;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.damage.DamageSource;
import net.minecraft.text.MutableText;
import net.minecraft.text.Text;
import net.minecraft.text.TranslatableText;
import net.minecraft.util.Formatting;

import com.doinc.themod.customclass.SuperEnchant;
import com.doinc.themod.registry.enchantments.Bloat;

public class Adaptive extends SuperEnchant {


    public Adaptive() {
        super(Enchantment.Rarity.VERY_RARE, EnchantmentTarget.WEAPON, new EquipmentSlot[] {EquipmentSlot.MAINHAND});
        }

    @Override
    public int getMinPower(int level) {
        return 1;
    }


    @Override
    public int getMaxLevel() {
    return 5;
    }

    @Override
    public boolean isAvailableForEnchantedBookOffer() {
        return false;
     }
  
    @Override
    protected boolean canAccept(Enchantment other) {
        return this != other;
     }

    @Override
    public float getAttackDamage(int level, EntityGroup group) {
     if (group != EntityGroup.DEFAULT) {
        return (float) 0.625F * level;
     } else {
        return 0F;
     }
    }
}