package src;

import Interface.Graph;
import Interface.Itinerary;
import Interface.RoutePlanner;
import Interface.Stop;

import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/**
 * Created by amaliujia on 15-1-28.
 */
public class PittsburghRoutePlanner implements RoutePlanner {

    private Graph busMap;

    private Map<String, Stop> stops;

    public PittsburghRoutePlanner(){
        stops = new TreeMap<String, Stop>();
    }

    @Override
    public List<Stop> findStopsBySubstring(String search) {
        return null;
    }

    @Override
    public Stop findStopByName(String search) {
        if(stops.containsKey(search)){
            return stops.get(search);
        } else {
            return null;
        }
    }

    @Override
    public Itinerary computeRoute(Stop src, Stop dest, int time) {
        return null;
    }
}
