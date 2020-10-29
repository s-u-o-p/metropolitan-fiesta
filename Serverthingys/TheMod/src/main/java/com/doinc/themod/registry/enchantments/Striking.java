package com.doinc.themod.registry.enchantments;

import com.doinc.themod.customclass.SuperEnchant;

import java.util.Random;

import net.minecraft.client.sound.Sound;
import net.minecraft.item.SwordItem;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.enchantment.EnchantmentTarget;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityGroup;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.entity.LightningEntity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.damage.DamageSource;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.SpawnEggItem;
import net.minecraft.particle.ParticleEffect;
import net.minecraft.sound.SoundCategory;
import net.minecraft.sound.SoundEvent;
import net.minecraft.sound.SoundEvents;
import net.minecraft.util.math.Vec3d;
import net.minecraft.world.World;


public class Striking extends SuperEnchant {
    int hits = 0;
    private Random random = new Random();
    public Striking() {
        super(Enchantment.Rarity.VERY_RARE, EnchantmentTarget.WEAPON, new EquipmentSlot[] {EquipmentSlot.MAINHAND});    
    }


    @Override
    public void onTargetDamaged(LivingEntity user, Entity target, int level) {
     if(target instanceof LivingEntity) {
           user.world.playSound((PlayerEntity)null, target.prevX, target.prevY, target.prevZ, SoundEvents.ENTITY_LIGHTNING_BOLT_IMPACT, SoundCategory.BLOCKS, 1.0F, (1.0F + user.world.getRandom().nextFloat() * 0.2F) * 0.7F);
     }

    }
}