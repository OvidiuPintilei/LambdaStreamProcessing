package model;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Task3 {

    private Map<String, Integer> freq = new HashMap<>();

    public Task3(){
        Task1 t1 = new Task1();
        List<String> actList = new ArrayList<>();

        t1.getMdList().forEach(
                i -> actList.add(i.getActivityLabel())
        );

        actList.forEach(
                i -> {
                    Integer count = freq.get(i);
                    freq.put(i, (count == null) ? 1 : count + 1);
                }
        );
    }

    public Map<String, Integer> getFreq() {
        return freq;
    }

    public void printTask(){
        freq.forEach(
                (activity, count) ->
                        System.out.println("Activity " + activity + " "
                                + "occurs"
                                + ": " + count + " times"));
    }
}
