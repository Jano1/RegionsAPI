package de.jano1.sponge.regions_api.basic_implementation;

import de.jano1.sponge.regions_api.Region;
import de.jano1.sponge.regions_api.RegionService;
import org.spongepowered.api.world.Location;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

/**
 * Created by Jano1 on 02.07.2017.
 */
public class BasicRegionService implements RegionService{

    private List<Region> regions;

    public BasicRegionService(){
        regions = new ArrayList<>();
    }

    @Override
    public Region[] getRegions() {
        return (Region[]) regions.toArray();
    }

    @Override
    public Optional<Region> getRegionWithID(String region_id) {
        for(Region r : regions){
            if(r.getID().equals(region_id)){
                return Optional.of(r);
            }
        }
        return Optional.empty();
    }

    @Override
    public void addRegion(Region region) {
        for(Region r : regions){
            if(r.getID().equals(region.getID())){
                return;
            }
        }
        regions.add(region);
    }

    @Override
    public void removeRegion(String region_id) {
        for(Region r : regions){
            if(r.getID().equals(region_id)){
                regions.remove(r);
            }
        }
    }

    @Override
    public Region[] getRegionsFor(Location location) {
        List<Region> to_return = new ArrayList<>();
        for(Region r : regions){
            if(r.containsLocation(location)){
                to_return.add(r);
            }
        }
        return (Region[]) to_return.toArray();
    }
}
