import java.util.*;

public class methods{
    public static void main(String []args){
        Scanner input = new Scanner(System.in);
     char repeat;
   do{
    System.out.println("What is the value of your first number?");
    int num1 = input.nextInt();
    System.out.println("What is the value of your second number?");
    int num2 = input.nextInt();
    showSum(num1, num2);
    System.out.println("Would you like to restart and add 2 new numbers? Y/N");
    String answer = input.next();
    repeat = answer.charAt(0);
    }while(repeat == 'Y' || repeat == 'y');
    }
    public static int showSum(int num1, int num2){
        int answer=num1+num2;
        System.out.println("The sum of "+num1+" and "+num2+" is "+answer);
        return answer;
    }
}