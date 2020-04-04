# Fate
Leightweight Menu API for Bukkit 1.7.10 -> 1.8.9

Example:

package acejr1337.test;

import cc.hazo.development.fate.provider.FateProvider;
import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.plugin.java.JavaPlugin;

import java.util.function.Consumer;

import static org.bukkit.Material.STONE;

public class Main extends JavaPlugin implements CommandExecutor {

    /**
     * Created by Ace 4/04/2020
     * Project: Testing
     */

    @Override public void onEnable() {
        this.getCommand("fateguiexample").setExecutor(this);
    }

    @Override
    public final boolean onCommand(final CommandSender sender, final Command cmd, final String label, final String[] args) {
        if (!(sender instanceof Player)) return false;

        if (cmd.getName().equalsIgnoreCase("fateguiexample")) {
            ((Player) sender).closeInventory();
            ((Player) sender).openInventory(getExampleGui());
            ((Player) sender).updateInventory();
        }
            return false;
    }
    final FateProvider provider = new FateProvider("Example GUI", 1);

    public Inventory getExampleGui() {
        provider.createInventory();
        provider.getInventory().setItem(0, new ItemStack(STONE));
        return provider.getInventory();
    }
    public Consumer<InventoryClickEvent> eventConsumer() {
        /*
         * Actions can be carried out here.
         */
        return eventConsumer();
    }
}
