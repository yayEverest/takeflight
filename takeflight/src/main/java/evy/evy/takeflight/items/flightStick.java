package evy.evy.takeflight.items;

import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import java.util.List;

public class flightStick {
    public static ItemStack createCustomItem() {
        ItemStack item = new ItemStack(Material.STICK); // Base item
        ItemMeta meta = item.getItemMeta();
        if (meta != null) {
            meta.setDisplayName("§6Epic yap"); // Custom name
            meta.setLore(List.of("§7A powerful yap yap", "§7infused with yap."));
            item.setItemMeta(meta);
        }
        return item;
    }
}
