package src;

import Interface.Graph;
import Interface.Stop;

import java.util.List;

/**
 * Created by amaliujia on 15-1-28.
 */
public class GraphMatrix implements Graph {

    private int vertexSize;



    public GraphMatrix(int size){
        vertexSize = size;
    }


    @Override
    public boolean adjacent(Stop src, Stop des) {
        return false;
    }

    @Override
    public List<Stop> neighbors(Stop s) {
        return null;
    }

    @Override
    public void add(Stop a, Stop b) {

    }

    @Override
    public void delete(Stop a, Stop b) {

    }

    @Override
    public void getNodeValue(Stop s) {

    }

    @Override
    public void setNodeValue(Stop s, double time) {

    }
}
