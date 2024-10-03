import java.util.Scanner;

public class Lab6Task3{
    public static void main (String []args ){
        Scanner input = new Scanner(System.in);

        System.out.println("What is the starting number of organisms?");
        double organ = input.nextDouble();
        while(organ<2){
            System.out.println("Can't have less than 2 starting organisms, try again.");
            organ = input.nextDouble();
        }
        System.out.println("\nWhat is their daily population increase percentage?");
        double perc = input.nextDouble();
        while(perc<=0){
            System.out.println("Percentage can't be negative or 0. Try again.");
            perc=input.nextDouble();
        }
        System.out.println("\nHow many days will they multiply?");
        int day = input.nextInt();
        while(day<=1){
            System.out.println("You need to have more than one day. Try again.");
            day=input.nextInt();
        }
        System.out.println("\n Day         Organisms\n-----------------------");
        for(int i = 1; i<=day; i++){
            System.out.println(i+"\t\t"+organ);
            organ=(perc*organ)+organ; 
        }


        input.close();
    }
}
