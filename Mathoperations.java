public class Mathoperations {
    public static void main( String[] args) {
    int firstNumber= 23;
    int secondNumber= 5;
    int ModulusResult= firstNumber % secondNumber;
    int IntergerDivisionResult= firstNumber / secondNumber;
    double flaotingPointDivisionResult= (double) firstNumber / secondNumber;
    System.out.println("First number is "+firstNumber+". Second number is "+secondNumber+"");
    System.out.println(""+firstNumber+" modulus "+secondNumber+" equals "+ModulusResult+"");
    System.out.println(""+firstNumber+" divided by "+secondNumber+" using integer division equals "+IntergerDivisionResult+" ");
    System.out.println(""+firstNumber+" divided by "+secondNumber+" using floating-point division equals "+flaotingPointDivisionResult+"");
    }
}
