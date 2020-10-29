package com.doinc.themod.registry.enchantments;

import net.minecraft.enchantment.DamageEnchantment;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.enchantment.EnchantmentTarget;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityGroup;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.damage.DamageSource;
import net.minecraft.text.MutableText;
import net.minecraft.text.Text;
import net.minecraft.text.TranslatableText;
import net.minecraft.util.Formatting;

import com.doinc.themod.customclass.SuperEnchant;
import com.doinc.themod.registry.enchantments.Adaptive;

public class Bloat extends SuperEnchant {

   public Bloat() {
      super(Enchantment.Rarity.VERY_RARE, EnchantmentTarget.WEAPON, new EquipmentSlot[] {EquipmentSlot.MAINHAND});
   }

     @Override
     public int getMaxLevel() {
     return 3;
     }

     @Override
     public void onTargetDamaged(LivingEntity user, Entity target, int level) {
        if (target instanceof LivingEntity) {
           target.damage(DamageSource.DROWN, this.getAttackDamage(level, EntityGroup.DEFAULT) + level * 1F);
           System.out.println(this.getAttackDamage(level, EntityGroup.DEFAULT));
        }
     }
}