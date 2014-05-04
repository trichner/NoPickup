package ch.k42.nopickup;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.CreatureSpawnEvent;

/**
 * Created on 04.05.14.
 *
 * @author trichner
 */
public class PickupListener implements Listener {
	@EventHandler
	public void onSpawn(CreatureSpawnEvent event){
		event.getEntity().setCanPickupItems(false);
	}
}
