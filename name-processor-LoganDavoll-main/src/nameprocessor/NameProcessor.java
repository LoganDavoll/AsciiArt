package nameprocessor;

import java.util.Scanner;

/**
 *
 * @author ldavoll
 */
public class NameProcessor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Please enter your name: ");
        String fullName = sc.nextLine();
        
        char firstIn = fullName.charAt(0);
        System.out.println(firstIn);
        
    }
    
}
