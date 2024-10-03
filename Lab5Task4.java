import java.util.Scanner;

public class Lab5Task4{
  public static void main (String []args){
Scanner input = new Scanner(System.in);

System.out.println("Please enter a number in between 1-5.");
int num = input.nextInt();



if(num>5 || num<1){
System.out.println("Can't cumpute?!?!");
}

switch (num) {
case 1:
  System.out.println("The Roman numeral is I");
  break;
  case 2:
  System.out.println("The Roman numeral is II");
  break;
  case 3:
  System.out.println("The Roman numeral is III");
  break;
  case 4:
  System.out.println("The Roman numeral is IV");
  break;
  case 5:
  System.out.println("The Roman numeral is V");
  break;
  default:
    System.out.println("Out of range...");
}
input.close();
  }
}