package src;

import Interface.Graph;
import Interface.Itinerary;
import Interface.RoutePlanner;
import Interface.Stop;

import java.util.List;
import java.util.Map;

/**
 * Created by amaliujia on 15-1-28.
 */
public class PittsburghRoutePlanner implements RoutePlanner {

    private Graph busMap;

    private Map<String, Stop> stops;

    @Override
    public List<Stop> findStopsBySubstring(String search) {
        return null;
    }

    @Override
    public Itinerary computeRoute(Stop src, Stop dest, int time) {
        return null;
    }
}
