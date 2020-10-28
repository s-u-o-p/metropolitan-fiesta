package com.doinc.themod.customclass;

// Enchantment reference
import net.minecraft.enchantment.Enchantments;
import net.minecraft.item.FishingRodItem;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.text.MutableText;
import net.minecraft.text.Text;
import net.minecraft.text.TranslatableText;
import net.minecraft.util.Formatting;
import net.minecraft.enchantment.DamageEnchantment;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.enchantment.EnchantmentTarget;

public class SuperEnchant extends Enchantment {

    private final boolean issuperenchant = true;
    protected SuperEnchant(Rarity weight, EnchantmentTarget type, EquipmentSlot[] slotTypes) {
		super(weight, type, slotTypes);
    }
    
    @Override
    protected boolean canAccept(Enchantment other) {
        return !(other instanceof SuperEnchant);
    }

    @Override
    public boolean isCursed() {
        return true;
    }
    @Override
    public boolean isAvailableForEnchantedBookOffer() {
        return false;
     }
  
     @Override
     public boolean isAvailableForRandomSelection() {
        return false;
     }

    @Override
    public Text getName(int level) {
        MutableText mutableText = new TranslatableText(this.getTranslationKey());
        mutableText.formatted(Formatting.STRIKETHROUGH, Formatting.YELLOW);
        if (level != 1 || this.getMaxLevel() != 1) {
           mutableText.append(" ").append((Text)(new TranslatableText("enchantment.level." + level)));
        }
  
        return mutableText;
     }

}