package flysong.rgb.init;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

public class BlockLoader {
    public static final Block a1 = new Block(Material.ROCK).setUnlocalizedName("rgbColorBlock").setRegistryName("000_000_000").setCreativeTab(CTLoader.ColorBlock);
    public BlockLoader()
    {
        MinecraftForge.EVENT_BUS.register(this);
    }

    @SubscribeEvent
    public static void Loader(RegistryEvent.Register<Block> event) {
        event.getRegistry().registerAll(a1);
    }
}
