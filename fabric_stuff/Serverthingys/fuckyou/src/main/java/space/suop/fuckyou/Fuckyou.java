package space.suop.fuckyou;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class Fuckyou implements ModInitializer {

    public static final Item FABRIC_ITEM = new Item(new FabricItemSettings().group(ItemGroup.MISC));


    @Override
    public void onInitialize() {

        Registry.register(Registry.ITEM, new Identifier("fuckyou", "fuck_you"), FABRIC_ITEM);

    }
}
