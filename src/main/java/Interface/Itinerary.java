package Interface;

/**
 * Created by amaliujia on 15-1-28.
 */
public interface Itinerary {
    public String name = null;

    public int getStartTime();

    public int getEndTime();

    public int getWaitTime();

    public Stop getStartLocation();

    public Stop getEndLocation();

    public String getInstructions();

}
