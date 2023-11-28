public class App {
    public static void main(String[] args) throws Exception {
       int dividend = 10;
       int divisor = 0;
       try {
        if(divisor == 0) {
            throw new DivideByZeroException();
        }
        int quotient = dividend/ divisor;
        System.out.println("Quotient: "+quotient);
       } catch (ArithmeticException e) {
        System.out.println("Error: "+e.getMessage());
       }
    }
}
class DivideByZeroException extends Exception {
    public DivideByZeroException() {
        super("Custom Divide by zero error.");
    }
    public DivideByZeroException(String message) {
        super(message);
    }
}