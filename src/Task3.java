import java.util.Scanner;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
public class Task3 {
    public static void main(String[] args) {
        /*Write a program that reads the departure time of
        a train and the arrival time and computes
        and displays the trip time.
        (Example: for Departure time 10:50 and Arrival time 12:10 the trip
        time will be 1 hr and 20 min)*/
        Scanner scanner = new Scanner(System.in);
        System.out.println("Calculate The Trip Time (Example Time Format 10:12)");
        System.out.print("Enter Deprature Time(HH:mm): ");
        String deprature_time = scanner.nextLine();
        System.out.print("Enter Arrival Time(HH:mm): ");
        String arrival_time = scanner.nextLine();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm");
        LocalTime t1 = LocalTime.parse(deprature_time,formatter);
        LocalTime t2 = LocalTime.parse(arrival_time,formatter);
        LocalTime trip_time = t2.minusHours(t1.getHour()).minusMinutes(t1.getMinute());
        System.out.printf("Trip Time Will be %d hr and %d min",
                trip_time.getHour(),
                trip_time.getMinute()
                );



    }
}
