package flysong.rgb.init;

import flysong.rgb.rgb;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

import static flysong.rgb.init.BlockLoader.*;

@Mod.EventBusSubscriber(modid = rgb.MODID)
public class ItemLoader {
    public static final Item Ia1 = new ItemBlock(a1).setRegistryName(a1.getRegistryName());

    public ItemLoader()
    {
        MinecraftForge.EVENT_BUS.register(this);
    }

    @SubscribeEvent
    public static void Loader(RegistryEvent.Register<Item> event) {
        event.getRegistry().registerAll(Ia1);
    }
}
