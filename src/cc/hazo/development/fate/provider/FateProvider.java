package cc.hazo.development.fate.provider;

import lombok.Getter;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.inventory.Inventory;

public class FateProvider implements IFate {

    /**
     * Created by Ace 4/04/2020
     * Project: Fate (Menu API)
     */
    @Getter
    private final String name;
    @Getter
    private final int rows;
    @Getter
    private final Inventory inventory;

    public FateProvider(String name, int rows) {
        this.name = ChatColor.translateAlternateColorCodes('&', name);
        this.rows = rows * 9;
        this.inventory = Bukkit.createInventory(null, rows, name);
    }

    public final Inventory getInventory() {return inventory;}

    @Override
    public String getName() { return name; }

    @Override
    public int getRows() { return rows; }

    @Override
    public void createInventory() { new FateProvider(getName(), getRows()); }
}
