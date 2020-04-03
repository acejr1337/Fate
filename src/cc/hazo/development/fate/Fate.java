package cc.hazo.development.fate;

import cc.hazo.development.fate.provider.FateProvider;
import lombok.Getter;
import org.bukkit.inventory.Inventory;

public class Fate extends FateProvider {

    /**
     * Created by Ace 4/04/2020
     * Project: Fate (Menu API)
     */

    @Getter public Fate fate;

    public Fate()
    {
        super("Test Menu", 1);
        fate = this;
    }
}
