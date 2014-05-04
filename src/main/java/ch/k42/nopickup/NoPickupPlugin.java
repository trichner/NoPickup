package ch.k42.nopickup;

import org.bukkit.plugin.java.JavaPlugin;

/**
 * Created on 04.05.14.
 *
 * @author trichner
 */
public class NoPickupPlugin extends JavaPlugin {
	@Override public void onEnable() {
		getServer().getPluginManager().registerEvents(new PickupListener(),this);
	}
}
