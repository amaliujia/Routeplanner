package src;

import Interface.RoutePlanner;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

/**
 * Created by amaliujia on 15-1-28.
 */
public class main {

    public static final String path = "src/Data/oakland_stop_times.txt";

    //public Scanner scanner =  null;

    public static void main(String args[]){
        PittsburghRoutePlannerBuilder builder = new PittsburghRoutePlannerBuilder();

        try {
            RoutePlanner routePlanner = builder.build(path, 1200);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


}
