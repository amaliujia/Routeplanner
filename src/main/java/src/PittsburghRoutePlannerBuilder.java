package src;

import Interface.RoutePlanner;
import Interface.RoutePlannerBuilder;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

/**
 * Created by amaliujia on 15-1-28.
 */
public class PittsburghRoutePlannerBuilder implements RoutePlannerBuilder {

    @Override
    public RoutePlanner build(String filename, int maxWaitLimit) throws IOException{
        RoutePlanner routePlanner = new PittsburghRoutePlanner();

        Scanner scanner = new Scanner(new File(filename));
    }
}
