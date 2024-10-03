import java.util.Scanner;

public class Lab5Task2{
  public static void main (String []args){
Scanner input = new Scanner(System.in);
double retail = 99.00;
System.out.println("Each package is $99. How many are you buying?");
int quantity = input.nextInt();
double total = retail*quantity;
double dis20 = total-(total*0.2);
double dis30 = total-(total*0.3);
double dis40 = total-(total*0.4);
double dis50 = total-(total*0.5);


if(quantity>=10 && quantity<=19){
  System.out.printf("You also get a 20 percent discount! Your total is %.2f", dis20);
}else if(quantity>=20 && quantity<=49){
  System.out.printf("You also get a 30 percent discount! Your total is %.2f", dis30);
} else if(quantity>=50 && quantity<=99){
  System.out.printf("You also get a 40 percent discount! Your total is %.2f", dis40);
}else if(quantity>=100){
  System.out.printf("You also get a 50 percent discount! Your total is %.2f", dis50);
}else{
  System.out.printf("Okay your total is %.2f", total);
}




input.close();
  }
}