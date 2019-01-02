package com.sudoplay.mc.watercan.event;

import com.sudoplay.mc.watercan.ModWatercan;
import net.minecraftforge.common.config.Config;
import net.minecraftforge.common.config.ConfigManager;
import net.minecraftforge.fml.client.event.ConfigChangedEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

@Mod.EventBusSubscriber(modid = ModWatercan.MOD_ID)
public class ConfigChangedEventHandler {

  @SubscribeEvent
  public static void onConfigChangedEvent(ConfigChangedEvent.OnConfigChangedEvent event) {

    if (event.getModID().equals(ModWatercan.MOD_ID)) {
      ConfigManager.sync(ModWatercan.MOD_ID, Config.Type.INSTANCE);
    }
  }

}
