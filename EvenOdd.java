import java.util.Scanner;

public class EvenOdd{
  public static void main (String []args){
Scanner input = new Scanner(System.in);

System.out.println("Please enter a number");
int num = input.nextInt();

if(num%2<=0){
System.out.println("Your number is even!");
}else{
  System.out.println("Your number is odd!");
}


input.close();
  }
}