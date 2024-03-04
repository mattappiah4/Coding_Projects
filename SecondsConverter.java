public class SecondsConverter{
    static int totalSeconds = 765454;
    static int Hours = totalSeconds/3600;
    static int remainderSec = totalSeconds - (Hours * 3600);
    static int Minutes = remainderSec/60;
    static int Seconds = remainderSec - (Minutes * 60);

public static void main( String[] args) {
    System.out.println("You entered " + totalSeconds + " seconds.");
    System.out.println(+totalSeconds+ " seconds would be " +Hours+ " hours, " +Minutes+ " minutes, and "+Seconds+ " seconds.");
    
}
     


}