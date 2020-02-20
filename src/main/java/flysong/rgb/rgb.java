package flysong.rgb;

import flysong.rgb.proxy.Common;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import static flysong.rgb.Modlog.*;

@Mod(modid = rgb.MODID,name = rgb.NAME,version = rgb.VERSION,acceptedMinecraftVersions = "1.12.2")
public class rgb {
    public static final String MODID = "rgb";
    public static final String NAME = "More Color Block";
    public static final String VERSION = "1.0.0";

    @Mod.Instance(rgb.MODID)
    public static rgb instance;

    @SidedProxy(serverSide = "flysong.rgb.proxy.Common",
            clientSide = "flysong.rgb.proxy.Client")
    public static Common proxy;

    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event)
    {
        logger = event.getModLog();
        logger.info("PreInit in DarkAges");
        proxy.preInit(event);
    }

    @Mod.EventHandler
    public void init(FMLInitializationEvent event)
    {
        Modlog.logger.info("Init in DarkAges");
        proxy.init(event);
    }

    @Mod.EventHandler
    public void postInit(FMLPostInitializationEvent event)
    {
        Modlog.logger.info("PostInit in DarkAges");
        proxy.postInit(event);
    }
}
