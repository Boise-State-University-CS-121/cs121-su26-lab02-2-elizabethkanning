import java.util.Scanner;

public class HMSConverter {
    public static void main(String[] args) 
    {
        Scanner scan = new Scanner(System.in);

        int userHours;
        int userMinutes;
        int userSeconds;
        int totalSeconds;

        System.out.print("Enter the number of hours: ");
        userHours = scan.nextInt();
        System.out.print("Enter the number of minutes: ");
        userMinutes = scan.nextInt();
        System.out.print("Enter the number of seconds: ");
        userSeconds = scan.nextInt();

        System.out.println(); //Adds row of whitespace so that my output matches the expected output exactly
        totalSeconds = userHours * 3600 + userMinutes * 60 + userSeconds;
        System.out.println("Total seconds: " + totalSeconds);

        scan.close();
    }
}
