import java.util.*;
/*** Stella Bertoli
 * 3/10/2025
 * Pythagorean.java
 */
public class Pythagorean {
    public static void main(String [] args) {
        Scanner input = new Scanner (System.in);
        System.out.print("Enter a positive integer: ");
        int m = input.nextInt();
        input.nextLine();
        System.out.print("Enter a second positive integer that is less than the first: ");
        int n = input.nextInt();
        input.close();

        int sideOne = (m*m)-(n*n);
        int sideTwo = 2*(m*n);
        int hypo = (m*m)+(n*n);

        System.out.println("The values of the Pythagorean triplets are " + sideOne + ", " + sideTwo + ", " + hypo);
        double cost = (2.412*(double)sideOne) + (3.767*(double)sideTwo) + (15.758*(double)hypo);

        System.out.println("The cost of the Pythagorean triplet is " + cost);
        
    }
    
}
