import java.util.Scanner;

public class Lab6Task1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a positive number.");
        int num = input.nextInt();
        int counter = 1;
        
        
        while(num<=0){
            System.out.println("That number isn't valid.");
            System.out.println("Enter a number greater than 0.");
            num = input.nextInt();
            System.out.println();
    
        }while(counter <= num){
            System.out.println(counter);
            counter++;
        }

        input.close();
    }
}
