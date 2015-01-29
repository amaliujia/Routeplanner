package src;

import Interface.Graph;
import Interface.Itinerary;
import Interface.RoutePlanner;
import Interface.Stop;

import java.util.List;

/**
 * Created by amaliujia on 15-1-28.
 */
public class PittsburghRoutePlanner implements RoutePlanner {

    Graph busMap;

    @Override
    public List<Stop> findStopsBySubstring(String search) {
        return null;
    }

    @Override
    public Itinerary computeRoute(Stop src, Stop dest, int time) {
        return null;
    }
}
