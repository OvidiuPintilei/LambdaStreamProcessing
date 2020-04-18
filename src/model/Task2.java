package model;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.ZoneId;
import java.time.temporal.ChronoUnit;
import java.util.*;

public class Task2 {

    private long noOfDays = 0;

    public Task2() {
        Task1 t1 = new Task1();
        List<String> dates = new ArrayList<>();

        t1.getMdList().forEach(
                i ->{
                    dates.add(i.getStartTime().substring(0, 10));
                    dates.add(i.getEndTime().substring(0, 10));
                }
        );
        noOfDays = dates.stream().distinct().count();
    }

    public void printTask(){
        System.out.println(noOfDays);
    }
}
