package model;

import java.util.*;

public class Task4 {

    public Task4(){
        Task1 t1 = new Task1();
        Map<String, Long> activities = new HashMap<>();
        SortedMap<String, Integer> daysMonitored = new TreeMap<>();


        t1.getMdList().forEach(
                i -> {
                    daysMonitored.put(i.getStartTime().substring(0, 10), 0);
                    activities.put(i.getActivityLabel(), (long) 0);
                }
        );

        daysMonitored.forEach(
                (day, n) ->{
                    System.out.println("For day " + day + ":");
                    activities.forEach(
                            (activity, counter) -> {
                                counter = t1.getMdList().stream().filter(
                                        j -> (j.getStartTime().substring(0, 10).equals(day)
                                                || j.getEndTime().substring(0,10).equals(day))
                                        && j.getActivityLabel().equals(activity)
                                ).count();

                                if(counter != 0)
                                    System.out.println("-activity " + activity + " occurs " + counter + " times;");
                            }
                    );
                }
        );

    }
}
