import java.util.*;
public class secondLargest{
    public static void secLargest(int [] a){
    int max = 0;
    int secLarge = 0;
   
        for(int num : a){
            if(num>max){
                secLarge = max;
                max = num;
            }
        }

    System.out.println("Second largest value: "+secLarge);


        }
    
    public static void main(String[] args) {
   Scanner input = new Scanner(System.in);
   int [] data = new int[6];
   for(int i=0;i<data.length;i++){
    System.out.println("What is value "+(i+1));
    int num = input.nextInt();
    data[i]=num;
   }
   secLargest(data);
    }
}
