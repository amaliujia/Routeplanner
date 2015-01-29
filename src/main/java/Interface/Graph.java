package Interface;

import java.util.List;

/**
 * Created by amaliujia on 15-1-28.
 */
public interface Graph {
    public boolean adjacent(Stop src, Stop des);

    public List<Stop> neighbors(Stop s);

    public void add(Stop a, Stop b);

    public void delete(Stop a, Stop b);

    public void getNodeValue(Stop s);

    public void setNodeValue(Stop s, double time);
}
