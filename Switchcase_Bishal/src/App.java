import java.util.*;
public class App {
    public static void main(String[] args) throws Exception {
     Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number (1-7) to represent the day");
        int dayNumber = scanner.nextInt();
        String dayName;
        switch (dayNumber) {
            case 1:
                dayName = "Sunday";
                break;
            case 2:
                dayName = "Monday";
                break;
            case 3:
                dayName = "Tuesday";
                break;
            case 4:
                dayName = "Wednesday";
                break;
            case 5:
                dayName = "Thursday";
                break;
            case 6:
                dayName = "Friday";
                break;
            case 7:
                dayName = "Saturday";
                break;
            default:
                dayName = "Invalid day";
                break;
        }

        System.out.println("Day of the week: " + dayName);
        scanner.close();
}
}
