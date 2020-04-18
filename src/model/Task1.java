package model;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Task1 {
    private List<MonitoredData> mdList = new ArrayList<>();

    public Task1(){
        String fileName = "Activities.txt";
        try(Stream<String> stream = Files.lines(Paths.get(fileName))){
            List<String> streamList = stream.collect(Collectors.toList());
            streamList.forEach(
                    (String str) -> {
                        if(str != null) {
                            final String[] strSplit = str.split("\t\t");
                            MonitoredData md = new MonitoredData(strSplit[0], strSplit[1], strSplit[2]);
                            mdList.add(md);
                        }
                    }
            );//*/
        }
        catch(IOException e){
            e.printStackTrace();
        }
    }

    public List<MonitoredData> getMdList() {
        return mdList;
    }

    public void printTask(){
        mdList.forEach(System.out::println);
    }
}
