package evy.evy.takeflight.commands;

import evy.evy.takeflight.items.flightStick;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.command.CommandExecutor;
import org.bukkit.entity.Player;

public class GiveItemCommand implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (sender instanceof Player player) {
            player.getInventory().addItem(flightStick.createCustomItem());
            player.sendMessage("§aYou have received the yap!");
            return true;
        }
        sender.sendMessage("§cOnly players can use this command!");
        return true;
    }
}
