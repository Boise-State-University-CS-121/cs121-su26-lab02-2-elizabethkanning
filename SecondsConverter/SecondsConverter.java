import java.util.Scanner;

public class SecondsConverter {
    public static void main(String[] args) 
    {
        Scanner scan = new Scanner(System.in);

        int userSeconds;
        int hours;
        int minutes;
        int seconds;

        System.out.print("Enter the number of seconds: ");
        userSeconds = scan.nextInt();

        System.out.println(); //Adds line of whitespace so my output and expected output match

        hours = userSeconds / 3600;
        minutes = userSeconds % 3600 / 60;
        seconds = userSeconds % 3600 % 60;

        System.out.println("Hours: " + hours);
        System.out.println("Minutes: " + minutes);
        System.out.println("Seconds: " + seconds);

        scan.close();
    }
}
