package com.doinc.themod.registry.enchantments;

import com.doinc.themod.customclass.SuperEnchant;

import net.minecraft.enchantment.Enchantment;
import net.minecraft.enchantment.EnchantmentTarget;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityGroup;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.entity.LightningEntity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.damage.DamageSource;
import net.minecraft.item.SpawnEggItem;
import net.minecraft.util.math.Vec3d;
import net.minecraft.world.World;


public class Striking extends SuperEnchant {
    int hits = 0;
    public Striking() {
        super(Enchantment.Rarity.VERY_RARE, EnchantmentTarget.WEAPON, new EquipmentSlot[] {EquipmentSlot.MAINHAND});    
    }


    @Override
    public void onTargetDamaged(LivingEntity user, Entity target, int level) {
     if(target instanceof LivingEntity) {
         hits++;
         System.out.printf("The value of", hits);
         if (hits == 3) {
            System.out.println("poot");
            LightningEntity ze = new LightningEntity(null, null);
            double x = target.getPos().x;
            double y = target.getPos().y;
            double z = target.getPos().z;
            ze.setPos(x, y, z);
            hits = 0;
         }
         }
     }



}