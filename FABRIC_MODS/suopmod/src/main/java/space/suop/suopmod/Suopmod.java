package space.suop.suopmod;

import net.fabricmc.api.ModInitializer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import space.suop.suopmod.materials.HittyStickMaterial;
import space.suop.suopmod.weaponry.Hittystick;

public class Suopmod implements ModInitializer {

    public static Hittystick HITTY_STICK = new Hittystick(HittyStickMaterial.INSTANCE, 0, -1.0F, new Item.Settings().group(ItemGroup.COMBAT));


    @Override
    public void onInitialize() {

        Registry.register(Registry.ITEM, new Identifier("suopmod", "hitty_stick"), HITTY_STICK);

    }
}
