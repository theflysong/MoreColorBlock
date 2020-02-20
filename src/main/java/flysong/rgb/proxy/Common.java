package flysong.rgb.proxy;

import flysong.rgb.Modlog;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

public class Common {
    public void preInit(FMLPreInitializationEvent event)
    {
        Modlog.logger.info("PreInit in Common");
    }

    public void init(FMLInitializationEvent event)
    {
        Modlog.logger.info("Init in Common");
    }

    public void postInit(FMLPostInitializationEvent event)
    {
        Modlog.logger.info("PostInit in Common");
    }
}
