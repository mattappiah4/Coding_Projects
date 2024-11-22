import java.util.*;

public class twoDArrays{
    public static void main(String []args){
    int [][]data = new int [2][3];
    Scanner input = new Scanner(System.in);
    for(int row = 0;row<2;row++){
        for(int col=0;col<3;col++){
        System.out.println("What is the number of row "+(row+1)+" and column "+(col+1));
            int num = input.nextInt();
            data[row][col] = num;
        }
    }
    System.out.println("\n DATA");
    for(int row=0;row<2;row++){
        for(int col=0;col<3;col++){
            System.out.print(data[row][col]+" ");
        }
        System.out.println();
    }
    }
}