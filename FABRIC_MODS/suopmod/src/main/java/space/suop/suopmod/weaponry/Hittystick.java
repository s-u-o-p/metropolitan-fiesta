package space.suop.suopmod.weaponry;

import net.minecraft.entity.EquipmentSlot;
import net.minecraft.entity.LivingEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.SwordItem;
import net.minecraft.item.ToolMaterial;

import java.util.function.Consumer;

public class Hittystick extends SwordItem {


    public Hittystick(ToolMaterial toolMaterial, int attackDamage, float attackSpeed, Settings settings) {
        super(toolMaterial, attackDamage, attackSpeed, settings);
    }


    @Override
    public boolean postHit(ItemStack stack, LivingEntity target, LivingEntity attacker) {

        stack.damage(1, (LivingEntity)attacker, (Consumer<LivingEntity>)((e) -> {
            e.sendEquipmentBreakStatus(EquipmentSlot.MAINHAND);
        }));
        target.setVelocity(0, 1.5, 0);
        attacker.setVelocity(0,2,0);
        return true;
    }

}
