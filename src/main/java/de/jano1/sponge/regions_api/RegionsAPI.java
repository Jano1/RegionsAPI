package de.jano1.sponge.regions_api;

import com.google.inject.Inject;
import de.jano1.sponge.regions_api.basic_implementation.BasicRegionService;
import org.slf4j.Logger;
import org.spongepowered.api.Sponge;
import org.spongepowered.api.event.Listener;
import org.spongepowered.api.event.game.state.GameStartedServerEvent;
import org.spongepowered.api.plugin.Plugin;

@Plugin(
        id = "regions_api",
        name = "RegionsAPI",
        description = "An API for all regions!",
        authors = {
                "Jano1"
        }
)

/**
 * The main-class for this plugin with all the useful information
 */
public class RegionsAPI {

    @Inject
    private Logger logger;


    @Listener
    public void onServerStart(GameStartedServerEvent event) {
        this.logger.info("Using RegionAPI!");
        this.logger.info("Using the BasicRegionService...");
        registerProvider(this, new BasicRegionService());
    }

    /**
     * Register your Provider with this easy method
     * @param plugin_instance Your plugin instance
     * @param provider Your implementation of RegionService
     */
    public void registerProvider(Object plugin_instance, RegionService provider){
        Sponge.getServiceManager().setProvider(plugin_instance, RegionService.class, provider);
    }

}
