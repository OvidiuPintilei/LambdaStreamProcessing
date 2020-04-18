package model;

import java.time.Duration;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Task5 {

    public Task5(){
        Task1 t1 = new Task1();
        DateTimeFormatter format = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");

        t1.getMdList().forEach(
                i -> {
                    LocalDateTime dateTime1 = LocalDateTime.parse(i.getStartTime(), format);
                    LocalDateTime dateTime2 = LocalDateTime.parse(i.getEndTime(), format);

                    long diffInSeconds = Duration.between(dateTime1, dateTime2).getSeconds();
                    long minutes, seconds = diffInSeconds%60, hours;
                    String minString ="", secString="", hString="";

                    minutes = diffInSeconds/60;

                    hours = minutes/60;
                    if(hours != 0){
                        minutes = minutes % 60;
                    }

                    if(seconds != 0) {
                        secString = seconds + " sec ";
                    }

                    if(minutes != 0){
                        minString = minutes + " min ";
                    }

                    if(hours != 0){
                        hString = hours + " h ";
                    }

                    System.out.println(i.getActivityLabel() + ": " + hString + minString + secString);

                }
        );//*/

    }
}
