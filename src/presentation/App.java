package presentation;

import model.*;
import java.util.*;

import static java.lang.System.exit;


public class App {

    public static void main(String[] args) {

        int menu = 0;

        try{
            while(menu < 6) {
                Scanner key = new Scanner(System.in);
                System.out.println("\nPut in a number bigger than 5 or a different character for exiting menu.");
                System.out.println("Task 1: See monitored data split into parts;");
                System.out.println("Task 2: See number of monitored days;");
                System.out.println("Task 3: See occurrence of each activity;");
                System.out.println("Task 4: See occurrence of each activity per each day;");
                System.out.println("Task 5: See time per each activity during monitoring time.");
                System.out.println("Choose task:");
                int myIn = key.nextInt();
                switch (myIn) {
                    case 1:
                        System.out.println("Splitted monitored data: ");
                        Task1 t1 = new Task1();
                        t1.printTask();
                        break;
                    case 2:
                        System.out.println("Number of days: ");
                        Task2 t2 = new Task2();
                        t2.printTask();
                        break;
                    case 3:
                        System.out.println("Occurrence of each activity: ");
                        Task3 t3 = new Task3();
                        t3.printTask();
                        break;
                    case 4:
                        System.out.println("Occurrence of each activity per each day: ");
                        new Task4();
                        break;
                    case 5:
                        System.out.println("Time for each activity per all monitoring time: ");
                        new Task5();
                        break;
                    default:
                        System.out.println("Task not existing!");
                        exit(0);
                }
            }
        } catch (InputMismatchException e){
            System.out.println("Task not existing!");
        }//*/
    }
}
