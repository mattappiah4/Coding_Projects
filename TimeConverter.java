import java.util.Scanner;

public class TimeConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Input number of seconds
        System.out.print("Enter the number of seconds: ");
        int totalSeconds = scanner.nextInt();
        
        // Calculate hours, minutes, and remaining seconds
        int hours = totalSeconds / 3600;
        int remainingSeconds = totalSeconds % 3600;
        int minutes = remainingSeconds / 60;
        int seconds = remainingSeconds % 60;
        
        // Print the result
        System.out.println("\nConverted Time:");
        System.out.println("Hours: " + hours);
        System.out.println("Minutes: " + minutes);
        System.out.println("Seconds: " + seconds);
        
        scanner.close();
    }
}