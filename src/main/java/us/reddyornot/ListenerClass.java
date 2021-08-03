package us.reddyornot;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.PlayerDeathEvent;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.block.data.BlockData;


public class ListenerClass implements Listener{
    
    @EventHandler
    public void sendDeathCoords(PlayerDeathEvent event){
        Player reciever = event.getEntity();
        Location pos = reciever.getLocation();
        
        String WorldName = "";
        if (pos.getWorld().getName().equals("world")){
            WorldName = "Overworld";

        }else if (pos.getWorld().getName().equals("world_nether")){
            WorldName = "Nether";

        }else if (pos.getWorld().getName().equals("world_the_end")){
            WorldName = "End";
        }

        reciever.sendMessage(ChatColor.RED + "You died at [" + pos.getBlockX() + ", " + pos.getBlockY() + ", " + pos.getBlockZ() + "] in the " + WorldName);

        BlockData chestInfo = Bukkit.createBlockData(Material.CHEST);

        pos.getBlock().setBlockData(chestInfo);

        pos.getBlock()
    }
}
