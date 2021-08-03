package us.reddyornot;

import org.bukkit.plugin.java.JavaPlugin;

public class App extends JavaPlugin {
    
    @Override
    public void onEnable() {
        getLogger().info("DeathLocation initialized");
        getServer().getPluginManager().registerEvents(new ListenerClass(), this);
    }

    @Override
    public void onDisable() {
        assert true;
    }
}

