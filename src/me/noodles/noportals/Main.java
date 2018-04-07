package me.noodles.noportals;

import org.bukkit.Bukkit;
import org.bukkit.event.Listener;
import org.bukkit.plugin.Plugin;
import org.bukkit.plugin.PluginDescriptionFile;
import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin  {

	public static Main plugin;
	
	@Override
	public void onEnable() {
		Main.plugin = this;
        PluginDescriptionFile VarUtilType = this.getDescription();
		this.saveDefaultConfig();
        this.reloadConfig();
        registerEvents((Plugin)this, new Event());
	}

	
    @SuppressWarnings({ "unchecked", "rawtypes"})
	public static Main getPlugin() {
        return (Main)getPlugin((Class)Main.class);
    }
    
    
    
    public static Plugin getPlugin2() {
        return Main.plugin;
    }
    
    
    public static void registerEvents(final Plugin plugin, final Listener... listeners) {
        for (final Listener listener : listeners) {
            Bukkit.getServer().getPluginManager().registerEvents(listener, plugin);
        }
    }
	
}
