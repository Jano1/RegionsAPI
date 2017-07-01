package de.jano1.sponge.regions_api;

import com.google.inject.Inject;
import org.slf4j.Logger;
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
public class RegionsAPI {

    @Inject
    private Logger logger;


    @Listener
    public void onServerStart(GameStartedServerEvent event) {
        this.logger.info("Using RegionAPI!");
    }

}
