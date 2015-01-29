package Interface;

import java.io.IOException;

/**
 * Created by amaliujia on 15-1-28.
 */
public interface RoutePlannerBuilder {

    public RoutePlanner build(String filename, int maxWaitLimit) throws IOException;
}
