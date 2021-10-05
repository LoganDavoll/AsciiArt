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
        
        System.out.print("Type your name: ");
        String fullName = sc.nextLine();
        
        System.out.println(fullName.indexOf(" "));
        
        char firstIn = fullName.charAt(0);
        
        String result = fullName.substring(fullName.indexOf(" ")+1);
        
        System.out.println("Your name is: "+ result +", "+ firstIn +".");
    }
    
}
