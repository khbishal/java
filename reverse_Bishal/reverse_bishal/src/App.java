import java.util.*;
public class App {
    public static void main(String[] args) throws Exception {  
     Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();        
        StringBuilder reversed = new StringBuilder(input);       
        System.out.println("Reversed string: " + reversed.reverse().toString());        
        scanner.close();

}
} 
