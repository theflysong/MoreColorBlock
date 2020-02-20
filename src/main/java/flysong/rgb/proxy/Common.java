package flysong.rgb.proxy;

import flysong.rgb.Modlog;
import flysong.rgb.init.BlockLoader;
import flysong.rgb.init.CTLoader;
import flysong.rgb.init.CommandLoader;
import flysong.rgb.init.ItemLoader;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.event.FMLServerStartingEvent;

public class Common {
    public void preInit(FMLPreInitializationEvent event)
    {
        Modlog.logger.info("PreInit in Common");
        new CTLoader();
        new BlockLoader();
        new ItemLoader();
    }

    public void init(FMLInitializationEvent event)
    {
        Modlog.logger.info("Init in Common");
    }

    public void postInit(FMLPostInitializationEvent event)
    {
        Modlog.logger.info("PostInit in Common");
    }

    public void serverStarting(FMLServerStartingEvent event)
    {
        new CommandLoader(event);
    }
}
