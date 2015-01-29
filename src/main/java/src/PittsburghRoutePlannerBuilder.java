package src;

import Interface.RoutePlanner;
import Interface.RoutePlannerBuilder;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import java.util.TreeMap;

/**
 * Created by amaliujia on 15-1-28.
 */
public class PittsburghRoutePlannerBuilder implements RoutePlannerBuilder {


    @Override
    public RoutePlanner build(String filename, int maxWaitLimit) throws IOException{
        RoutePlanner routePlanner = new PittsburghRoutePlanner();



        Scanner scanner = new Scanner(new File(filename));

        String line = "";
        int count = -1;
        while (scanner.hasNext()){
            line = scanner.nextLine();
            String[] args = line.split(",");
            if(count == -1 && args.length == 2){
                count = Integer.parseInt(args[1]);
                String name = args[0];


            }else if(count > 0){

            }else if(count == 0){

            }else{
                System.err.println(line);
                System.exit(0);
            }
        }

        return routePlanner;
    }
}
