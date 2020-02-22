package flysong.rgb.Command;

import net.minecraft.client.resources.I18n;
import net.minecraft.command.CommandBase;
import net.minecraft.command.CommandException;
import net.minecraft.command.ICommandSender;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.server.MinecraftServer;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.text.TextComponentString;

import javax.annotation.Nullable;
import java.util.List;

public class CommandRGB extends CommandBase
{
    @Override
    public String getName() {
        return "RGB";
    }

    @Override
    public String getUsage(ICommandSender sender) {
        return "commands.RGB.usage";
    }

    @Override
    public int getRequiredPermissionLevel()
    {
        return 2;
    }

    @Override
    public void execute(MinecraftServer server, ICommandSender sender, String[] args) throws CommandException {
        if(args.length != 3 && args.length != 4) {
            sender.sendMessage(new TextComponentString(I18n.format("command.args.1")));
            return;
        }
        else {
            int R = Integer.parseInt(args[0]);
            int G = Integer.parseInt(args[1]);
            int B = Integer.parseInt(args[2]);
            if (R > 255 || G > 255 | B > 255 || R<0 || G<0 || B<0) {
                sender.sendMessage(new TextComponentString(I18n.format("command.args.2")));
                return;
            }
            if(R%64>=32) {
                R-=R%64;
                R+=64;
            }
            else {
                R-=R%64;
            }
            if(G%64>=32) {
                G-=G%64;
                G+=64;
            }
            else {
                G-=G%64;
            }
            if(B%64>=32) {
                B-=B%64;
                B+=64;
            }
            else {
                B-=B%64;
            }
            if(R==256) {
                R=255;
            }
            if(G==256)
            {
                G=255;
            }
            if(B==256)
            {
                B=255;
            }
            String r,g,b;
            if(R==0) {
                r="000";
            }
            else if(R<=10) {
                r="00"+String.valueOf(R);
            }
            else if(R<=100) {
                r="0"+String.valueOf(R);
            }
            else {
                r=String.valueOf(R);
            }
            if(G==0) {
                g="000";
            }
            else if(G<=10) {
                g="00"+String.valueOf(G);
            }
            else if(G<=100) {
                g="0"+String.valueOf(G);
            }
            else {
                g=String.valueOf(G);
            }
            if(B==0) {
                b="000";
            }
            else if(B<=10) {
                b="00"+String.valueOf(B);
            }
            else if(B<=100) {
                b="0"+String.valueOf(B);
            }
            else {
                b=String.valueOf(B);
            }
            if(args.length==3) {
                getCommandSenderAsPlayer(sender).inventory.addItemStackToInventory(new ItemStack(getItemByText(sender, "rgb:"+r+"_"+g+"_"+b), 64));
            }
            else {
                getPlayer(server,sender,args[3]).inventory.addItemStackToInventory(new ItemStack(getItemByText(sender, "rgb:"+r+"_"+g+"_"+b), 64));
            }
        }
    }
}
