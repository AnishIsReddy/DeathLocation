package us.reddyornot;

import org.bukkit.Bukkit;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.InventoryHolder;

public class GraveInventory implements InventoryHolder{
    
    private Inventory inv;

    GraveInventory(){
        inv = Bukkit.createInventory(this, 45);
    }

    @Override
    public Inventory getInventory(){
        return inv;
    }
}
