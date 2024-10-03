import java.util.Scanner;

public class Lab6Task2{

    public static void main(String []args ){
    Scanner input = new Scanner(System.in);
    System.out.println("How fast was the train going (in mph)?");
    int mph = input.nextInt();
    System.out.println("How many hours were you driving for?");
    int hours = input.nextInt();
    System.out.println();
    int counter = 1;
    int distance = mph;

    while(mph<=0){
    System.out.println("\nMPH is invalid try again");
    mph = input.nextInt();
    distance = mph;
    }while(hours<0){
        System.out.println("\nHours is invalid try again.");
        hours = input.nextInt();
    }
    System.out.println("\nHours           Distance");
    System.out.println("------------------------\n");

    while(counter <= hours){
        System.out.println(counter+"                 "+distance);
        counter++;
        distance = mph*counter;

    }



    input.close();
    }
    
}
