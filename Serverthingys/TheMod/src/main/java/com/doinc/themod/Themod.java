package com.doinc.themod;

import net.fabricmc.api.ModInitializer;
import com.doinc.themod.registry.ModItems;
import com.doinc.themod.loot.fishingtable;
public class Themod implements ModInitializer {

    public static final String MOD_ID = "themod";

	@Override
    public void onInitialize() {
        ModItems.RegisterItems();
        fishingtable.addFishTable();


    }
}
