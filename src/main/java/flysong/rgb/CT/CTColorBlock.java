package flysong.rgb.CT;

import flysong.rgb.init.BlockLoader;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;

public class CTColorBlock extends CreativeTabs {
    public CTColorBlock()
    {
        super("colorBlock");
    }

    @Override
    public ItemStack getTabIconItem() {
        return new ItemStack(BlockLoader.a1);
    }
}
