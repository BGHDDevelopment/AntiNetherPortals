package me.noodles.noportals;

import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerPortalEvent;
import org.bukkit.event.player.PlayerTeleportEvent;


public class Event implements Listener {

	
	static String Message;
	
	 public Event() {
	        this.Message = ChatColor.translateAlternateColorCodes('&', Main.getPlugin().getConfig().getString("Messages.Message"));
	
	 } 
	 
	    @EventHandler
	    public static void onPortalTravel(final PlayerPortalEvent event) {
	    	Player p = event.getPlayer();
	        if (event.getCause() == PlayerTeleportEvent.TeleportCause.NETHER_PORTAL) {
	            event.setCancelled(true);
	            p.sendMessage(String.valueOf(Message));
	        }
	    }
	
}
