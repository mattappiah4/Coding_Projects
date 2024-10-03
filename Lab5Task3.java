import java.util.Scanner;

public class Lab5Task3{
  public static void main (String []args){
Scanner input = new Scanner(System.in);

System.out.println("How many calories and fat grams are in your food item?");
double calories = input.nextDouble();
double fat = input.nextDouble();
double calsFat = fat*9;
double calPerc = calsFat/calories;

System.out.printf("30 percent of Calories: %.2f",0.3*calories);
System.out.println("\nCalories from fat: " +calsFat);

if(calsFat>calories){
System.out.println("Your input is invalid try again...");
}else if(calsFat<(0.3*calories)){
  System.out.println("Your food is low in fat.");
}else{
  System.out.printf("The percentage of calories from fat is %.2f percent",calPerc);
}



input.close();
  }
}