import java.util.*;

public class arrayRotation{
public static void main(String []args){
    Scanner input = new Scanner(System.in);
    int [] data = {12, 13, 14, 15, 17, 21};
        int k = data.length;
    int [] rotation = new int[k];

    System.out.println("How much do you want to rotate?");
    int n = input.nextInt();
        for(int i=0;i<k;i++){
            rotation[i] = data[(i+n)%k];
        }
        
        for(int i=0; i<data.length;i++){
        System.out.print(rotation[i]+" ");
        }
}
}