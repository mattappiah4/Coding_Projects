import java.io.*;
import java.util.*;

public class scannerFile{
    public static void main(String []args)
    throws FileNotFoundException
    {
    Scanner input = new Scanner(System.in);
    
    System.out.println("What is the name of the file you want to type into?");
    String fileName = input.next();
    PrintStream output = new PrintStream(fileName);

 System.out.println("What would you like to write into it?");
    for(int i = 1; i<=18; i++){
        String word = input.next();
        output.println(word);
    }


    }
}