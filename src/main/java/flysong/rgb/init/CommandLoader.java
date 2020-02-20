package flysong.rgb.init;

import flysong.rgb.Command.CommandRGB;
import net.minecraftforge.fml.common.event.FMLServerStartingEvent;

public class CommandLoader
{
    public CommandLoader(FMLServerStartingEvent event)
    {
        event.registerServerCommand(new CommandRGB());
    }
}
