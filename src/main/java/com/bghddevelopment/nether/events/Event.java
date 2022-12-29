package com.bghddevelopment.nether.events;

import com.bghddevelopment.nether.AntiNetherPortals;
import com.bghddevelopment.nether.util.Color;
import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerPortalEvent;
import org.bukkit.event.player.PlayerTeleportEvent;


public class Event implements Listener {

    @EventHandler
    public static void onPortalTravel(final PlayerPortalEvent event) {
        Player player = event.getPlayer();
        if (event.getCause() == PlayerTeleportEvent.TeleportCause.NETHER_PORTAL) {
            event.setCancelled(true);
            player.sendMessage(Color.translate(AntiNetherPortals.getPlugin().getConfig().getString("Message")));
        }
    }

}
