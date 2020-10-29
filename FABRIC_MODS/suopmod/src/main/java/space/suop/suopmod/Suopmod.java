package space.suop.suopmod;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Material;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import space.suop.suopmod.blocks.Bouncepad;
import space.suop.suopmod.materials.HittyStickMaterial;
import space.suop.suopmod.weaponry.Hittystick;

public class Suopmod implements ModInitializer {

    public static Hittystick HITTY_STICK = new Hittystick(HittyStickMaterial.INSTANCE, 0, -1.0F, new Item.Settings().group(ItemGroup.COMBAT));
    public static final Bouncepad BOUNCE_PAD = new Bouncepad(FabricBlockSettings.of(Material.METAL).hardness(2.0F))

    @Override
    public void onInitialize() {

        Registry.register(Registry.ITEM, new Identifier("suopmod", "hitty_stick"), HITTY_STICK);
        Registry.register(Registry.BLOCK, new Identifier("suopmod", "bounce_pad"), BOUNCE_PAD);
        Registry.register(Registry.ITEM, new Identifier("suopmod","bounce_pad"), new BlockItem(BOUNCE_PAD, new Item.Settings().group(ItemGroup.REDSTONE)));

    }
}
