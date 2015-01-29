package Interface;

import java.util.List;

/**
 * Created by amaliujia on 15-1-28.
 */
public interface RoutePlanner {

    public List<Stop> findStopsBySubstring(String search);

    public Stop findStopByName(String name);

    public Itinerary computeRoute(Stop src, Stop dest, int time);
}
