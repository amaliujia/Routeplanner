package Interface;

/**
 * Created by amaliujia on 15-1-28.
 */
public interface RoutePlannerBuilder {

    public RoutePlanner build(String filename, int maxWaitLimit);
}
