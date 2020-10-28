package space.suop.fuckyou.client;

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

@Environment(EnvType.CLIENT)
public class FuckyouClient implements ClientModInitializer {

    public static final Item FABRIC_ITEM = new Item(new FabricItemSettings().group(ItemGroup.MISC));

    @Override
    public void onInitializeClient() {

        Registry.register(Registry.ITEM, new Identifier("fuckyou","fuck_you"), FABRIC_ITEM);

    }
}
