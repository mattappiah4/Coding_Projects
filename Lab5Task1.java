import java.util.Scanner;

public class Lab5Task1{
  public static void main (String []args){
Scanner input = new Scanner(System.in);

System.out.println("How much is your object's mass?");
double mass = input.nextDouble();
double weight = mass*9.8;

if(weight>1000){
  System.out.println("Your object is too heavy.");
}else if (weight<10){
 System.out.println("Your object is too light.");
}else{
  System.out.printf("If the mass is %.2f kilograms, then the weight is %.2f newtons", mass, weight);
}

input.close();
  }
}